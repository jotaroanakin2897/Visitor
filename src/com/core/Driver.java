package com.core;

public class Driver {
    public static void main(String[] args) {

        Book book= new Book("Harry potter",18.99);
        BluRay bluray = new BluRay("Kubric collection",38.98);

        Cart cart= new Cart();
        cart.add(book);
        cart.add(bluray);
        CartTotal carttotal= new CartTotal(cart);

        System.out.println("Total = " + carttotal.getTotal());

    }
}
