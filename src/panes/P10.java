package panes;

import javafx.animation.Animation;
import javafx.animation.RotateTransition;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.util.Duration;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;


//høj 166
//bred 240
public class P10 extends Pane{
    public P10(){

        //getStylesheets().add(file.getAbsolutePath());
        setMaxSize(240,166);
        setMinSize(240,166);

        ImageView view = new ImageView();
        try {
            Image image = new Image(
                    new FileInputStream("src/assets/images.jpeg"));
            view.setImage(image);

            view.setFitHeight(166);
            view.setFitWidth(240);
            view.setX(10);
            view.setPreserveRatio(true);
            view.setVisible(false);

            getChildren().add(view);
        }
        catch (FileNotFoundException e){
            System.out.println(e.getMessage());
        }



        Button button = new Button("hej");
        button.getStyleClass().add("button-1");
        button.setStyle("-fx-background-color: brown");
        button.setStyle("-fx-font-size: 85px");
        button.setOnAction(e -> {
            button.setVisible(false);
            view.setVisible(true);
            try {

                String musicFile = "src/music.mp3";

                Media sound = new Media(new File (musicFile).toURI().toString());
                MediaPlayer mediaPlayer = new MediaPlayer(sound);
                mediaPlayer.play();

            }
            catch (Exception error1){
                try {
                    String musicFile = "src/file_example_WAV_10MG.wav";

                    Media sound = new Media(new File (musicFile).toURI().toString());
                    MediaPlayer mediaPlayer = new MediaPlayer(sound);
                    mediaPlayer.play();
                }
                catch (Exception error2){
                    System.out.println("no music!!!!! SAD");
                }
            }

        });

        getChildren().add(button);

        RotateTransition rt = new RotateTransition(Duration.millis(300), view);
        rt.setByAngle(214);
        rt.setCycleCount(Animation.INDEFINITE);
        rt.setAutoReverse(true);

        rt.play();

    }

}