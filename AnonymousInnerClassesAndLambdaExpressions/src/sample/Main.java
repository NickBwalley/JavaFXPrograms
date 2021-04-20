package sample;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.event.ActionEvent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import javax.swing.*;

public class Main extends Application{
    Button button;
    Button button2;

    public static void main (String[] args){
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception{


    primaryStage.setTitle("MrBeast Application");
    button = new Button();
    button.setText("Hey Baby!");
    button.setOnAction(new EventHandler<ActionEvent>() {
        @Override
        public void handle(ActionEvent actionEvent) {
            System.out.println("I just wanna be part of your symphony!");
        }
    });

    // using lambda Expression -> introduced in java8 to handle objects
    button2 = new Button();
    button2.setText("Hey Mom!");
    button2.setOnAction(e -> {   // e  is the event and -> is the arrow selection operator
        System.out.println("How are you doing?");
        System.out.println("Have you eaten today?");
        System.out.println("You've suffered a lot please rest!");
    });

    StackPane layout = new StackPane();
    layout.getChildren().add(button);
    layout.getChildren().add(button2);
    Scene scene = new Scene(layout, 300, 200);
    primaryStage.setScene(scene);
    primaryStage.show();
    }

}



