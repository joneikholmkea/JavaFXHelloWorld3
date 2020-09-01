package panes;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;

public class P4 extends Pane {

    public P4() {

        Image image = new Image("https://kea.dk/images/DA/Presse/Downloads/KEA_logo_DK_Web.jpg");
        ImageView imageView = new ImageView(image);
        imageView.setFitHeight(166);
        imageView.setFitWidth(240);

        getChildren().add(imageView);
    }
}
