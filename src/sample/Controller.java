package sample;

import Clases.PrivateProperty;
import Clases.Property;
import Clases.PublicProperty;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import java.util.ArrayList;

public class Controller {

    public ArrayList<Property> properties = new ArrayList<>();
    PublicProperty go = new PublicProperty("GO", 10, 0);
    PublicProperty jail = new PublicProperty("Jail", 0,0);
    PublicProperty goJail = new PublicProperty("Go to Jail", 10,10);
    PublicProperty parking = new PublicProperty("Free Parking", 0,10);

    PrivateProperty mediterraneanAvenue = new PrivateProperty("Mediterranean Avenue", 9,0, "Brown", 60,60);
    PrivateProperty communityChest1 = new PrivateProperty("Community Chest", 8,0, "None", 0,0);
    PrivateProperty balticAvenue = new PrivateProperty("Baltic Avenue", 7,0, "Brown", 60,60);
    PrivateProperty incomeTax = new PrivateProperty("Income Tax", 6,0, "None", 0,200);
    PrivateProperty readingRaildroad = new PrivateProperty("Reading Railroad", 5,0, "None", 0,-200);
    PrivateProperty orientalAvenue = new PrivateProperty("Oriental Avenue", 4,0, "Sky Blue", 100,100);
    PublicProperty chance1 = new PublicProperty("Chance", 3,0);
    PrivateProperty vermontAvenue = new PrivateProperty("Vermont Avenue", 2,0, "Sky Blue", 100,100);
    PrivateProperty conneticutAvenue = new PrivateProperty("Conneticut Avenue", 1,0, "Sky Blue", 100,60);

    PrivateProperty stCharlesPlace = new PrivateProperty("ST. Charles Place", 0,1, "Pink", 100,100);
    PrivateProperty electricCompany = new PrivateProperty("Electric Company", 0,2, "None", 150,150);
    PrivateProperty statesAvenue = new PrivateProperty("States Avenue", 0,3, "Pink", 140,140);
    PrivateProperty virginiaAvenue = new PrivateProperty("Virginia Avenue", 0,4, "Pink", 140,140);
    PrivateProperty pennsylvaniaRailroad = new PrivateProperty("Pennsylvania Railroad", 0,5, "None", 200,200);
    PrivateProperty stJamesPlace = new PrivateProperty("ST. James Place", 0,6, "Orange", 180,180);
    PrivateProperty communityChest2 = new PrivateProperty("Community Chest", 0,7, "None", 0,60);
    PrivateProperty tennesseeAvenue = new PrivateProperty("Tennessee Avenue", 0,8, "Orange", 180,180);
    PrivateProperty newYorkAvenue = new PrivateProperty("New York Avenue", 0,9, "Orange", 180,180);

    PrivateProperty kentuckyAvenue = new PrivateProperty("Kentucky Avenue", 1,10, "Red", 220,220);
    PublicProperty chance2 = new PublicProperty("Chance", 2,10);
    PrivateProperty kentuckyAvenue = new PrivateProperty("Kentucky Avenue", 1,10, "Red", 220,220);
    PrivateProperty kentuckyAvenue = new PrivateProperty("Kentucky Avenue", 1,10, "Red", 220,220);
    PrivateProperty kentuckyAvenue = new PrivateProperty("Kentucky Avenue", 1,10, "Red", 220,220);
    PrivateProperty kentuckyAvenue = new PrivateProperty("Kentucky Avenue", 1,10, "Red", 220,220);
    PrivateProperty kentuckyAvenue = new PrivateProperty("Kentucky Avenue", 1,10, "Red", 220,220);
    PrivateProperty kentuckyAvenue = new PrivateProperty("Kentucky Avenue", 1,10, "Red", 220,220);
    PrivateProperty kentuckyAvenue = new PrivateProperty("Kentucky Avenue", 1,10, "Red", 220,220);

    PrivateProperty mediterraneanAvenue = new PrivateProperty("Mediterranean Avuenue", 9,0, "Brown", 60,60);
    PrivateProperty mediterraneanAvenue = new PrivateProperty("Mediterranean Avuenue", 9,0, "Brown", 60,60);
    PrivateProperty mediterraneanAvenue = new PrivateProperty("Mediterranean Avuenue", 9,0, "Brown", 60,60);
    PrivateProperty mediterraneanAvenue = new PrivateProperty("Mediterranean Avuenue", 9,0, "Brown", 60,60);
    PrivateProperty mediterraneanAvenue = new PrivateProperty("Mediterranean Avuenue", 9,0, "Brown", 60,60);
    PrivateProperty mediterraneanAvenue = new PrivateProperty("Mediterranean Avuenue", 9,0, "Brown", 60,60);
    PrivateProperty mediterraneanAvenue = new PrivateProperty("Mediterranean Avuenue", 9,0, "Brown", 60,60);
    PrivateProperty mediterraneanAvenue = new PrivateProperty("Mediterranean Avuenue", 9,0, "Brown", 60,60);
    PrivateProperty mediterraneanAvenue = new PrivateProperty("Mediterranean Avuenue", 9,0, "Brown", 60,60);
    PrivateProperty mediterraneanAvenue = new PrivateProperty("Mediterranean Avuenue", 9,0, "Brown", 60,60);
    PrivateProperty mediterraneanAvenue = new PrivateProperty("Mediterranean Avuenue", 9,0, "Brown", 60,60);

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

     Label[] labels= new Label[]{label, label1, label2, label3, label4, label5, label6, label7, label8, label9, label10,label11,label12,label13,label14,label15,label16,label17,label8,label9,label20,label21,label22,label23,label24,label25,label26,label27,label28,label29,label30,label31,label32,label33,label34,label35,label36,label37,label38,label39};
     




}
