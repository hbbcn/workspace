package exer;
/**
 *@ClassName LockObject
 *@Description  TODO
 *@Author HuangQingbin
 *@Date 2021/6/23 12:13
 *@Version 1.0
 */
public class LockObject {

    static Object A=new Object();

    static Object B=new Object();

    public static boolean islock=true;

}

 class ThreadA extends Thread{

    @Override

    public void run() {

        while(true){

            try {

                Thread.sleep(1000);

            } catch (InterruptedException e) {

                e.printStackTrace();

            }

            synchronized (LockObject.A){

                if (LockObject.islock){

                    try {

                   LockObject.A.wait();   //释放LockObject中A对象，给其它线程让出资源

                    } catch (InterruptedException e) {

                        e.printStackTrace();

                    }

                }

                System.out.println("ThreadA lock A ok!");

                System.out.println("ThreadA  ready to lock B....");

                synchronized (LockObject.B){

                    System.out.println("ThreadA lock B ok!");

                       //通知其它线程可以开始对LockObject中B对象加锁了

                    LockObject.islock= true;//设置LockObject中的islock值，该值表示对象被加锁了

                }

            }

        }

    }

}

class ThreadB extends Thread{

    @Override

    public void run() {

        while(true){

            try {

                Thread.sleep(1000);

            } catch (InterruptedException e) {

                e.printStackTrace();

            }

            synchronized (LockObject.B){

                if (!LockObject.islock){

                    try {

                        LockObject.B.wait();//释放LockObject中B对象，给其它线程让出资源

                    } catch (InterruptedException e) {

                        e.printStackTrace();

                    }

                }

                System.out.println("ThreadB lock B ok!");

                System.out.println("ThreadB  ready to lock A....");

                synchronized (LockObject.A){

                    System.out.println("ThreadB lock A ok!");

                   LockObject.B.notifyAll();//通知其它线程可以开始对LockObject中A对象加锁了

                    LockObject.islock=false;

                }

            }

        }

    }

}

 class TestDeadLock {

    public static void main(String[] args) {

        ThreadA ta=new ThreadA();

        ThreadB tb=new ThreadB();

        ta.start();

        tb.start();

    }

}

