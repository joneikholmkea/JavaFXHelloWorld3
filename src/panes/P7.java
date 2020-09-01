package panes;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.RowConstraints;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class P7 extends Pane {

    public P7(){
        setStyle("-fx-background-color: #0467A9");

        GridPane pane = new GridPane();
        pane.setGridLinesVisible(true);
        pane.setMaxSize(240, 166);

        Circle circle = new Circle(20,20,20,Color.BLACK);

        Button button = new Button("Click Me");
        button.setPrefWidth(240);
        button.setOnAction(event -> {
            circle.setRadius(circle.getRadius() + 10);
        });

        //import image and add image;
        /*try {
            URL url = new URL("https://www.1designshop.com/wp-content/uploads/2019/02/1designshop-2019-02-ppl001.png");
            Image image = new Image(url.openStream());
            ImageView iv = new  ImageView(image);

            iv.setFitHeight(100);
            iv.setPreserveRatio(true);

            Button button = new Button("Click Me!");
            button.setOnAction(e -> {
                gridPane.add(iv,0,1);
            });
            gridPane.add(button,0,0);
            getChildren().add(gridPane);

        } catch(IOException fiE){
            fiE.printStackTrace();
        }*/
        RowConstraints con1 = new RowConstraints();
        RowConstraints con2 = new RowConstraints();
        con1.setPercentHeight(10);
        con2.setPercentHeight(90);
        pane.getRowConstraints().addAll(con1,con2);

        pane.add(button, 0,0);
        pane.add(circle, 0,1);
        getChildren().add(pane);

    }

}
