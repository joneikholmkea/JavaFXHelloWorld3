package panes;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;

public class P16 extends Pane {
    public P16(){
        ImageView grumpyCat = new ImageView("Pane16.jpg");
        grumpyCat.setFitHeight(166);
        grumpyCat.setFitWidth(240);;

        getChildren().add(grumpyCat);


    }
}
