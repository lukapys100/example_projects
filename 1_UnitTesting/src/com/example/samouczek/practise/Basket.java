package com.example.samouczek.practise;

import java.util.HashMap;
import java.util.Map;

public class Basket {
    private Map<Item, Integer> clientBasket;

    public Basket() {
        this.clientBasket = new HashMap<>();
    }

    public Map<Item, Integer> getClientBasket() {
        return clientBasket;
    }

    public boolean addToBasket(Item item, int amount){
        if (item == null || amount <=0) {
            System.out.println("Invalid values");
            return false;
        }
        if(!clientBasket.containsKey(item)){
            clientBasket.put(item, amount);
        }else{
            clientBasket.put(item, clientBasket.get(item) + amount);
        }
        return true;
    }

    public void removeFromBasket(Item item){
        clientBasket.remove(item);
    }

    public int printOrder(){
        int sum = 0;
        for(Map.Entry<Item, Integer> entry : clientBasket.entrySet()){
            System.out.println(entry.getKey() + ": " + entry.getValue());
            sum += entry.getKey().getPrice()*entry.getValue();
        }
        return sum;
    }
    
}
