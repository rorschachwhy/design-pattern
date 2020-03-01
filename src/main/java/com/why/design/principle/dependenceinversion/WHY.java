package com.why.design.principle.dependenceinversion;/**
 * @Author: wanghaiyang
 * @Date: 2020/3/1 4:46 PM
 * @Description:
 */

public class WHY {

//    V1
//    public void studyJavaCourse() {
//        System.out.println("WHY在学习Java课程");
//    }
//
//    public void studyFECourse() {
//        System.out.println("WHY在学习FE课程");
//    }

//    V2
//    public void studyCourse(ICourse iCourse) {
//        iCourse.studyCourse();
//    }



    private ICourse iCourse;

//    public WHY(ICourse iCourse) {
//        this.iCourse = iCourse;
//    }

    public void setiCourse(ICourse iCourse) {
        this.iCourse = iCourse;
    }


    public void studyCourse() {
        iCourse.studyCourse();
    }

}
