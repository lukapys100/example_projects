package com.example.samouczek.tests;

import com.example.samouczek.practise.Basket;
import com.example.samouczek.practise.Item;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BasketTest {
    private Basket basket;
    private Item someItem;

    @Before
    public void initialize(){
        basket = new Basket();
        someItem = new Item("Item", 100);
    }

    @Test
    public void shouldReturnFalseWhenAddedItemIsNull(){
        Assert.assertFalse(basket.addToBasket(null, 4));
    }

    @Test
    public void shouldReturnFalseWhenAddedItemAmountIsLessOrEqualZero(){
        Assert.assertFalse(basket.addToBasket(someItem, 0));
    }

    @Test
    public void shouldReturnTrueWhenAddedItemIsNotNull(){
        Assert.assertTrue(basket.addToBasket(someItem, 5));
    }

    @Test
    public void shouldReturnTrueWhenAddedItemIsAlreadyInBasket() {
        basket.addToBasket(new Item("Item", 100), 4);
        Assert.assertTrue(basket.addToBasket(someItem, 3));
    }

    @Test
    public void shouldReturn300WhenPrintingBasketContent(){
        basket.addToBasket(someItem,3);
        Assert.assertEquals(300, basket.printOrder());
    }



















}