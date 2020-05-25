package com.ayser.decorativepattern.third;

public class MatchCloth3 {
    public static void main(String[] args) {
        Person person = new Person("小菜");
        System.out.println("第一种装扮：");

        Sneakers sneakers = new Sneakers();
        BigTrouser bigTrouser = new BigTrouser();
        TShirts tShirts = new TShirts();

        sneakers.Decorate(person);
        bigTrouser.Decorate(sneakers);
        tShirts.Decorate(bigTrouser);

        tShirts.Show();

        System.out.println("第二种装扮：");
        LeatherShoes leatherShoes = new LeatherShoes();
        Tie tie = new Tie();
        Suit suit = new Suit();
        leatherShoes.Decorate(person);
        tie.Decorate(leatherShoes);
        suit.Decorate(tie);
        suit.Show();

    }
}
