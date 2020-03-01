package com.why.design.principle.singleresponsibility;

/**
 * @Author: wanghaiyang
 * @Date: 2020/3/1 5:15 PM
 * @Description:
 */
public class Bird {

    public void mainMoveMode(String birdName) {

        if ("鸵鸟".equals(birdName)) {
            System.out.println(birdName + "用脚走");
        } else {
            System.out.println(birdName + "用翅膀飞");

        }

    }
}
