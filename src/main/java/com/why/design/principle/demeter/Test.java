package com.why.design.principle.demeter;

/**
 * @Author: wanghaiyang
 * @Date: 2020/3/1 9:48 PM
 * @Description:
 */
public class Test {
    public static void main(String[] args) {
        Boss boss = new Boss();
        TeamLeader teamLeader = new TeamLeader();
        boss.commandCheckNumber(teamLeader);
    }
}
