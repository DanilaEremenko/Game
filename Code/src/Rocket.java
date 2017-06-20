import javafx.geometry.Point2D;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;


public class Rocket extends Pane {
    public Point2D velocity = new Point2D(0, 0);
    Rectangle rect;

    public Rocket() {
        rect = new Rectangle(20, 20, Color.RED);
        velocity = new javafx.geometry.Point2D(0, 0);
        setTranslateY(300);
        setTranslateX(220);
        getChildren().addAll(rect);

    }


    public void right() {
        setTranslateX(getTranslateX() + 15);
        if (getTranslateX() > 580)
            setTranslateX(580);
    }


    public void left() {
        setTranslateX(getTranslateX() - 15);
        if (getTranslateX() < 0)
            setTranslateX(0);
    }

    public void up() {
        setTranslateY(getTranslateY() - 15);
    }

    public void down() {
        setTranslateY(getTranslateY() + 15);
    }

    public void go() {
        setTranslateY(getTranslateY() - 2);
        for (Meteor meteor : SpaceAdventure.meteors) {

                if (getTranslateY() == meteor.getTranslateY()-20) {
                    setTranslateY(getTranslateY() + 1);
                    return;
                }

            if (getTranslateY() == meteor.getTranslateY()) {

            }

        }

    }

    public void Pow(){

    }
}


