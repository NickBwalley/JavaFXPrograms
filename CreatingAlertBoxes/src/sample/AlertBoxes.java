package sample;

import javafx.stage.*;
import  javafx.scene.*;
import  javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.geometry.*;

public class AlertBoxes {

    public static void display(String title, String message){
        Stage window = new Stage();

        window.initModality(Modality.APPLICATION_MODAL);
        window.setTitle(title);
        window.setMaxWidth(250);

        Label label1 = new Label();
        label1.setText(message);
        Button closeButton = new Button("Close the Window");
        closeButton.setOnAction(e -> window.close());

        VBox layout = new VBox(10);
        layout.getChildren().addAll(label1, closeButton);
        layout.setAlignment(Pos.CENTER);

        Scene scene = new Scene(layout);
        window.setScene(scene);
        window.showAndWait();



    }
}
