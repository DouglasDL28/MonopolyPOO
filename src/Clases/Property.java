package Clases;

public class Property {
    private String name;
    private int[] position = new int[2];

    public Property (String name,int x, int y) {
        this.name = name;
        this.position[0] = x;
        this.position[1]= y;
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
        return this.name;
    }

    @Override
    public String toString() {
        return this.name;
    }
}
