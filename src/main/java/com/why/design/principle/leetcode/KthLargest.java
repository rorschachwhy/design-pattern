package com.why.design.principle.leetcode;

import javafx.scene.layout.Priority;

import java.util.PriorityQueue;

/**
 * @Author: wanghaiyang
 * @Date: 2020/10/26 1:19 下午
 * @Description:
 */
public class KthLargest {

    private PriorityQueue<Integer> queue;
    private int length;

    public KthLargest(int k, int[] nums) {
        queue = new PriorityQueue<Integer>();
        length = nums.length;
    }

    public int add(int val) {
        if (queue.size() < length) {
            queue.offer(val);
        } else if (val > queue.peek()) {
            queue.poll();
            queue.offer(val);
        }
        return queue.peek();
    }
}
