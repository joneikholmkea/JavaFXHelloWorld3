package panes;

import javafx.animation.PauseTransition;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.util.Duration;

public class P25 extends Pane {
    public P25() {
        Button button = new Button("Click this!");
        button.setPrefSize(166, 155);
        button.setStyle("-fx-background-color: coral; -fx-border-color: black;");
        Image image = new Image("Pane25.png");
        ImageView imageView = new ImageView(image);
        getChildren().addAll(button);
        button.setOnAction(event -> {
            button.setVisible(false);
            PauseTransition pause = new PauseTransition(Duration.seconds(2));
            pause.play();
            getChildren().add(imageView);
            pause.setOnFinished(event1 -> {
                //imageView.setVisible(false);
                getChildren().remove(imageView);
                Label label = new Label("*poof*");
                getChildren().add(label);
            });
        });

    }
}
