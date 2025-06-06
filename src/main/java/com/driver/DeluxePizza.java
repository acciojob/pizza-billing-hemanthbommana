package com.driver;

public class DeluxePizza extends Pizza {

    

    public DeluxePizza(Boolean isVeg) {
        super(isVeg);
        this.isDeluxe = true;
        setPrice(400);
        setBill("Base Price Of The Pizza: 400\n");
        super.addExtraCheese();
        super.addExtraToppings();
        // your code goes here

    }
}
