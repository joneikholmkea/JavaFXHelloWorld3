package panes;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class P13 extends Pane {

    public P13 () throws FileNotFoundException {
        VBox box = new VBox();
        FileInputStream inputstream = new FileInputStream("src/panes/cow.jpeg");
        Image cow = new Image(inputstream);
        ImageView imw = new ImageView(cow);
//        imw.setX(50);
//        imw.setY(200);
//        imw.setFitHeight(166);
//        imw.setFitWidth(240);
        Label label = new Label("P13");
        imw.setPreserveRatio(true);
        Group root = new Group(imw);
        Button button = new Button("Press Me!");
        button.setOnAction(e -> label.setText("MOO!"));
        box.getChildren().addAll(label, root, button);
        getChildren().addAll(box);

    }

}
