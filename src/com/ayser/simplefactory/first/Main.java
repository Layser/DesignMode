package com.ayser.simplefactory.first;

import java.util.Scanner;

/**
 * 输入两个数和运算符号，得到结果
 */
public class Main {
    public static void main(String[] args) {

        //控制台

        double result = 0;
        try{
            Scanner scanner = new Scanner(System.in);
            System.out.println("请输入第一个数字：");
            double num1 = scanner.nextDouble();
            System.out.println("选择进行的运算：（+,-,*,/）");
            String opt = scanner.next();
            System.out.println("请输入第二个数字：");
            double num2 = scanner.nextDouble();
            if(num2 == 0.0){
                System.out.println("除数不能为0");
                return;
            }
            switch(opt){
                case "+":
                    result = num1 + num2;
                    break;
                case "-":
                    result = num1 - num2;
                    break;
                case "*":
                    result = num1 * num2;
                    break;
                case "/":
                    result = num1 / num2;
                    break;

            }
            System.out.println("最终结果是：" + result);
        }catch(Exception e){
            System.out.println("输入有误，请检查！");
        }
    }
}
/**
 * 这样设计，存在的问题：实际上解决问题的思维，依然是过程化的思维，第一步应该做什么，第二步应该做什么，
 * 以面向对象的思想来实现叻？应该如何实现？  见示例 Main2.java
 *
 *
 *
 * */