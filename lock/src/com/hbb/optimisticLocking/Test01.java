package com.hbb.optimisticLocking;

import java.util.concurrent.atomic.AtomicMarkableReference;

/**
 * @ClassName Testo1
 * @Description TODO
 * @Author hqb
 * @Date 2022/4/25 14:17
 * @Version 1.0
 */
public class Test01 {
    /**
     * initialRef- 初始参考 - cat
     * initialMark- 初始标记 - false
     */
    static AtomicMarkableReference<String> atomicStampedReference = new AtomicMarkableReference("cat", false);
    public static void main(String[] args) {
        // public boolean isMarked() 返回标记的当前值。
        boolean oldMarked = atomicStampedReference.isMarked();
        //public V getReference() 返回参考的当前值。
        String oldReference = atomicStampedReference.getReference();
        System.out.println("初始化之后的标记：" + oldMarked);
        System.out.println("初始化之后的值：" + oldReference);
        System.out.println("==============================================");
        String newReference = "dog";
        boolean b = atomicStampedReference.compareAndSet(oldReference, newReference, true, false);
        if (!b) {
            System.out.println("Mark不一致，无法修改Reference的值");
        }
        b = atomicStampedReference.compareAndSet(oldReference, newReference, false, true);
        if (b) {
            System.out.println("Mark一致，修改reference的值为dog");
        }
        System.out.println("修改成功之后的Mark：" + atomicStampedReference.isMarked());
        System.out.println("修改成功之后的值：" + atomicStampedReference.getReference());
    }

}

