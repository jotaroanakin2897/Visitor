package com.core;

public class BluRay implements CartaItems{
    String title;
    double price;
    public  BluRay(String title , double price)
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
