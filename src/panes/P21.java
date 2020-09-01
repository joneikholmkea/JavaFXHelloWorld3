package panes;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class P21 extends Pane {
    public P21() {
        FileInputStream file = null;
        try {
            file = new FileInputStream("UncleBen.jpg");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        Image image = new Image(file);
        ImageView iv = new ImageView(image);
        iv.setFitHeight(166);
        iv.setFitWidth(240);
        Button button = new Button("Please end my suffering");
        button.setMinWidth(240);
        VBox vBox = new VBox(iv, button);
        getChildren().addAll(vBox);
        button.setOnAction(e -> {
            iv.setVisible(false);
        });

    }
}