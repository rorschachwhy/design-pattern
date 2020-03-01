package com.why.design.principle.demeter;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: wanghaiyang
 * @Date: 2020/3/1 9:43 PM
 * @Description:
 */
public class TeamLeader {

    public void checkNumberOfCourse() {

        List<Course> courseList = new ArrayList<Course>();
        for (int i = 0; i < 20; i++) {
            courseList.add(new Course());
        }
        System.out.println("在线课程的数量是：" + courseList.size());
    }
}
