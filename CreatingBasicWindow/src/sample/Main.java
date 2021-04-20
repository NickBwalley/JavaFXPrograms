package sample;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Main extends Application{

    Button button;

    public static void main(String[] args){
        launch(args); // whenever your program starts its going to call the launch so the launch() goes to the
            // application class set everything up and then call the start
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
    // main javafx code
        /*NOTE:
        * In JavaFX the entire window is called a STAGE
        * The content inside your window or inside the STAGE is called the SCENE
        *   and on the scene is where we put all the cool stuff like buttons, widgets etc */
        primaryStage.setTitle("Title of the Window"); // set title of the window;

        button = new Button();
        button.setText("Click me");

        StackPane layout = new StackPane(); // position the button in the middle
        layout.getChildren().add(button);

        Scene scene = new Scene(layout, 300, 250);
        primaryStage.setScene(scene);
        primaryStage.show();


    }
}