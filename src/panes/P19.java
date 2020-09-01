package panes;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;

public class P19 extends Pane {
    public P19() {
        VBox vb = new VBox();
        Label l = new Label ();
        Button bt = new Button("Klik her ;)");
        vb.getChildren().addAll(bt, l);
        bt.setStyle("-fx-font: 40 arial; -fx-base: #b6e7c9; -fx-alignment: baseline-center");
        l.setStyle("-fx-font: 55 arial; -fx-alignment: bottom-center");
        bt.setOnAction(e -> {
            l.setText("Flotte :*");

        });
        getChildren().add(vb);
    }
}
