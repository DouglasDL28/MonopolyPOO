package sample;

import Clases.Board;
import Clases.PrivateProperty;
import Clases.Property;
import Clases.PublicProperty;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.util.ArrayList;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();
    }


    public static void main(String[] args) {
        System.out.println("HOLA, ESTO ES UNA PRUEBA");

        ArrayList<Property> properties = new ArrayList<>();
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


        launch(args);

    }
}
