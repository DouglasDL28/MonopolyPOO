package Clases;

import javafx.beans.property.SimpleIntegerProperty;

import java.util.ArrayList;

public class PrivateProperty extends Property {
    private String Color;
    private SimpleIntegerProperty BuyingPrice;
    private SimpleIntegerProperty StayingPrice;
    private Boolean Owned = false;

    public PrivateProperty(String name, int x, int y, String color, int buyingPrice, int stayingPrice) {
        super(name, x, y);
        Color = color;
        this.BuyingPrice = new SimpleIntegerProperty();
        StayingPrice = new SimpleIntegerProperty();
        this.Owned = false;

        this.BuyingPrice.set(buyingPrice);
        this.StayingPrice.set(stayingPrice);
    }

    public void buy(){
        this.Owned=true;
    }

    public void sell () {this.Owned = true;}

    public int getBuyingPrice (){return this.BuyingPrice.get();}

    public int getStayingPrice (){return this.StayingPrice.get();};

    @Override
    public String toString() {
        return "BuyingPrice: " + BuyingPrice.get() + "\n" +
                ", StayingPrice: " + StayingPrice.get() + "\n" +
                ", Owned " + Owned ;
    }
}