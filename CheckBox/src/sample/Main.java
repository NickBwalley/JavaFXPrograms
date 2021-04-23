package sample;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {

    public static void main(String[] args){
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception{
        primaryStage.setTitle("ShopMrBeast!");
        CheckBox box1 = new CheckBox("Bacon");
        CheckBox box2 = new CheckBox("Ham");
        CheckBox box3 = new CheckBox("Chicken");
        box3.setSelected(true); // set box3 to be selected by default

        // Button
        Button button = new Button("Order Now!");

        // Layout
        VBox layout = new VBox(10);
        layout.setPadding(new Insets(20,20,20,20));
        layout.getChildren().addAll(box1, box2, box3, button);

        Scene scene = new Scene(layout, 300, 250);
        primaryStage.setScene(scene);
        primaryStage.show();
    }



}
