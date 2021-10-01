package com.example.samouczek.practise;

public class Main {

    public static void main(String[] args) {
        //Now we want to check if our basket works and then we are obligate to code unit tests for our basket project

        Basket basket = new Basket();
        System.out.println(basket.printOrder());

        System.out.println();

        //Lets create some items
        Item item1 = new Item("Car", 100);
        Item item2 = new Item("Puzzle", 50);
        Item item3 = new Item("Toy", 35);
        Item item4 = new Item("Backpack", 250);
        Item item5 = new Item("Bread", 10);
        Item item6 = new Item("Phone", 720);

        //3140

        basket.addToBasket(item1, 3);
        basket.addToBasket(item2, 1);
        basket.addToBasket(item3, 2);
        basket.addToBasket(item4, 3);
        basket.addToBasket(item5, 5);
        basket.addToBasket(item6, 1);
        basket.addToBasket(item4, 4);
        basket.addToBasket(item1, 2);

        System.out.println(basket.printOrder());
        System.out.println();

        //Lets remove something from our basket
        basket.removeFromBasket(item3);
        basket.removeFromBasket(item4);
        basket.removeFromBasket(item4);

        System.out.println(basket.printOrder());


    }
}
