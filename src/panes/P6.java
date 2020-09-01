package panes;

import javafx.animation.FadeTransition;
import javafx.animation.RotateTransition;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.transform.Rotate;
import javafx.util.Duration;

import java.io.IOException;
import java.net.URI;
import java.net.URL;

public class P6 extends Pane {

    boolean aBoolean = false;

    public P6() throws IOException {
        setMaxSize(240,166);
        Label label = new Label("Down touch the Creeper!!!!");
        label.setStyle("-fx-text-fill: RED");
        Pane pane = new Pane();
        pane.setMinSize(240, 166);
        pane.setMaxSize(240, 166);
        pane.setStyle("-fx-background-color: WHITE;");

        Rectangle rect = new Rectangle(95,58,50,50);
        rect.setFill(Color.RED);

        ImageView iv = new ImageView();
        URL url = new URL("https://www.seekpng.com/png/small/95-954829_creeper-head-png-vector-royalty-free-stock-jinx.png");
        Image image = new Image(url.openStream());
        iv.setImage(image);
        iv.setFitWidth(120);
        iv.setPreserveRatio(true);
        iv.setX(60);
        iv.setY(23);

        RotateTransition rotate = new RotateTransition();
        rotate.setAxis(Rotate.Z_AXIS);
        rotate.setByAngle(1920);
        rotate.setCycleCount(500);
        rotate.setDuration(Duration.millis(2000));
        rotate.setAutoReverse(true);
        rotate.setNode(iv);

        iv.setOnMouseClicked(me -> {
                    label.setStyle("-fx-font-size: 40");
                    label.setText("RUN");
                    rotate.play();
                    aBoolean = true;

                    if(aBoolean == true);
            });







        pane.getChildren().addAll(iv,label);
        getChildren().add(pane);





    }
}
