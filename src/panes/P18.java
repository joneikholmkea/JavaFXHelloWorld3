package panes;

import javafx.scene.Group;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class P18 extends Pane {
    public P18() throws FileNotFoundException {
        Label label = new Label("P18");
        FileInputStream file = new FileInputStream("src/panes/jone.jpeg");
        Image img = new Image(file);
        ImageView view = new ImageView(img);
        view.setFitHeight(166);
        view.setFitWidth(240);
        view.setPreserveRatio(true);
        Button button = new Button();
        button.setGraphic(view);
        Group root = new Group(button);
        Media media = new Media(new File("src/panes/fart.mp3").toURI().toString());
        MediaPlayer mediaPlayer = new MediaPlayer(media);
        mediaPlayer.setAutoPlay(true);
        getChildren().addAll(label, root);
    }
}
