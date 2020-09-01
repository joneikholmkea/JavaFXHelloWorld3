package panes;

import javafx.scene.Group;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class P13 extends Pane {

    public P13 () throws FileNotFoundException {
        VBox box = new VBox();
        FileInputStream inputstream = new FileInputStream("src/panes/cow.jpeg");
        Image cow = new Image(inputstream);
        ImageView imw = new ImageView(cow);
        Label label = new Label("P13");
        imw.setPreserveRatio(true);
        Group root = new Group(imw);
        Button button = new Button("Press Me!");
        button.setOnAction(e -> {
            label.setText("MOO!");
            label.setFont(new Font(100));
        });
        box.getChildren().addAll(label, root, button);
        getChildren().addAll(box);

    }

}
