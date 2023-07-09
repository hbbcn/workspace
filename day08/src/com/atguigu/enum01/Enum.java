package com.atguigu.enum01;
/**
 *@ClassName Enum
 *@Description  TODO
 *@Author hqb
 *@Date 2021/10/24 20:45
 *@Version 1.0
 */
public class Enum {

}
    enum AccountType
    {
        SAVING, FIXED, CURRENT,AGE,CODE;
        private AccountType()
        {
            System.out.println("It is a account type");

            System.out.println("!!!!!!!!");
        }

    }
    class EnumOne
    {
        public static void main(String[]args)
        {
            System.out.println(AccountType.FIXED);
        }

    }


