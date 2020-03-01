package com.why.design.principle.interfacesegregation;

/**
 * @Author: wanghaiyang
 * @Date: 2020/3/1 9:33 PM
 * @Description:
 */
//public class Dog implements IAnimalAction {
public class Dog implements IEatAnimalAction, ISwimAnimalAction {


    public void eat() {

    }

//    public void fly() {
//
//    }

    public void swim() {

    }
}
