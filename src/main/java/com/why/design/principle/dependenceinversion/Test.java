package com.why.design.principle.dependenceinversion;

/**
 * @Author: wanghaiyang
 * @Date: 2020/3/1 4:49 PM
 * @Description:
 */
public class Test {
//    public static void main(String[] args) {
//
//         V1
//
//        WHY why = new WHY();
//        why.studyJavaCourse();
//        why.studyFECourse();
//
//    }

//    V2
//    public static void main(String[] args) {
//        WHY why = new WHY();
//
//        why.studyCourse(new JavaCourse());
//        why.studyCourse(new FECourse());
//        why.studyCourse(new PyCourse());
//
//    }

////    V3 构造器注入
//    public static void main(String[] args) {
//        WHY why = new WHY(new JavaCourse());
//        why.studyCourse();
//    }

//    v4 set方法设置
    public static void main(String[] args) {
        WHY why = new WHY();

        why.setiCourse(new JavaCourse());
        why.studyCourse();

        why.setiCourse(new FECourse());
        why.studyCourse();
    }

}
