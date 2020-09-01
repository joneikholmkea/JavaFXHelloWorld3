package panes;

import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class P15 extends Pane {
    public P15() {
        ImageView pic = new ImageView("blueface.png");
        pic.setFitHeight(166);
        pic.setFitWidth(240);

        getChildren().add(pic);
    }

}
