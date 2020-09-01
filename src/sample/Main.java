package sample;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.util.List;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        MyClassLoader classLoader = new MyClassLoader();
        List<Pane> panes = classLoader.dynamicLoad();
        FlowPane flowPane = new FlowPane();
        flowPane.getChildren().addAll(panes);
        primaryStage.setTitle("Dat19A Distributed Programming");
        primaryStage.setScene(new Scene(flowPane, 1200, 1000));
        primaryStage.show();
    }



    public static void main(String[] args) {
        launch(args);
    }
}
