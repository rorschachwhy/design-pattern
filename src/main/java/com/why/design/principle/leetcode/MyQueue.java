package com.why.design.principle.leetcode;

import java.util.Deque;
import java.util.LinkedList;

/**
 * @Author: wanghaiyang
 * @Date: 2020/10/20 12:39 下午
 * @Description:
 */
public class MyQueue {

    private Deque<Integer> s1 = new LinkedList<Integer>();
    private Deque<Integer> s2 = new LinkedList<Integer>();
    private Integer front;

    /** Initialize your data structure here. */
    public MyQueue() {
        // Initialize
    }

    /** Push element x to the back of queue. */
    public void push(int x) {
        if (s1.isEmpty()) {
            front = x;
        }
        s1.push(x);
    }

    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        if (s2.isEmpty()) {
            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }
        }
        return s2.pop();
    }

    /** Get the front element. */
    public int peek() {
        if (!s2.isEmpty()) {
            return s2.peek();
        } else {
            return front;
        }

    }

    /** Returns whether the queue is empty. */
    public boolean empty() {
//        if (s1.isEmpty() && s2.isEmpty()) {
//            return true;
//        } else {
//            return false;
//        }
        return s1.isEmpty() && s2.isEmpty();
    }
}
