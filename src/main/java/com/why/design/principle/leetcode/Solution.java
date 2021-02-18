package com.why.design.principle.leetcode;

class Solution {

    public double myPow(double x, int n) {
        // 因为int范围是[-2^31,2^31-1]负数的表示范围比正数大，所以不能直接用 -n 来代入求解，需要用long代替
        // 并且这里不能是包装类的Long，要是基础的long
        long N = n;
        return n < 0 ? mul(x, N) : 1 / mul(x, N);

    }

    private double mul(double x, long n) {
        double res = 1.0;

        if (n == 0) {
            return 1.0;
        }
        // 这种写错了，因为要平方的不是x，而是递归的子项
        // return n % 2 == 0? mul(x, n / 2) * x * x : mul(x, n / 2) * x * x * x;

        double y = mul(x, n / 2);
        return n % 2 == 0 ? y * y : y * y * x;
    }

}