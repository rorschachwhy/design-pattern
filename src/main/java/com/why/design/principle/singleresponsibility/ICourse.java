package com.why.design.principle.singleresponsibility;

/**
 * @Author: wanghaiyang
 * @Date: 2020/3/1 5:24 PM
 * @Description:
 */
public interface ICourse {

    String getCourseName();
    byte[] getCourseVideo();

    void studyCourse();
    void refundCourse();
}
