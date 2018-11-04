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
    ArrayList<Label>labels= new ArrayList<Label>(){{
        add(label); add(label1); add(label2); add(label3); add(label4); add(label5); add(label6); add(label7); add(label8); add(label9); add(label10);add(label11);add(label12);add(label13);add(label14);add(label15);add(label16);add(label17);add(label8);add(label9);add(label20);add(label21);add(label22);add(label23);add(label24);add(label25);add(label26);add(label27);add(label28);add(label29);add(label30);add(label31);add(label32);add(label33);add(label34);add(label35);add(label36);add(label37);add(label38);add(label39);
    }};

    public void move(ActionEvent event){
        if(tablero.getPlayerOneTurn()){
           Player playerToMove=tablero.getPlayers().get(0);
           Integer amountToMove= tablero.getDice().roll();
           playerToMove.move(amountToMove);
           Property propertyToFind=tablero.findPropertybyIndex(playerToMove.getXaxis(),playerToMove.getYaxis());
           Integer indexToCompare=tablero.getFreeCells().indexOf(propertyToFind);
           for (Label label: labels){
               if(labels.indexOf(label)==indexToCompare){
                   label.setText("J1");
               }
               else {
                   label.setText("");
               }
           }
        }
    }
}
