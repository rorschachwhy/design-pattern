package com.why.design.principle.leetcode;

import java.util.*;

public class Main {
    public int majorityElement(int[] nums) {

        int temp  = nums[0];
        int count = 0;

        for (int num : nums) {
            if (count == 0) {
                temp = num;
            }
            if (temp == num) {
                count++;
            } else {
                count--;
            }
        }
        return temp;
    }
}
