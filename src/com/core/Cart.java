package com.core;

import java.util.ArrayList;
import java.util.List;

public class Cart {

    private List<CartaItems> items;
        public Cart()
        {
            items= new ArrayList<>();
        }

        public void add(CartaItems item)
        {
            items.add(item);
        }

        public double getTotal()
        {
            double total=0.0;
            for (CartaItems item : items)
            {
                total+= item.getPrice();
            }
            return total;
        }

        public List<CartaItems> getItems()
        {
            return  items;
        }


}
