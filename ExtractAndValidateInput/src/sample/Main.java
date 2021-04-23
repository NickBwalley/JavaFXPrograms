package sample;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class Main extends Application {
    Stage window;
    Scene scene;
    Button button;

    public static void main(String[] args){
        launch(args);
    }

    public void start(Stage primaryStage) throws Exception{
        window = primaryStage;
        window.setTitle("ShopMrBeast");

        // Form
        TextField nameInput = new TextField();
        Button button = new Button("Click me!");

        // Layout
        VBox layout = new VBox(10);
        layout.setPadding(new Insets(20,20,20,20) );
        layout.getChildren().addAll(nameInput, button);

        Scene scene = new Scene(layout, 300, 250);
        window.setScene(scene);
        window.show();



    }

}