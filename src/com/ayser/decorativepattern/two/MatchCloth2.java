package com.ayser.decorativepattern.two;

public class MatchCloth2 {
    public static void main(String[] args) {
        Person person1 = new Person("测测");
        System.out.println("第一种装扮：");
        DressUp ts = new TShirts();
        DressUp bt = new BigTrouser();
        DressUp sk = new Sneakers();
        ts.Show();
        bt.Show();
        sk.Show();
        person1.show();
        System.out.println("第二种装扮：");
        DressUp t = new Tie();
        DressUp s = new Suit();
        DressUp ls = new LeatherShoes();
        t.Show();
        s.Show();
        ls.Show();
        person1.show();
    }
}
/**
 * 我们发现这样修改之后，如果要扩展超人服饰，那么增加子类就可以了，不会影响其他的类
 * 但是，t.Show();s.Show();ls.Show();这样有什么问题么？
 * 从代码的顺序看，就好像先创建一个不穿衣服的人，然后再一件件的穿，我们能不能在一开始创建一个人的时候
 * 就是装扮好了的
 */