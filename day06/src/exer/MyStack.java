package exer;

import java.util.LinkedList;

/**
 *@ClassName MyStack
 *@Description  TODO
 *@Author HuangQingbin
 *@Date 2021/6/23 11:54
 *@Version 1.0
 */
public class MyStack <T>{

    int count; //栈中元素的个数

              LinkedList<T> list;         //使用泛型声明一个LinkedList的集合 list



    public int size(){

         return count;            //返回栈中元素的个数

    }



    public void push(T o){ //向栈中插入元素
            list.addFirst(o);//使用方法addFisrt()向栈中插入元素

        count++;

    }



    public T pop(){//删除栈顶元素并返回，栈空时不能pop

        if(count>0){

            count--;

         return list.pop();   //删除栈顶元素并返回

        }else{

            return null;

        }



    }

    public String toString(){

        return "MyStack[]"+list.toString();

    }



    public static void main(String[] args) {

        MyStack<String> ms = new MyStack();//使用泛型创建栈对象ms

        System.out.println("-------size()--------"+ms.size());

        ms.push("北京");

        ms.push("河南");

        ms.push("上海");

        ms.push("山东");

        System.out.println("-------size()--------"+ms.size());

        System.out.println(ms);

        System.out.println(ms.pop());

        System.out.println(ms.pop());

        System.out.println(ms.pop());

        System.out.println(ms.pop());

        System.out.println(ms.pop());


    }


}

