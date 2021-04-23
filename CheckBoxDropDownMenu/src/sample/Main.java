package sample;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;


public class Main extends Application{

    public static void main(String[] args){
        launch(args);
    }

    public void start(Stage primaryStage) throws Exception{
        primaryStage.setTitle("ShopMrBeast!");
        CheckBox box1 = new CheckBox("Ham");
        CheckBox box2 = new CheckBox("Chicken");

        // Button
        Button button1 = new Button("Order Now!");
        VBox layout = new VBox(10);
        layout.setPadding(new Insets(20,20,20,20));
        layout.getChildren().addAll(box1, box2, button1);

        // Scene
        Scene scene = new Scene(layout, 300, 250);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}