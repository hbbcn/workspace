package com.test;

import java.util.*;

/**
 *@ClassName Solution
 *@Description  TODO
 *@Author hqb
 *@Date 2022/3/26 21:30
 *@Version 1.0
 */
public class Solution01 {

    Integer key;
    Integer value;

    public Solution01(Integer key, Integer value) {
        this.key = key;
        this.value = value;
    }

    public ArrayList<Integer> heap_top_k (ArrayList<Integer> nums, int k) {
        // write code here
        Map<Object, Object> map = new HashMap<>();
        //统计数字出现概率
        for (int i = 0; i < nums.size(); i++) {
            if (map.containsKey(nums.get(i))){
                map.put(nums.get(i), map.get(nums.get(i) + 1));
            }else {
                map.put(nums.get(i), 1);
            }
        }

        Iterator<Map.Entry<Object, Object>> iter = map.entrySet().iterator();
         Queue<Solution01> queue = new PriorityQueue<>(k, new Comparator<Solution01>() {
            @Override
            public int compare(Solution01 o1, Solution01 o2) {
                return o1.value-o2.value;
            }
        });
        int cnt = 0;
        while (iter.hasNext()){
            Map.Entry entry = (Map.Entry)iter.next();
            Solution01 tmp = new Solution01((Integer) entry.getKey(), (Integer) entry.getValue());
            if (cnt < k){ //k大小优先队列
                queue.add(tmp);
            }else if (tmp.value > queue.peek().value){ //
                queue.poll();
                queue.add(tmp);
            }
            cnt++;
        }

        ArrayList<Integer> ret = new ArrayList<>();
        for (int i = 0; i < k; i++) {
            ret.add(0,queue.poll().key);
        }
        return ret;
    }
}

