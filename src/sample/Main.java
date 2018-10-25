package sample;

import Clases.Board;
import Clases.Property;
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

        for (int x = 0; x < 11; x ++) {
            for (int y = 0; y < 11; y++){
                Property colCell = new Property("", x, y);

            }
        }
        launch(args);

    }
}
