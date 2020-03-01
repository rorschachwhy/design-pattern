package com.why.design.principle.singleresponsibility;

import java.awt.event.WindowListener;

/**
 * @Author: wanghaiyang
 * @Date: 2020/3/1 5:14 PM
 * @Description:
 */
public class Test {

//    public static void main(String[] args) {
//        Bird bird = new Bird();
//        bird.mainMoveMode("大雁");
//        bird.mainMoveMode("鸵鸟");
//    }


    public static void main(String[] args) {
        FlyBird flyBird = new FlyBird();
        flyBird.mainMoveMode("大雁");

        WalkBird walkBird = new WalkBird();
        walkBird.mainMoveMode("鸵鸟");
    }
}
