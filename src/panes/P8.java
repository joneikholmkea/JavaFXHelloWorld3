package panes;

import javafx.animation.PauseTransition;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.util.Duration;

public class P8 extends Pane {
    public P8() {
        Button button = new Button("Hvad er blåt &\nlugter af gul maling?");
        button.setPrefSize(166, 155);
        button.setStyle("-fx-background-color: White; -fx-border-color: black;");
        Image image = new Image("Pane8.png");
        ImageView imageView = new ImageView(image);
        getChildren().addAll(button);
        button.setOnAction(event -> {
            button.setVisible(false);
            getChildren().add(imageView);
        });

    }
}