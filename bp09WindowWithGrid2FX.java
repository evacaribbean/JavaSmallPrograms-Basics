
import javafx.application.Application;
import javafx.scene.layout.GridPane;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.scene.Scene;


public class bp09WindowWithGrid2FX extends Application {

    @Override
    public void start(Stage stage) throws Exception {

        GridPane grid = new GridPane();
        grid.setMinWidth(600);
        grid.setMinHeight(400);
        grid.setVgap(5);
        grid.setHgap(20);
        grid.setGridLinesVisible(false);

        //  category Labels
        Label lab1 = new Label("\nThis is a label with for example explaining text");
        lab1.setMinWidth(500);
        GridPane.setConstraints(lab1, 1, 1, 3, 1);

        Label lab2 = new Label("...and if you wish to see the grids, just change \"false\" to \"true\"" +
                                    " in \"grid.setGridLinesVisible\".");
        lab2.setMinWidth(500);
        GridPane.setConstraints(lab2, 1, 16, 3, 1);

        //  category: two TextFields, starting with num 1
        TextField tf1 = new TextField();
        tf1.setPromptText("a promt-text (when not in focus)");
        tf1.setMinWidth(190);
        GridPane.setConstraints(tf1, 1, 2);
        //  num 2
        TextField tf2 = new TextField();
        tf2.setText("a default word");
        tf2.setMaxWidth(100);
        GridPane.setConstraints(tf2, 2, 2);

        /*  another TextField variation
        TextField taskName = new TextField();
        taskName.setPromptText("Enter the word [this is PromtText]");
        taskName.setText("Default Text");
        taskName.setMinWidth(300);
        GridPane.setConstraints(taskName, 1, 2);
        */

        //  category ComboBox
        ComboBox cbPrior = new ComboBox();
        cbPrior.getItems().addAll("High", "Low", "Medium");
        cbPrior.setPromptText("Enter Priority");
        GridPane.setConstraints(cbPrior, 1, 5);

        //  ...and the buttons add, delete, cancel
        Button addButton = new Button("Add");
        addButton.setMaxWidth(50);
        GridPane.setConstraints(addButton, 1, 8);

        Button delButton = new Button("Delete");
        addButton.setMaxWidth(50);
        GridPane.setConstraints(delButton, 2, 8);

        Button cancelButton = new Button("Cancel");
        cancelButton.setMaxWidth(57);
        GridPane.setConstraints(cancelButton, 3, 8);

        //  finally, add all controls to the scene and stage
        grid.getChildren().addAll(lab1, tf1, tf2, cbPrior, addButton,
                                  delButton, cancelButton, lab2);

        Scene scene = new Scene(grid, 750, 400);
        stage.setTitle("More Grids!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}


/*

¤  In the previous file "bp08WindowWithGrid1FX.java" the statements are sorted in a
   slightly different way. Both ways can be very useful, deppending on which part of
   the code or layout needs to be prioritized.


A general link:
->  https://docs.oracle.com/javafx/2/layout/builtin_layouts.htm

*/