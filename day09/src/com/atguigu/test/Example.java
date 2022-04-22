package com.atguigu.test;

import java.util.HashSet;

/**
 *@ClassName RectObject
 *@Description  TODO
 *@Author hqb
 *@Date 2021/12/28 19:19
 *@Version 1.0
 */
class RectObject {
    public int x;
    public int y;
    public RectObject(int x, int y)
    { this.x = x; this.y = y; }
    @Override public boolean equals(Object obj)
    {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final RectObject other = (RectObject) obj;
        if (x != other.x) { return false;
        }
        if (y != other.y)
        { return false;
        } return true;
    }
} public class Example
{ public static void main(String[] args)
{ HashSet<RectObject> set = new HashSet<RectObject>();
RectObject r1 = new RectObject(3, 3); RectObject r2 = new RectObject(5, 5); RectObject r3 = new RectObject(3, 3); set.add(r1); set.add(r2); set.add(r3); set.add(r1); System.out.println("size:" + set.size()); } }

