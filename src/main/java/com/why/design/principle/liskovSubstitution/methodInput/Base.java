package com.why.design.principle.liskovSubstitution.methodInput;

import java.util.HashMap;

/**
 * @Author: wanghaiyang
 * @Date: 2020/3/1 10:27 PM
 * @Description:
 */
public class Base {
    public void method(HashMap map) {
        System.out.println("父类被执行");
    }
}
