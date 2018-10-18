package Clases;

import java.util.ArrayList;

public class Player {
    private Integer Xaxis;
    private Integer Yaxis;
    private Integer money;
    private ArrayList<PrivateProperty> properties;
    private Boolean inPrison;


    public Player() {
        Xaxis = 0;
        Yaxis = 0;
        this.money = 500;
        this.properties = new ArrayList<PrivateProperty>();
        this.inPrison = false;
    }

    public Integer getXaxis() { return Xaxis; }

    public Integer getYaxis() { return Yaxis; }

    public Integer getMoney() { return money; }

    public ArrayList<PrivateProperty> getProperties() { return properties; }

    public void addProperty(PrivateProperty property) {
        this.properties.add(property);
    } //Agrega una propiedad a la lista de propiedades del jugador.

    public Boolean getInPrison() { return inPrison; }

    public void changePrisonState ( ) {
        if(!this.inPrison) {
            this.inPrison = true;
        } else {this.inPrison = false;}
    } //Cambia el estado de inPrison.

    public void move (int diceNumber) {
        for(int i =0 ; i< diceNumber; i++) {
            if (this.Yaxis == 0 && this.Xaxis < 11) { this.Xaxis += 1; } //Si Y=0 y X<11 muevase 1 a la derecha.
            else if (this.Yaxis == 11 && this.Xaxis > 0) {this.Xaxis -= 1;} //Si Y=12 y X>0 muevase 1 a la izquierda.
            else if (this.Xaxis == 0 && this.Yaxis > 0) {this.Yaxis -= 1;} // Si X=0 y Y>0 baje 1 posición.
            else if (this.Xaxis == 11 && this.Yaxis < 12) {this.Yaxis += 1;} // Si X=11 y Y<12 suba 1 posición.
            if(this.Yaxis == 0 && this.Xaxis == 11) {this.money += 0;} // Si para por la casilla GO, gana Q.200
        }
    }
}