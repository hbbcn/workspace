package com.atguigu.compare.comparable;
/**
 *@ClassName Employees
 *@Description  TODO
 *@Author hqb
 *@Date 2022/4/26 23:24
 *@Version 1.0
 */
//Comparable相当于外部比较器 也称为自然排序
public class Employees implements Comparable<Employees> {
    public String name;
    public int id;

    public Employees(String name, int id) {
        this.name = name;
        this.id = id;

    }
    @Override
    public String toString() {
        return "Employees{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }

    @Override
    public int compareTo(Employees o) {
        int compare = this.name.compareTo(o.name);
        System.out.println(compare);
        if (compare == 0){
//            System.out.println("this.id - o.id = "  + (this.id - o.id));
           return -Integer.compare(this.id,o.id);
//            return (this.id - o.id);
        }
        return compare;
    }
}


