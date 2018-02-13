
import javafx.application.Application;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.layout.FlowPane;
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
                                   new RadioButton("A Radio button"));

        Scene scene = new Scene(fPane, 700, 500);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}


/*

¤  In this file will the elements (controls) show "in a flow" as it is "FlowPane" that is
the chosen pane. That means that the controls will place themselves in a row and just
continue on the next row, when the have reached the end of the window.

You can easily check this by resize the window, when you run the program.


¤  File "bp09WindowWithControls2FX.java" will show one effective way on how to instead coding,
giving the controls a static location. This is done by the pane "Group" (or more correct
the "layout bound": Group).

Here you have the oppertunity to give each and every control an exact position.


A general link on FX controls  ->  https://docs.oracle.com/javafx/2/ui_controls/overview.htm

*/