package sample;

import Clases.*;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import javax.annotation.processing.Generated;
import java.security.PrivilegedExceptionAction;
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
    Button buyButton;
    @FXML
    Button endTurnButton;
    @FXML
    TableView PlayerOneTable;
    @FXML
    TableView PlayerTwoTable;

    @FXML
    TableColumn PlayerOneProperties;

    @FXML
    TableColumn PlayerTwoProperties;

    @FXML
    Label Position1;

    @FXML
    Label Position2;

    @FXML
    Button sellPropertyButton;

    @FXML
    Label PlayerOneMoney;

    @FXML
    Label PlayerTwoMoney;

    Board tablero = new Board();

    ArrayList<Label> labels = new ArrayList<>();

    @FXML
    public void initialize() {
        labels.add(0, label);
        labels.add(1, label1);
        labels.add(2, label2);
        labels.add(3, label3);
        labels.add(4, label4);
        labels.add(5, label5);
        labels.add(6, label6);
        labels.add(7, label7);
        labels.add(8, label8);
        labels.add(9, label9);
        labels.add(10, label10);
        labels.add(11, label11);
        labels.add(12, label12);
        labels.add(13, label13);
        labels.add(14, label14);
        labels.add(15, label15);
        labels.add(16, label16);
        labels.add(17, label17);
        labels.add(18, label18);
        labels.add(19, label19);
        labels.add(20, label20);
        labels.add(21, label21);
        labels.add(22, label22);
        labels.add(23, label23);
        labels.add(24, label24);
        labels.add(25, label25);
        labels.add(26, label26);
        labels.add(27, label27);
        labels.add(28, label28);
        labels.add(29, label29);
        labels.add(30, label30);
        labels.add(31, label31);
        labels.add(32, label32);
        labels.add(33, label33);
        labels.add(34, label34);
        labels.add(35, label35);
        labels.add(36, label36);
        labels.add(37, label37);
        labels.add(38, label38);
        labels.add(39, label39);

        labels.get(0).setText("J1  J2");

        PlayerOneProperties.setCellValueFactory(
                new PropertyValueFactory<Property, String>("name")
        );

        PlayerTwoProperties.setCellValueFactory(
                new PropertyValueFactory<Property, String>("name")
        );

        PlayerOneTable.setItems(tablero.getPlayers().get(0).getProperties());

        PlayerTwoTable.setItems(tablero.getPlayers().get(1).getProperties());

    }

    public void move (ActionEvent event) {
        if (tablero.getPlayerOneTurn()) {
            Player playerToMove = tablero.getPlayers().get(0);
            int amountToMove = tablero.getDice().roll();
            playerToMove.move(amountToMove);
            Property propertyToFind = tablero.findPropertybyIndex(playerToMove.getXaxis(), playerToMove.getYaxis());
            int indexToCompare = tablero.getCells().indexOf(propertyToFind);

            for (int i = 0; i < labels.size(); i++) {
                if (i == indexToCompare) {
                    Label labelToChange = labels.get(i);
                    labelToChange.setText("J1");
                }
                else{
                    Label labelToChange = labels.get(i);
                    labelToChange.setText("");
                }
            }

            PrivateProperty propertyToCheck = tablero.findPrivatePropertybyIndex(playerToMove.getXaxis(), playerToMove.getYaxis());
            if (tablero.getPlayers().get(1).getProperties().contains(propertyToCheck)){
                int stayingCost = propertyToCheck.getStayingPrice();
                playerToMove.substractMoney(stayingCost);
                tablero.getPlayers().get(1).addMoney(stayingCost);
            }
            moveButton.setDisable(true);
            Position1.setText(propertyToFind.toString());
        } else {
            Player playerToMove = tablero.getPlayers().get(1);
            int amountToMove = tablero.getDice().roll();
            playerToMove.move(amountToMove);
            Property propertyToFind = tablero.findPropertybyIndex(playerToMove.getXaxis(), playerToMove.getYaxis());
            int indexToCompare = tablero.getCells().indexOf(propertyToFind);
            for (int i = 0; i < labels.size(); i++) {
                if (i == indexToCompare) {
                    Label labelToChange = labels.get(i);
                    labelToChange.setText("J2");
                }
                else{
                    Label labelToChange = labels.get(i);
                    labelToChange.setText("");
                }
            }

            PrivateProperty propertyToCheck = tablero.findPrivatePropertybyIndex(playerToMove.getXaxis(), playerToMove.getYaxis());
            if (tablero.getPlayers().get(0).getProperties().contains(propertyToCheck)){
                int stayingCost = propertyToCheck.getStayingPrice();
                playerToMove.substractMoney(stayingCost);
                tablero.getPlayers().get(0).addMoney(stayingCost);
            }
            moveButton.setDisable(true);

            Position2.setText(propertyToFind.toString());
        }

    }
    public void buy(ActionEvent event){
        if (tablero.getPlayerOneTurn()){
            Player playerToBuy = tablero.getPlayers().get(0);
            Property propertyToBuy = tablero.findPrivatePropertybyIndex(playerToBuy.getXaxis(),playerToBuy.getYaxis());
            if (propertyToBuy!= null){
                buyButton.setDisable(false);
                tablero.buyPropertyToBoard((PrivateProperty) propertyToBuy,playerToBuy);
                System.out.println("Se logro comprar una propiedad");
                System.out.println(playerToBuy.getMoney());
                PlayerOneMoney.setText(Integer.toString(tablero.getPlayers().get(0).getMoney()));
            }else{buyButton.setDisable(true);}
        }
        else {
            Player playerToBuy = tablero.getPlayers().get(1);
            Property propertyToBuy = tablero.findPrivatePropertybyIndex(playerToBuy.getXaxis(),playerToBuy.getYaxis());
            if (propertyToBuy!= null){
                buyButton.setDisable(false);
                tablero.buyPropertyToBoard((PrivateProperty) propertyToBuy,playerToBuy);
                System.out.println("Se logro comprar una propiedad");
                System.out.println(playerToBuy.getMoney());
                PlayerTwoMoney.setText(Integer.toString(tablero.getPlayers().get(1).getMoney()));
            }else{buyButton.setDisable(true);}
        }
    }
    public void endTurn(ActionEvent event){
        tablero.changeTurn();
        moveButton.setDisable(false);
        buyButton.setDisable(false);
    }
    public void sell(ActionEvent event){
        if (tablero.getPlayerOneTurn()){
            Player playerToSell = tablero.getPlayers().get(0);
            PrivateProperty selectedProperty = (PrivateProperty) PlayerOneTable.getSelectionModel().getSelectedItem();
            if (selectedProperty!= null){
                tablero.sellPropertyToBoard(selectedProperty,playerToSell);
                PlayerOneMoney.setText(Integer.toString(tablero.getPlayers().get(0).getMoney()));
            }else{System.out.println("No se selecciono una propiedad del jugador 1");}
        }
        else{
            Player playerToSell = tablero.getPlayers().get(1);
            PrivateProperty selectedProperty = (PrivateProperty) PlayerTwoTable.getSelectionModel().getSelectedItem();
            if (selectedProperty!= null){
                tablero.sellPropertyToBoard(selectedProperty,playerToSell);
                PlayerTwoMoney.setText(Integer.toString(tablero.getPlayers().get(1).getMoney()));
            }else{System.out.println("No se selecciono una propiedad del jugador 2");}
        }
    }
}
