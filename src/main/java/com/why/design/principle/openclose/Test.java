package com.why.design.principle.openclose;

import java.math.BigDecimal;

/**
 * @Auther: wanghaiyang
 * @Date: 20/2/25 15:39
 * @Description:
 */
public class Test {
    public static void main(String[] args) {
        ICourse iCourse = new JavaDiscountCourse(96, "Java从零到企业级电商开发", new BigDecimal(348));

        JavaDiscountCourse javaCourse = (JavaDiscountCourse) iCourse;

        System.out.println("课程ID：" + javaCourse.getId() + "，课程名称" + javaCourse.getName()
//                + " ，课程原价" + javaCourse.getOriginPrice() + "，课程折后价格" + javaCourse.getPrice());
                + " ，课程原价" + javaCourse.getPrice() + "，课程折后价格" + javaCourse.getDiscountPrice());
    }
}