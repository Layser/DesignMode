package com.ayser.simplefactory.second;

import java.util.Scanner;

/**
 * 以面向对象的思想，来实现Main中的逻辑：输入两个数和运算符号，得到结果
 * 面向对象的三大特性，封装、继承和多态
 * 首先，我们考虑封装性，如何能将代码封装好，可复用
 * 功能拆分：显示 + 运算
 */
public class Main2 {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("请输入第一个数字：");
            int num1 = scanner.nextInt();
            System.out.println("选择进行的运算：（+,-,*,/）");
            String opt = scanner.next();
            System.out.println("请输入第二个数字：");
            int num2 = scanner.nextInt();
            if (num2 == 0) {
                System.out.println("除数不能为0");
                return;
            }
            Operator operator = new Operator();
            int result = operator.getResult(num1,num2,opt);
            System.out.println("最终结果是：" + result);
        }catch (Exception e){
            System.out.println("输出有误，请检查");
        }

    }
}

class Operator{

    int getResult(int num1, int num2, String opt){
        int result;
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
        return result;
    }
}
/**
 *思考：这样的代码就是灵活性好，便于扩展么，如果此时，因业务需要，我们要加一个开方（sqrt）的方法，
 * 难道是要在Operator的getResult方法中添加一个case分支么。简单的分支扩展能够接受，如果功能复杂了的话，
 * 这样会增加风险，可能会改动到已经正确的逻辑，这种情况应该如何处理叻？ 见Main3.java
 *
 */