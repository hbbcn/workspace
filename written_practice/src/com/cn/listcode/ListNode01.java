package com.cn.listcode;


/**
 * @ClassName ListNode01
 * @Description TODO
 * @Author hqb
 * @Date 2021/9/6 20:10
 * @Version 1.0
 */

public class ListNode01 {

    public int val;
    public ListNode01 next;

    public ListNode01(int val) {
        this.val = val;
    }

    public ListNode01() {
    }
}

class ListNodeTest01 {
    static ListNode01 node01 = new ListNode01(0);

    public static void main(String[] args) {

        ListNode01 node = node01;
        for (int i = 1; i < 10; i++) {
            ListNode01 obj = new ListNode01(i);
            node.next = obj;
            node = obj;
        }
        list();

    }

    public static void list() {
        while (node01 != null) {
            System.out.println(node01.val);
            node01 = node01.next;
        }
    }
}

