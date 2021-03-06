
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import javafx.scene.Scene;


public class bp10WindowWithControls2FX extends Application {

    @Override
    public void start(Stage stage) throws Exception {

        Button b1 = new Button("...a long button with some text attached");
        Button b2 = new Button("Button 1");
        Button b3 = new Button("Button 2");
        Button b4 = new Button("Button 3");

        Label la1 = new Label("Below follow Button 1 and Button 2");
        Label la2 = new Label("Below follows Button 3");

        TextField t1 = new TextField("...here is a text field and...");

        Group group = new Group();
        group.getChildren().addAll(b1, b2, b3, b4, la1, la2, t1);

        t1.setLayoutX(20); t1.setLayoutY(20);
        b1.setLayoutX(20); b1.setLayoutY(60);

        la1.setLayoutX(20); la1.setLayoutY(140);
        b2.setLayoutX(20); b2.setLayoutY(165);
        b3.setLayoutX(20); b3.setLayoutY(195);

        la2.setLayoutX(20); la2.setLayoutY(240);
        b4.setLayoutX(20); b4.setLayoutY(265);

        Scene scene = new Scene(group, 700, 500);
        stage.setTitle("More Buttons!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) { Application.launch(args); }
}


/*

¤  Unlike the previous file "bp06WindowWithControls1FX.java", this file places each and
   every control in an exact location.

   This is done by using the Layout Bound: "Group", together with the two properties:
   setLayoutX() and setLayoutY().


¤  More on panes and grids in the files: "bp07..." and "bp08..." .


A collection link on FX controls:
->  https://docs.oracle.com/javafx/2/ui_controls/jfxpub-ui_controls.htm

 */