package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    protected boolean isDeluxe = false;

    private boolean cheeseAdded = false;
    private boolean toppingsAdded = false;
    private boolean takeawayAdded = false;

    public Pizza(Boolean isVeg){
        
        this.isVeg = isVeg;
       this.price = isVeg ? 300 : 400;
        this.bill = "Base Price Of The Pizza: 300\n";
        // your code goes here
    }
    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if (isDeluxe) return;
        if (!cheeseAdded) {
            this.price += 80;
            //this.bill += "Extra Cheese Added: 80\n";
            cheeseAdded = true;
        }
    }

    public void addExtraToppings() {
        if (!toppingsAdded) {
            this.price += (isDeluxe ? 120 : 70);
            toppingsAdded = true;
        }
    }

    public void addTakeaway(){
        // your code goes here
        if (!takeawayAdded) {
            this.price += 20;
           // this.bill += "Paperbag Added: 20\n";
            takeawayAdded = true;
        }
    }
    public void setPrice(int price){
        this.price = price;

    }
    public void setBill(String bill){
        this.bill = bill;
    }
    public String getBill(){
        // your code goes here
       StringBuilder str = new StringBuilder();
    str.append(this.bill);
    if (cheeseAdded) str.append("Extra Cheese Added: 80\n");
    if (toppingsAdded) str.append("Extra Toppings Added: "+(isDeluxe ? 120 : 70)+"\n");
    if (takeawayAdded) str.append("Paperbag Added: 20\n");
    str.append("Total Price: " + this.price + "\n");
    return str.toString();
    }
}
