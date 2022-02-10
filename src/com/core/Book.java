package com.core;

public class Book implements CartaItems {

    String title;
    double price;
    public  Book(String title , double price)
    {
        this.title=title;
        this.price=price;
    }

    public double getPrice()
    {
        return price;
    }

    @Override
    public void accept(CartaItemsVisitor visitor) {
        visitor.visit(this);
    }
}
