package com.why.design.principle.singleresponsibility;

/**
 * @Author: wanghaiyang
 * @Date: 2020/3/1 9:21 PM
 * @Description:
 */
public class Method {

    private void updateUserInfo(String username, String address) {
        username = "why";
        address = "beijing";
    }

    private void updateUserInfo(String username, String... properties) {
        username = "why";
//        address = "beijing"
    }

    private void updateUserName(String username) {
        username = "why";
    }

    private void updateUserAddress(String address) {
        address = "beijing";
    }

    private void updateUserInfo(String username, String address, Boolean bool) {

//        一般不这样，方法的命名也不好做
        if (bool) {

        } else {

        }

        username = "why";
        address = "beijing";
    }


}
