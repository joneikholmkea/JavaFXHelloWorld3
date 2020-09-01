package panes;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class P24 extends Pane{
    public P24() throws FileNotFoundException {
        Label label = new Label("Start her");
        getChildren().add(label);

        Image image = new Image("image24.jpg");
        ImageView imageView = new ImageView(image);
        imageView.setFitHeight(166);
        imageView.setFitWidth(140);

        getChildren().add(imageView);

    }
}
