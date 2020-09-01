package panes;

import javafx.animation.Animation;
import javafx.animation.PathTransition;
import javafx.animation.RotateTransition;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.scene.shape.CubicCurveTo;
import javafx.scene.shape.MoveTo;
import javafx.scene.shape.Path;
import javafx.util.Duration;

public class P1 extends Pane {
    public P1(){
        try {
            setPrefSize(240, 166);
            ImageView iv = new ImageView("https://scontent-cph2-1.xx.fbcdn.net/v/t1.0-9/118256153_3060651657391683_8690301605712359027_o.jpg?_nc_cat=104&_nc_sid=09cbfe&_nc_ohc=-0ae-OXWIjoAX_wGae5&_nc_ht=scontent-cph2-1.xx&oh=e0fa2e5da09b20dbcfedbf0d658ae271&oe=5F738061");
            iv.setFitHeight(166);
            iv.setFitWidth(166);

            RotateTransition rt = new RotateTransition();
            rt.setByAngle(720);
            rt.setCycleCount(Animation.INDEFINITE);
            rt.setNode(iv);
            PathTransition pt = new PathTransition();
            Path path = new Path();
            path.getElements().add (new MoveTo(0f, 50f));
            path.getElements().add (new CubicCurveTo (40f, 10f, 390f, 240f, 1904, 50f));

            pt.setDuration(Duration.millis(10000));
            pt.setNode(iv);
            pt.setPath(path);
            pt.setOrientation(PathTransition.OrientationType.ORTHOGONAL_TO_TANGENT);
            pt.setAutoReverse(true);

            pt.play();
            rt.play();
            getChildren().add(iv);
        }catch(Exception e) {
            System.out.println(e);
        }

    }
}
