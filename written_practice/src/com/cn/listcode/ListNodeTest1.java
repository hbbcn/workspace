package com.cn.listcode;

import com.sun.source.doctree.SystemPropertyTree;

/**
 *@ClassName test
 *@Description  TODO
 *@Author HuangQingbin
 *@Date 2021/7/5 11:49
 *@Version 1.0
 */
public class ListNodeTest1 {

    int val;
    ListNodeTest1 next;

    public ListNodeTest1(){

    }
    public ListNodeTest1(int val) {
        this.val = val;
    }
}

class test1{

    public static void main(String[] args) {

        ListNodeTest1 head = new ListNodeTest1(0);
        ListNodeTest1 str;
        str = head;

        for (int i = 1; i <10; i++) {
            ListNodeTest1 listNodeTest1 = new ListNodeTest1(i);

            head.next = listNodeTest1;
            head = listNodeTest1;
        }
        print(str);
    }

    static void print(ListNodeTest1 listNode){

        while (listNode != null){
            System.out.println(listNode.val);
            listNode = listNode.next;
        }
    }

}


