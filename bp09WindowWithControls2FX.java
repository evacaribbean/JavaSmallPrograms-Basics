
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;


public class bp09WindowWithControls2FX extends Application {

    @Override
    public void start(Stage stage) throws Exception {

        Button b1 = new Button("Button 1");
        Button b2 = new Button("Button 1");
        Button b3 = new Button("Button 1");
        Button b4 = new Button("Button 1");

        Label la1 = new Label("text");
        Label la2 = new Label("text");

        TextField t1 = new TextField("text");

        Group group = new Group();
        group.getChildren().addAll(b1, b2, b3, b4, la1, la2, t1);

        b1.setLayoutX(20); b1.setLayoutY(20);
        b2.setLayoutX(20); b2.setLayoutY(60);
        b3.setLayoutX(20); b3.setLayoutY(100);
        b4.setLayoutX(20); b4.setLayoutY(140);

        la1.setLayoutX(20); la1.setLayoutY(170);
        la2.setLayoutX(20); la2.setLayoutY(210);

        t1.setLayoutX(20); t1.setLayoutY(240);

        Scene scene = new Scene(group, 700, 500);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) { Application.launch(args); }
}


/*

¤  Unlike the previous file "bp06WindowWithControls1FX.java", in this file you have the
oppertunity to give each and every control an exact position.

This is done by using the layout bound: "Group", together with the two properties:
setLayoutX() and setLayoutY().


¤  More on panes and grids in the files bp07... and bp08... .


¤  A general link on FX controls  ->  https://docs.oracle.com/javafx/2/ui_controls/overview.htm

 */