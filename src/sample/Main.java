package sample;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Background;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        VBox vBox = new VBox();
        Button button = new Button("press");
        vBox.getChildren().addAll(button);
        button.setOnAction(e -> {
            button.setText("you rock!");
        });
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(vBox, 300, 275));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
