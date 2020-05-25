package com.ayser.strategypattern.two;

import java.util.Scanner;

/**
 * 增加打折
 * @auther ayser
 */
public class MarketCheckout2 {
    public static void main(String[] args) {
        double total = 0;
        try {
            //1.输入商品数量和价钱
            System.out.println("开始收银");
            total = getTotal(total,2,1);
            System.out.println("你好，本次您一共消费：" + total + "，请问微信还是支付宝");
        }catch (Exception e){
            System.out.println("输入有误，请重新输入！");
        }
    }
    private static double getTotal(double total,int type, double discount){
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入商品个数：");
        String number = scanner.next();
        System.out.println("请输入商品价格：");
        String price = scanner.next();
        System.out.println("是否有折扣，打几折：(如：0.5,0.75,0.8,0.9.....)");
        discount = scanner.nextDouble();
        total += Double.parseDouble(price) * Integer.parseInt(number) * discount;
        System.out.println("结账请选择1，继续输入请选择2");
        type = scanner.nextInt();
        if(type == 1){
            return total;
        }else {
            return getTotal(total, type,1);
        }

    }
}
