package Clases;

import javafx.beans.property.SimpleStringProperty;

public class Property {
    private SimpleStringProperty name;
    private int[] position = new int[2];

    public Property (String name,int x, int y) {
        this.name = new SimpleStringProperty();
        this.position[0] = x;
        this.position[1]= y;

        this.name.set(name);
    }
    public int getColumn(){
        int Column = this.position[0];
        return Column;
    }
    public int getRow(){
        int Row = this.position[1];
        return Row;
    }
    public String getName(){
        return this.name.get();
    }

    @Override
    public String toString() {
        return this.name.get();
    }
}
