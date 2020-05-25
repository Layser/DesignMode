package com.ayser.decorativepattern.first;

/**
 * 一个控制台程序，乐意给人搭配嘻哈服或白领装
 */
public class MathcCloth1 {
    public static void main(String[] args) {
        Person person1 = new Person("测测");
        System.out.println("第一种装扮：");
        person1.WearTShirts();
        person1.WearSneakers();
        person1.WearBigTrouser();
        person1.show();
        System.out.println("第二种装扮：");
        person1.WearSuit();
        person1.WearTie();
        person1.WearLeatherShoes();
        person1.show();
    }
}
/**
 *
 * 此时，需要增加超人的装扮，不能再继续修改Person类，而是应该将装扮都写成子类，然后关联
 */