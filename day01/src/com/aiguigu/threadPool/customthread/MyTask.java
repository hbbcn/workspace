package com.aiguigu.threadPool.customthread;

/**
 * @ClassName MyTask
 * @Description 自定义线程池练习 这是任务类需要实现Runnable接口
 *              包含任务编号，每个任务执行时间为0.2秒
 * @Author huang.qingbin
 * @Date 2023/7/8 22:21
 * @Version 1.0
 **/
public class MyTask implements Runnable {
    private final int id;

    //由于run方法是重写接口的方法，因此id这个属性初始化可以利用构造器完成
    public MyTask(int id){
        this.id= id;
    }

    @Override
    public void run() {

        //获取当前线程名
        String name = Thread.currentThread().getName();
        System.out.println("线程: " + name + "即将执行任务：" + id);
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("线程：" + name +"线程完成了任务：" + id);

    }

    @Override
    public String toString() {
        return "MyTask{" +
                "id=" + id +
                '}';
    }
}
