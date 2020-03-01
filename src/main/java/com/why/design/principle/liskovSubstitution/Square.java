package com.why.design.principle.liskovSubstitution;

/**
 * @Author: wanghaiyang
 * @Date: 2020/3/1 10:07 PM
 * @Description:
 */
//public class Square extends Rectangle{
public class Square implements Quadrangle{
    private long sideLength;


    public long getWidth() {
        return sideLength;
    }

    public long getLength() {
        return sideLength;
    }

    public long getSideLength() {
        return sideLength;
    }

    public void setSideLength(long sideLength) {
        this.sideLength = sideLength;
    }
}
