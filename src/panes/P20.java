package panes;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;

import java.io.File;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

public class P20 extends Pane {
    public P20(){
        VBox vBox = new VBox();
        File file = new File("src/panes/fish.jpeg");
        Image image = new Image(file.toURI().toString());
        ImageView iv = new ImageView(image);
        Label label = new Label("Oh hi Mark");
        iv.setFitHeight(166);
        iv.setFitWidth(240);
        label.setLayoutY(100);
        label.setLayoutX(20);
        label.setStyle("-fx-font-size: 30pt; -fx-font-weight: bold;");
        vBox.getChildren().addAll(iv, label);
    }
}
