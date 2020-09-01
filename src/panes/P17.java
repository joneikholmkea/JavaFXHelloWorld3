package panes;

import javafx.scene.Group;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class P17 extends Pane {
    public P17() throws FileNotFoundException {

        FileInputStream inputstream = new FileInputStream("src/panes/feelsgoodenoughman.png");
        Image image = new Image(inputstream);
        ImageView imageView = new ImageView(image);
        imageView.setX(50);
        imageView.setY(25);
        imageView.setFitHeight(50);
        imageView.setFitWidth(50);
        imageView.setPreserveRatio(true);
        Label label = new Label("P17");
        Group root = new Group(imageView);
        getChildren().addAll(label, root);


    }


}
