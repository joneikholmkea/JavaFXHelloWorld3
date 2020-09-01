package panes;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;

import java.io.File;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

public class P20 extends Pane {
    public P20() throws InterruptedException {
        File file = new File("src/panes/fish.jpeg");
        Image image = new Image(file.toURI().toString());
        ImageView iv = new ImageView(image);
        iv.setFitHeight(166);
        iv.setFitWidth(240);
        Button button = new Button("Stahp");
        Label label = new Label("Oh hi Mark");
        label.setLayoutY(100);
        label.setLayoutX(20);
        label.setStyle("-fx-font-size: 30pt; -fx-font-weight: bold;");
        getChildren().addAll(button, iv, label);
        AtomicBoolean test = new AtomicBoolean(true);
    }
}
