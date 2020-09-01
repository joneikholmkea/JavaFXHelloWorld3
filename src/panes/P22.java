package panes;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.TilePane;

public class P22 extends Pane{
        public P22(){
            Label label = new Label("Now its begin");
            Button button1 = new Button("Click on me");
            Button button2 = new Button("Click");
            getChildren().add(label);
            getChildren().addAll(button1, button2);
            button1.setMinWidth(200);
            button1.setMaxWidth(400);
            button1.setPrefWidth(1000);
            button2.setMinWidth(100);
            button2.setMaxWidth(200);
            button2.setPrefWidth(100);

        }
}
