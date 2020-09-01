package panes;

import javafx.geometry.HPos;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;

import java.io.File;

public class P20 extends Pane {
    public P20(){
        File file = new File("src/panes/fish.jpeg");
        Image image = new Image(file.toURI().toString());
        ImageView iv = new ImageView(image);
        iv.setFitHeight(166);
        iv.setFitWidth(240);
        Label label = new Label("Oh hi Mark");
        label.setLayoutY(100);
        label.setLayoutX(20);
        label.setStyle("-fx-font-size: 30pt; -fx-font-weight: bold;");
        getChildren().addAll(iv, label);
    }
}
