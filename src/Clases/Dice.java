package Clases;

import java.util.Random;

public class Dice {
    //Clase dado
    private int[] numbers = new int [6];
    public Dice() {
        this.numbers[0]=1;
        this.numbers[1]=2;
        this.numbers[2]=3;
        this.numbers[3]=4;
        this.numbers[4]=5;
        this.numbers[5]=6;
    }
    public int roll(){
        int numberToReturn;
        Random random = new Random();
        numberToReturn = random.nextInt((5-0)+1);
        return numberToReturn;
    }
}