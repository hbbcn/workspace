package com.generic.test;

/**
 * @ClassName Pair
 * @Description TODO
 * @Author huang.qingbin
 * @Date 2023/2/15 10:18
 * @Version 1.0
 */
public class Pair<T> {
    public static void main(String[] args) {
        Number number =  new Integer(1);
        System.out.println(number);
        System.out.println(PairHelper.add(new Pair<Integer>(1, 2)));
        Pair<Number> numberPair = new Pair<Number>(new Pair<Integer>(1, 2));
    }
    private T first;
    private T last;

    Pair<? extends T> aa;

    public Pair(Pair<? extends T> aa) {
        this.aa = aa;
    }

    public Pair(T first, T last) {
        this.first = first;
        this.last = last;
    }

    public Pair<? extends T> getAa() {
        return aa;
    }

    public void setAa(Pair<? extends T> aa) {
        this.aa = aa;
    }




    public T getFirst() {
        return first;
    }
    public T getLast() {
        return last;
    }

    public void setFirst(T first) {
        this.first = first;
    }
    public void setLast(T last) {
        this.last = last;
    }
}

class PairHelper {
//    PairHelper.add(new Pair<Integer>(1, 2)) 调用该方法时会报错 因为Pair<Number>只能传入Number的值

  /*  static int add(Pair<Number> p){
        Number first = p.getFirst();
        Number last = p.getLast();
        return first.intValue() + last.intValue();
    }*/
//    有没有办法使得方法参数接受Pair<Integer>？办法是有的，
//    这就是使用Pair<? extends Number>使得方法接收所有泛型类型为Number或Number子类的Pair类型。
//    我们把代码改写如

 static int add(Pair<? extends Number> p) {
  Number first = p.getFirst();
  Number last = p.getLast();

  //这是因为实际的返回类型可能是Integer，也可能是Double或者其他类型，编译器只能确定类型一定是Number的子类（包括Number类型本身），但具体类型无法确定。
//  Integer x = p.getFirst();

     //编译错误发生在p.setFirst()传入的参数是Integer类型。
     // 有些童鞋会问了，既然p的定义是Pair<? extends Number>，
     // 那么setFirst(? extends Number)为什么不能传入Integer？
     //原因还在于擦拭法。如果我们传入的p是Pair<Double>，
     //显然它满足参数定义Pair<? extends Number>，
     //然而，Pair<Double>的setFirst()显然无法接受Integer类型。

     //这就是<? extends Number>通配符的一个重要限制：
     // 方法参数签名setFirst(? extends Number)
     // 无法传递任何Number类型给setFirst(? extends Number)
//     p.setFirst(1);
//     p.setFirst(1);
  return first.intValue() + last.intValue();

 }

}
