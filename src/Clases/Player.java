package Clases;

import java.util.ArrayList;

public class Player {
    private Integer ID;
    private Integer Xaxis;
    private Integer Yaxis;
    private Integer money;
    private ArrayList<PrivateProperty> playerProperties;
    private Boolean inPrison;


    public Player(Integer ID) {
        this.ID = ID;
        this.Xaxis = 0;
        this.Yaxis = 0;
        this.money = 500;
        this.playerProperties = new ArrayList<PrivateProperty>();
        this.inPrison = false;
    }

    public Integer getXaxis() { return Xaxis; }

    public Integer getYaxis() { return Yaxis; }

    public Integer getMoney() { return money; }

    public ArrayList<PrivateProperty> getProperties() { return playerProperties; }

    public void buyProperty(PrivateProperty property) {
        property.buy();
        this.playerProperties.add(property);
        this.money -= property.getBuyingPrice();
    } //Agrega una propiedad a la lista de propiedades del jugador.

    public void sellProperty (PrivateProperty property) {
        property.sell();
        this.playerProperties.remove(property);
        this.money -= property.getBuyingPrice();
    } // Quita la propiedad y la marca como no comprada.

    public Boolean getInPrison() { return inPrison; }

    public void changePrisonState ( ) {
        if(!this.inPrison) {
            this.inPrison = true;
        } else {this.inPrison = false;}
    } //Cambia el estado de inPrison.

    public void move (int diceNumber) {
        for(int i = 0 ; i < diceNumber; i++) {
            if (this.Yaxis == 0 && this.Xaxis > 0) { this.Xaxis -= 1; } //Moverse a la izquierda si abajo.
            else if (this.Xaxis == 0 && this.Yaxis < 10) {this.Yaxis += 1;} // Si está a la izquierda subir.
            else if (this.Yaxis == 10 && this.Xaxis < 10) {this.Xaxis += 1;} // Si está arriba ir a derecha.
            else if (this.Xaxis == 10 && this.Yaxis > 0) {this.Yaxis -= 1;} // Si está en derecha bajar.
            if(this.Yaxis == 0 && this.Xaxis == 10) {this.money += 200;} // Si pasa por la casilla GO, gana Q.200.
        }
    }
}