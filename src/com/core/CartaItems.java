package com.core;

 public interface CartaItems {
     public double getPrice();
     public  void accept(CartaItemsVisitor visitor);


}
