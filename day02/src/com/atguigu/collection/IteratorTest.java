package com.atguigu.collection;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 *@ClassName IteratorTest
 *@Description
 * 1.集合元素的遍历操作，使用迭代器Iterator接口
 *
 * 2. 集合对象每次调用iterator方法都得到一个全新的迭代器对象，默认的游标都在集合的第一个元素之前
 * 3.内部定义了remove方法，可以在遍历的时候，删除集合中的元素，此方法不同于，集合直接调用remove()
 * 如果还未调用next()或上一次调用next()方法以后了remove()方法，再调用remove都会报IllegakStateException.
 * @Author HuangQingbin
 * @Date 2021/6/4 20:56
 * @Version 1.0
 */
public class IteratorTest{
        @Test

        public void test() {

            Collection coll = new ArrayList();
            coll.add(123);
            coll.add(456);
            coll.add(new String("Tom"));
            coll.add(new Person("Jerry", 20));

            System.out.println(coll.toString());

            Iterator iterator = coll.iterator();

            //方式一：
//        System.out.println(iterator.next());
//        System.out.println(iterator.next());
//        System.out.println(iterator.next());
//        System.out.println(iterator.next());
//
//        //抛异常
//        System.out.println(iterator.next());

            //方式二：

//        for (int i = 0; i < coll.size(); i++) {
//            System.out.println(iterator.next());
//          }

            //方式三：推荐  hasNext()判断是否还有下一个元素 //next()①指针下移
            while (iterator.hasNext()) {
                System.out.println(iterator.next());
            }

            //错误方式一
//            while (coll.iterator().hasNext()){
//                System.out.println(coll.iterator().next());
//            }
            //错误方式二
//            Iterator iterator1 = coll.iterator();
//            while(iterator1.hasNext() != null){
//                System.out.println(iterator1.next());
//            }
        }

            //测试Iterator中的remove()
            @Test
              public void test3(){
                Collection coll = new ArrayList();
                coll.add(123);
                coll.add(456);
                coll.add(new String ("Tom"));
                coll.add(new Person("Jerry",20));

                Iterator iterator = coll.iterator();

                while(iterator.hasNext()){
                    Object obj = iterator.next();
                    if("Tom".equals(obj)){
                        iterator.remove();
                    }
                }

              Iterator iterator1 = coll.iterator();
                while (iterator1.hasNext()){
                    System.out.println(iterator1.next());
                }

            }






}

