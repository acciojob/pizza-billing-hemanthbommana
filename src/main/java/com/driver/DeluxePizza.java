package com.driver;

public class DeluxePizza extends Pizza {

    

    public DeluxePizza(Boolean isVeg) {
        super(isVeg);
        this.isDeluxe = true;
       setPrice(isVeg ? 550 : 650); 
        setBill("Base Price Of The Pizza: " + (isVeg ? 300 : 400) + "\n");
        super.addExtraCheese();
        super.addExtraToppings();
        // your code goes here

    }
}
