package sample;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Background;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import panes.P1;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        FlowPane flowPane = new FlowPane();
        P1 p1 = new P1();
        flowPane.getChildren().add(p1);
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(flowPane, 1000, 1175));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
