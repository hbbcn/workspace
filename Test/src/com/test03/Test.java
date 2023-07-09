package com.test03;

/**
 * @BelongsProject: workspace
 * @BelongsPackage: com.test03
 * @Author: hqb
 * @CreateTime: 2022/11/1 15:29
 * @Description: TODO
 * @Version: 1.0
 */
public class Test {
    int x, y;
    Test(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public static void main(String[] args) {
        Test pt1, pt2;
        pt1 = new Test(3, 3);
        pt2 = new Test(4, 4);
        System.out.print(pt1.x + pt2.x);
    }
}
