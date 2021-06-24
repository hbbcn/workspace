package com.atguigu.map;

import org.junit.Test;

import javax.sound.midi.Soundbank;
import java.util.*;

/**
 *@ClassName MapTest
 *@Description
 *  \---Map:双列数据，存储key-value对的数据   ---类似于高中学的函数：y = f(x)
 *          \---HashMap:作为Map的主要实现类：线程不安全，效率高 存储null的Key和value
 *                  \---LinkedHashMap;保证在遍历map元素时，可以按照添加的顺序实现遍历。
 *                                      原因：在原有的HashMap底层结构基础上，添加了一对指针，指向前一个元素和后一个元素
 *                                         对于频繁的遍历操作，此类执行效率高于HashMap。
 *          \---TreeMap;保证按照添加的key-value对进行排序，实现排序遍历 此时考虑key的自然排序和定制排序
 *                       底层使用红黑树
 *          \---Hashtable：作为古老实现类：线程安全，效率低，不能存储null的Key和values
 *                  \---Properites：常用来处理配置文件。key和value都是String类型
 *
 *     HashMap的底层：数组+链表 (jdk7及之前）
 *                    数组+链表+红黑树（jdk8)
 *
 *    面试题
 *   1.HashMap的底层实现原理？
 *
 *   2.HashMap 和 Hashtable的异同？
 *   3.currentHashMap 与 Hashtable的异同？（展示不讲）
 *
 *   二、Map结构的理解：
 *       Map中的Key：无序的、不可重复的。使用Set存储所有的key --->所在类要重写equals()和hashCode()方法(以HashMap()为例)
 *       Map中的value:无序的可重复的，使用Collection存储所有的value --->需要重写所在类的equals();
 *       一个键值对：key-value:构成一个Entry对象。
 *       Map中的entry:无序的，不可重复的，使用Set存储所有的entry
 *
 *    三、HashMap的底层实现原理？ 以jdk7为例
 *          HashMap map = new HashMap();
 *          在实例化以后，底层创建了长度是16的一维数组Entry[] table.
 *          map.put(key1,value1);
 *          首先，调用key1所在类的hashCode()计算key1哈希值，此哈希值经过某种计算以后，得到在Entry数组中存放位置。
 *          如果此位置上的数据为空，此时的key1-value1添加成功。 ---情况1
 *          如果此位置上的数据不为空，(意味着此位置上存在一个或多个数据(以链表形式存在)),比较key1和已经存在的一个或多个数据
 *          的哈希值：
 *                  如果key1的哈希值与已经存在的数据(key1-value2)哈希值都不相同，此时key1-value1添加成功。---情况2
 *                  如果key1的哈希值和已经存在的某一个数据的哈希值相同，继续比较：调用key1所在类的equals()方法，比较：
 *                             如果equals()返回false:此时key1-value1添加成功。---情况3
 *                             如果equals()返回true：使用value1替换value2.
 *                  补充：关于情况2和情况3：此时key1-value1和原来的数据以链表的形式存储。
 *
 *                  在不断的添加过程中，会涉及到扩容问题，默认的扩容方式为原来的2倍，并将原来的数据复制到过来。
 *
 *
 *            jdk8 相较于jdk7在底层实现方面的不同：
 *            1.new HashMap:底层没有创建一个长度为16的数组.
 *            2.jdk 8底层数组是：Node[],而非Entry[].
 *            3.首次调用put方法时，底层创建长度为16的数组
 *            4.jdk7底层结构只有： 数组+链表. jdk 8中底层结构： 数组+链表+红黑树。
 *                 当数组的某一个索引位置上的元素以链表的形式存在的数据个数 > 8 且当前数据的数组长度 > 64,
 *                 此时索引位置上的所有的数据改为使用红黑树存储
 *
 *                BEFAULT_INITAL_CAPACITY: HashMap的默认值：16
 *                DEFAULT_LOAD_FACTOR: HashMap的默认加载因子：0.75
 *                threshold:扩容的临界值 = 容量 * 填充因子：16 * 0.75 => 12
 *                TREEIFA_THRESHOLD: Bucket中链表的长度大于该默认值，转化为红黑树：8
 *                MIN_TREEIFA_CAPACITY: 桶中的Node被树化时最小的hash表的容量：64
 *
 *
 *            四、LinkedHashMap的底层实现原理(了解)
 *
 *
 *
 *
 *            五、Map中定义的方法
 *
 *
 * 总结：常用方法
 *  添加：put(Object key,Object value)
 *  删除：remove(Object key)
 *  修改：put(Object key, Object value)
 *  查询：get(Object key)
 *  长度：size()
 *  遍历：keySet() / values() /  entrySet()
 *
 *
 *@Author HuangQingbin
 *@Date 2021/6/18 17:21
 *@Version 1.0
 */
public class MapTest{
    /*
     无视图操作方法：
     Set keySet(): 返回所有构成Set集合
     Collection values():返回所有value构成的Collection集合
     Set entrySet():返回所有key-value对构成的Set集合
   */
    @Test
    public void test4(){

        Map map = new HashMap();
        map.put("AA", 123);
        map.put(45,1234);
        map.put("BB",56);

        //遍历所有的key集：keySet()

        //Set set = map.keySet();
        Iterator iterator = map.keySet().iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
        //遍历所有的value集：values()
        Collection values = map.values();

        for(Object obj : values){
            System.out.println(obj);
        }
//        System.out.println(values);
        System.out.println("*********");

        //遍历所有的key-value
        //方式一：entrySet
        System.out.println();
        Set entrySet = map.entrySet();
        Iterator iterator1 = entrySet.iterator();


//        System.out.println("*********");
////        System.out.println(entrySet);

        while (iterator1.hasNext()){

        // System.out.println(iterator1.next());
            Object obj = iterator1.next();

            Map.Entry entry = (Map.Entry) obj;
            System.out.println(entry.getKey() + "---->" + entry.getValue());
        }
        System.out.println();
        //方式二
        Set keySet = map.keySet();
        Iterator iterator2 = keySet.iterator();
        while(iterator2.hasNext()){
            Object key = iterator2.next();
            Object value = map.get(key);
            System.out.println(key + "===" + value);
        }


    }

/*
    添加删除修改的操作：
    Object put(Object key, Object value): 将指定key-value添加（或修改）
 */
    @Test
    public void test3(){
        Map map = new HashMap();
        map.put("AA",123);
        map.put(45,123);
        map.put("BB",56);
        //Object get(Object key)
        System.out.println(map.get(45));
        //containsKey(Object key)
        boolean isExist = map.containsKey("BB");
        System.out.println(isExist);

        isExist = map.containsValue(123);
        System.out.println(isExist);

        map.clear();
        System.out.println(map.isEmpty());


    }



   @Test
    public void test2(){

        Map map = new HashMap();
        //添加
        map.put("AA",123);
        map.put(45,123);
        map.put("BB",123);
        //修改
        map.put("AA",87);
       System.out.println(map);

       Map map1 = new HashMap();
       map.put("CC",123);
       map.put("DD",123);

       map1.putAll(map);
       System.out.println(map1);

       //remove(Object key)

        Object value = map1.remove("CC");
       System.out.println(map1);

       //clear()
       map.clear();//清空数据，并非清除map
       System.out.println(map.size());
       System.out.println(map);



    }



    @Test
    public void test1(){

        Map map = new HashMap();
       //map = new Hashtable();
        map.put(null,null);
    }
}

