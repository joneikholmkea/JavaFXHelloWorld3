package sample;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;
import panes.P20;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        FlowPane flowPane = new FlowPane();
        P20 p20 = new P20();
        flowPane.getChildren().add(p20);
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(flowPane, 240, 166));
        primaryStage.show();

    }


    public static void main(String[] args) {
        launch(args);
    }
}
