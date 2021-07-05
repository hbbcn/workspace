package com.cn.listcode;

import javax.imageio.metadata.IIOMetadataFormatImpl;
import java.awt.*;

/**
 *@ClassName ListCode
 *@Description  TODO
 *@Author HuangQingbin
 *@Date 2021/6/30 21:57
 *@Version 1.0
 */
public class ListNode {

    int val;//数据：节点数据
    ListNode next;  //对象：引用下一个节点对象
    public ListNode(int val){
        this.val = val;

    }


    public ListNode() {

    }
}

class Test {
    public static void main(String[] args) {
        ListNode head = new ListNode(0);//创建首节点
        ListNode strNode;
        strNode = head;

    //创建链表
        for (int i = 1; i <10; i++) {
            ListNode listNode = new ListNode(i);
            head.next =listNode;
            head = listNode;
        }


        print(strNode);


    }
    static void print(ListNode listNode){

        while (listNode != null){
            System.out.println(listNode.val);
            listNode = listNode.next;
        }
    }
}




