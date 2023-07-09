package com.aiguigu.exer;
/**
 *@ClassName AccountTest
 *@Description
 * 银行有个账户。
 * 有两个储户分别向同一账户个存3000元，每次存1000，存三次，每次存完打印账户余额
 *
 *
 *@Author HuangQingbin
 *@Date 2021/5/27 18:09
 *@Version 1.0
 */
public class AccountTest{


    public static void main(String[] args) {


        Account acct = new Account(0);
        Customer c = new Customer(acct);
        Customer c1= new Customer(acct);



        c.setName("甲");
        c1.setName("乙");

        c.start();
        c1.start();
    }
}

 class Customer extends Thread{


     private Account acct;

     public Customer(Account acct) {
         this.acct = acct;
     }

     @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            acct.deposit(1000);

        }


    }
}

class Account{

    private static double balance;

    public Account(double balance){
        this.balance = balance;
    }

    public synchronized void deposit(double amt){
        if(amt > 0){
            balance += amt;
        }
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + "存钱成功 当前余额为" + balance);
    }



}

