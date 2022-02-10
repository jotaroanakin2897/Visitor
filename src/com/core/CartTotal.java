package com.core;

public class CartTotal implements CartaItemsVisitor{

    private  double total;
    private  Cart cart;

    public  CartTotal (Cart cart)
    {
        this.cart=cart;
        this.total=0.0;
    }
    public  CartTotal()
    {
        total=0.0;
    }

    @Override
   public void visit(Book book)
   {
      total+=book.getPrice();
   }

    @Override
    public void visit(BluRay bluRay)
    {
        total+=bluRay.getPrice();

    }

    public  double getTotal()
    {
        for (CartaItems item: cart.getItems())
        {
            item.accept(this);
        }
        return  total;
    }
}
