package sample;

import Clases.*;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import java.util.*;

public class Controller {



    @FXML
    Label label;
    @FXML
    Label label1;
    @FXML
    Label label2;
    @FXML
    Label label3;
    @FXML
    Label label4;
    @FXML
    Label label5;
    @FXML
    Label label6;
    @FXML
    Label label7;
    @FXML
    Label label8;
    @FXML
    Label label9;
    @FXML
    Label label10;
    @FXML
    Label label11;
    @FXML
    Label label12;
    @FXML
    Label label13;
    @FXML
    Label label14;
    @FXML
    Label label15;
    @FXML
    Label label16;
    @FXML
    Label label17;
    @FXML
    Label label18;
    @FXML
    Label label19;
    @FXML
    Label label20;
    @FXML
    Label label21;
    @FXML
    Label label22;
    @FXML
    Label label23;
    @FXML
    Label label24;
    @FXML
    Label label25;
    @FXML
    Label label26;
    @FXML
    Label label27;
    @FXML
    Label label28;
    @FXML
    Label label29;
    @FXML
    Label label30;
    @FXML
    Label label31;
    @FXML
    Label label32;
    @FXML
    Label label33;
    @FXML
    Label label34;
    @FXML
    Label label35;
    @FXML
    Label label36;
    @FXML
    Label label37;
    @FXML
    Label label38;
    @FXML
    Label label39;
    @FXML
    Button moveButton;

    @FXML
    public void initialize() { }

    Board tablero = new Board();
    ArrayList<Label> labels= new ArrayList<>(){{
        add(0,label);
        add(1,label1);
        add(2,label2);
        add(3,label3);
        add(4,label4);
        add(5,label5);
        add(6,label6);
        add(7,label7);
        add(8,label8);
        add(9,label9);
        add(10,label10);
        add(11,label11);
        add(12,label12);
        add(13,label13);
        add(14,label14);
        add(15,label15);
        add(16,label16);
        add(17,label17);
        add(18,label8);
        add(19,label9);
        add(20,label20);
        add(21,label21);
        add(22,label22);
        add(23,label23);
        add(24,label24);
        add(25,label25);
        add(26,label26);
        add(27,label27);
        add(28,label28);
        add(29,label29);
        add(30,label30);
        add(31,label31);
        add(32,label32);
        add(33,label33);
        add(34,label34);
        add(35,label35);
        add(36,label36);
        add(37,label37);
        add(38,label38);
        add(39,label39);
}};

    public void move(ActionEvent event){
        if(tablero.getPlayerOneTurn()){
           Player playerToMove = tablero.getPlayers().get(0);
           Integer amountToMove = tablero.getDice().roll();
           playerToMove.move(amountToMove);
           Property propertyToFind = tablero.findPropertybyIndex(playerToMove.getXaxis(),playerToMove.getYaxis());
           Integer indexToCompare = tablero.getCells().indexOf(propertyToFind);
           for (Label label: labels){
               if(label!=null){
                   System.out.println("vamos bien");
               if(labels.indexOf(label)==indexToCompare){
                   label.setText("J1");
               }
               else {
                   label.setText(" ");
               }}else{System.out.println("vamos mal");}
           }
        }
    }
}
