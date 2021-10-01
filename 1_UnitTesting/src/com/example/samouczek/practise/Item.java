package com.example.samouczek.practise;

public class Item {
    private String name;
    private int price;

    public Item(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public boolean equals(Object obj){
        if(obj instanceof Item){
            Item otherItem = (Item) obj;
            return name.equals(otherItem.getName())
                    && price == otherItem.getPrice();
        }
        return false;
    }

    @Override
    public int hashCode(){
        return 17*name.hashCode() + 7*price;
    }

    @Override
    public String toString() {
        return name;
    }
}
