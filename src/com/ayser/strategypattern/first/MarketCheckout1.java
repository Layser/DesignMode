package com.ayser.strategypattern.first;

import java.util.Scanner;

/**
 * 1.商场收银系统：营业员根据客户所购买商品的单价和数量，向客户收费，核心代码是：
 * 我们只需要获得输入商品的数量和价格，然后进行计算
 */
public class MarketCheckout1 {

    public static void main(String[] args) {
        double total = 0;
        try {
            //1.输入商品数量和价钱
            System.out.println("开始收银");
            total = getTotal(total,2);
            System.out.println("你好，本次您一共消费：" + total + "，请问微信还是支付宝");
        }catch (Exception e){
            System.out.println("输入有误，请重新输入！");
        }
    }
    private static double getTotal(double total,int type){
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入商品个数：");
        String number = scanner.next();
        System.out.println("请输入商品价格：");
        String price = scanner.next();
        total += Double.parseDouble(price) * Integer.parseInt(number);
        System.out.println("结账请选择1，继续输入请选择2");
        type = scanner.nextInt();
        if(type == 1){
            return total;
        }else {
            return getTotal(total, type);
        }

    }
}
/**
 * 现在，增加需求，商场促销，所有商品打八折。
 * 现有的机器已经部署好了系统，不可能说在价格后面 *0.8，再去升级。
 * 由此可见，上述程序的扩展性太差，需求不能灵活满足
 *
 */