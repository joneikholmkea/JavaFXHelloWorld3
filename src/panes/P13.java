package panes;

import javafx.animation.PauseTransition;
import javafx.scene.Group;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.util.Duration;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class P13 extends Pane {

    public P13 () throws FileNotFoundException {
        VBox box = new VBox();
        FileInputStream inputstream = new FileInputStream("src/assets/cow.jpeg");
        Image cow = new Image(inputstream);
        ImageView imw = new ImageView(cow);
        Label title = new Label("P13");
        Label label = new Label("");
        imw.setPreserveRatio(true);
        Group root = new Group(imw);
        Button button1 = new Button("Talk");
        button1.setOnAction(e -> {
                label.setText("MOO!");
                label.setFont(new Font(50));
                button1.setText("Shut up!");
                button1.setOnAction(event -> {
                    label.setText("Sorry i'll be quiet..");
                    label.setFont(new Font(14));
                    button1.setText("Talk");
                });
        });
        box.getChildren().addAll(title, label, root, button1);
        getChildren().addAll(box);
    }

}
