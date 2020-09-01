package panes;

import javafx.scene.Group;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class P12 extends Pane
{
    public P12() throws FileNotFoundException
    {

        FileInputStream inputstream = new FileInputStream("src/panes/simpsons.gif");
        Image image = new Image(inputstream);
        ImageView imageView = new ImageView(image);
        imageView.setX(240);
        imageView.setY(166);
        imageView.setFitHeight(166);
        imageView.setFitWidth(240);
        imageView.setPreserveRatio(true);
        Group root = new Group(imageView);
        getChildren().add(root);
    }
}