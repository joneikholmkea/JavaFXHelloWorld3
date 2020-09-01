package panes;

import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;

public class P3 extends Pane {
    public P3() {
        ImageView imageView = new ImageView("https://pictures.topspeed.com/IMG/crop/201303/2014-ferrari-laferrari-2_800x0w.jpg");
        imageView.setFitHeight(166);
        imageView.setFitWidth(240);;

        getChildren().add(imageView);

    }
}
