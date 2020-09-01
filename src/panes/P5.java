package panes;

import javafx.animation.ScaleTransition;
import javafx.application.Application;
import javafx.beans.property.StringProperty;
import javafx.scene.Group;
import javafx.scene.PerspectiveCamera;
import javafx.scene.Scene;
import javafx.scene.SnapshotParameters;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.paint.PhongMaterial;
import javafx.scene.shape.CullFace;
import javafx.scene.shape.Sphere;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.scene.transform.Rotate;
import javafx.scene.transform.Scale;
import javafx.scene.transform.Translate;
import javafx.stage.Screen;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.util.Random;

public class P5 extends Pane {


    VBox vbox = new VBox(8);

    public P5()
    {

        setMaxSize(240, 166);


        Button button = new Button("Click");
//        button.setStyle("-fx-border-width: 100");
//        button.setStyle("-fx-border-height: 100");

     //  button.setOnAction((event) -> {    // lambda expression





                Sphere sphere1 = new Sphere();

                //Setting the radius of the Sphere
                sphere1.setRadius(50.0);



                    sphere1.setCullFace(CullFace.BACK);
                    sphere1.setTranslateX(100);
                    sphere1.setTranslateY(100);

       animationGrow(sphere1);
       animationElongate(sphere1);

        //Displaying the contents of the stage
                    //   });

                    //getChildren().addAll(button, vbox);
                getChildren().addAll(sphere1);



            //setting the cull face of the sphere to front



            //Creating a scene object









    }


    private void animationGrow(Sphere sphere) {

        ScaleTransition scaleTransition = new ScaleTransition();

        //Setting the duration for the transition
        scaleTransition.setDuration(Duration.millis(1000));

        //Setting the node for the transition
        scaleTransition.setNode(sphere);

        //Setting the dimensions for scaling
        scaleTransition.setByY(1.5);
        scaleTransition.setByX(1.5);


        //Setting the cycle count for the translation
        scaleTransition.setCycleCount(10);

        //Setting auto reverse value to true
        scaleTransition.setAutoReverse(true);

        //Playing the animation
        scaleTransition.play();


    }

    private void animationElongate(Sphere sphere) {

        ScaleTransition scaleTransition = new ScaleTransition();


        //Setting the duration for the transition
        scaleTransition.setDuration(Duration.millis(1000));

        //Setting the node for the transition
        scaleTransition.setNode(sphere);

        //Setting the dimensions for scaling
        scaleTransition.setByY(0);
        scaleTransition.setByX(4);


        //Setting the cycle count for the translation
        scaleTransition.setCycleCount(10);

        //Setting auto reverse value to true
        scaleTransition.setAutoReverse(true);

        //Playing the animation
        scaleTransition.play();


    }

}
