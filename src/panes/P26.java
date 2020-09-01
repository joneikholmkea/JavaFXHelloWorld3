package panes;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;

import java.util.Random;

public class P26 extends Pane {
    public P26(){
        Button button = new Button("Randomize color");

        button.setMinSize(240, 166);
        button.setOnAction(e -> button.setStyle("-fx-background-color: " + randomColorCode()));
        getChildren().addAll(button);
    }

    public static String randomColorCode(){
        Random color = new Random();
        int rand_num = color.nextInt(0xffffff + 1);

        return String.format("#%06x", rand_num);
    }
}
