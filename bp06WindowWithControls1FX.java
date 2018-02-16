
import javafx.application.Application;
import javafx.scene.layout.FlowPane;
import javafx.scene.control.RadioButton;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import javafx.scene.Scene;


public class bp06WindowWithControls1FX extends Application {

    @Override
    public void start(Stage stage) throws Exception {

        FlowPane fPane = new FlowPane();
        fPane.getChildren().addAll(new Label(" This is a label to Button A "),
                                   new Button("Button A"),
                                   new Label(" This is a label to Button B "),
                                   new Button("Button B"),
                                   new Label(" This is a label to the Radio button "),
                                   new RadioButton("A Radio button"),
                                   new Label("\nIn the next the file \"bp07WindowWithPanesFX.java\" you" +
                                           " will find even more controls.\nBut here you can also test" +
                                           " to see what happens when you change panes. In the code\ncomments" +
                                           " to that file your will find all the JavaFX's predefined panes."));

        Scene scene = new Scene(fPane, 700, 500);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}


/*

¤  In this file will the elements (controls) show "in a flow" (FlowPane).
Every control will simply just place itself next to the previous one. And
when the row is full of controls, continue on the next row.

When running the program, you can easily check this by resize the window.


¤  File "bp08WindowWithGrid1FX.java" will show a more effective way on how
to coding, giving the controls a static location. This is done by the pane:
"Group" (or more correct the "layout bound": Group).

Here you will have the oppertunity to give each and every control an exact
position.


A general link on FX controls:
->  https://docs.oracle.com/javafx/2/ui_controls/overview.htm

*/