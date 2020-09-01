package panes;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class P14 extends Pane {
    private static double radius = 0.0;


    //Constructor for the pane object.
    public P14() {
        Rectangle rect = new Rectangle(240,166);
        rect.setVisible(true);
        Button buttonL = new Button("Left");
        Button buttonR = new Button("Right");
        Circle circle = new Circle();
        circle.setCenterX(120);
        circle.setCenterY(83);
        circle.setVisible(true);
            buttonL.setOnAction(e -> {
                    if (radius < 80) {
                        circle.setRadius(radius += 10.0);
                    } else if (radius == 80) {
                        circle.setVisible(false);
                    }
            });


        buttonR.setOnAction(e -> {
            circle.setRadius(radius -= 10.0);
                circle.setVisible(true);
        });

        buttonR.setLayoutX(190);
        getChildren().addAll(buttonL, buttonR, circle);


    }
}
