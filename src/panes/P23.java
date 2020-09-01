package panes;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;

import java.io.FileInputStream;

public class P23 extends Pane {
    public P23() {
        Label label = new Label("HELLO");
        getChildren().add(label);


        Image image = new Image("car.jpg");
        ImageView imageView = new ImageView(image);
        imageView.setX(100);
       // imageView.setY(100);
        getChildren().add(imageView);
        imageView.setFitHeight(166);
        imageView.setFitWidth(240);

        Button button = new Button("Click Here");
        button.setGraphic(imageView);
        //button.setOnAction(Event -> ));
        getChildren().add(button);



    }
}
