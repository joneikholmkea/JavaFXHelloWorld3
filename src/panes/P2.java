package panes;

import javafx.scene.control.Label;
import javafx.scene.effect.*;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;

import java.net.MalformedURLException;
import java.net.URL;

public class P2 extends Pane {
    public P2(){
        setPrefSize(240, 166);
        ImageView imageView = new ImageView("https://images-wixmp-ed30a86b8c4ca887773594c2.wixmp.com/i/e9b3fdce-7da1-4ee9-a836-47b97195018d/d8uq43y-6df1ceae-7051-4202-abc2-53cbc873f2df.png");
        imageView.setFitHeight(166);
        imageView.setFitWidth(240);

        // Setting a reflection on the image
        Reflection reflection = new Reflection();
        reflection.setBottomOpacity(0.0);
        reflection.setTopOpacity(0.5);
        reflection.setTopOffset(0.0);
        reflection.setFraction(0.7);
        imageView.setEffect(reflection);

        getChildren().add(imageView);
    }
}
