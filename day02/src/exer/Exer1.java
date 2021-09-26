package exer;

import org.junit.Test;

import javax.xml.transform.Source;
import java.util.*;

/**
 *@ClassName Exer1
 *@Description  TODO
 *@Author HuangQingbin
 *@Date 2021/7/27 9:20
 *@Version 1.0
 */
public class Exer1{

    @Test
    public void test1() {

        List list1 = Arrays.asList("123", "345", "abc",123);
        List list = new ArrayList(list1);
        list.add(12);
//        System.out.println(list1.get(1));

        //方式二:
        for (Object obj : list1) {
            System.out.println(obj);
        }
        System.out.println("**************");
        Iterator iterator = list1.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }

    @Test
    public void test2(){
        Map<String,String> hashMap = new HashMap();
        hashMap.put("key1","value1");
        hashMap.put("key2","value2");
        hashMap.put("key3","value3");
        hashMap.put("key4","value4");

//        System.out.println(hashMap);
        for (Map.Entry<String,String> entry : hashMap.entrySet()){
            System.out.println(entry);
        }
        System.out.println("***********");
        //遍历所有的key值
        Set<String> strings = hashMap.keySet();
        for (String str : strings){
            System.out.println(str);
        }

        System.out.println("************");
        //遍历所有的value值
        Collection<String> values = hashMap.values();
        for (String val : values){

            System.out.println(val);
        }

        //遍历所有的key-value
        //方式1：
        System.out.println("_________________");
        Set<Map.Entry<String, String>> entries = hashMap.entrySet();
        System.out.println(entries);
        Iterator<Map.Entry<String, String>> iterator = entries.iterator();
        while (iterator.hasNext()){
//            Set<String> strings1 = hashMap.keySet();
//            String val = hashMap.get(strings);
//            System.out.println(iterator.next());
            Map.Entry<String, String> next = iterator.next();
            System.out.println(next.getKey()+"---->" + next.getValue());
//            System.out.println(strings1 + "--->" + val);
        }

        //方式二：


        System.out.println("&&&&&&&&&&");
        Set<String> strings1 = hashMap.keySet();
        Iterator<String> iterator1 = strings1.iterator();
        while (iterator1.hasNext()){
            String next = iterator1.next();
            String s = hashMap.get(next);
            System.out.println(next+ "----->" + s);

        }




    }




}

