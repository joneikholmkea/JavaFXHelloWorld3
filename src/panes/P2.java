package panes;

import javafx.event.EventHandler;
import javafx.scene.control.Label;
import javafx.scene.effect.*;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;

import java.net.MalformedURLException;
import java.net.URL;

public class P2 extends Pane {
    public P2(){
        setPrefSize(240, 166);
        ImageView imageView = new ImageView("https://images-wixmp-ed30a86b8c4ca887773594c2.wixmp.com/i/e9b3fdce-7da1-4ee9-a836-47b97195018d/d8uq43y-6df1ceae-7051-4202-abc2-53cbc873f2df.png");
        imageView.setFitHeight(166);
        imageView.setFitWidth(240);
        imageView.setAccessibleText("Click me for mood change");

        // Setting a reflection on the image
        Reflection reflection = new Reflection();
        reflection.setBottomOpacity(0.0);
        reflection.setTopOpacity(0.5);
        reflection.setTopOffset(0.0);
        reflection.setFraction(0.7);
        //imageView.setEffect(reflection);

        Bloom bloom = new Bloom();
        bloom.setThreshold(0.1);
        imageView.setEffect(bloom);

        // Setting up light effect
        Light.Point light = new Light.Point();
        light.setColor(Color.GRAY);
        light.setX(70);
        light.setY(55);
        light.setZ(45);
        Lighting lighting = new Lighting();
        lighting.setLight(light);

        imageView.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {

            @Override
            public void handle(MouseEvent event) {
                if(imageView.getEffect() == lighting){
                    imageView.setEffect(bloom);
                }
                else{
                    imageView.setEffect(lighting);
                }
                event.consume();
            }
        });


        getChildren().add(imageView);
    }
}
