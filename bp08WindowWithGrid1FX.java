
import javafx.application.Application;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javafx.scene.*;

public class bp08WindowWithGrid1FX extends Application {

    @Override
    public void start(Stage stage) throws Exception {

        GridPane grid = new GridPane();
        grid.setGridLinesVisible(true);
        grid.setHgap(10);
        grid.setVgap(10);
        // step 1  the controls
        Button b1 = new Button("First Button");
        Button b2 = new Button("Second Button");
        Button b3 = new Button("Third");
        Button b4 = new Button("Fourth");
        // step 2  the grid pane
        GridPane.setConstraints(b1, 1, 1);  // b1 = node, 1 = column, 2 = row
        GridPane.setConstraints(b2, 2, 1);
        GridPane.setConstraints(b3, 1, 2);
        GridPane.setConstraints(b4, 2, 2);
        // steg 4  the border pane
        BorderPane borderPane = new BorderPane();
        borderPane.setTop(new Button("Top"));
        borderPane.setBottom(new Button("Bottom"));
        borderPane.setLeft(new Button("Left"));
        borderPane.setRight(new Button("Right"));
        borderPane.setCenter(new Button("Center"));
        GridPane.setConstraints(borderPane, 1, 3, 2, 1);

        // step 3  for the grid pane  ||  step 5 for the border pane
        grid.getChildren().addAll(b1, b2, b3, b4, borderPane);

        // set the scene
        Scene scene = new Scene(grid, 600, 400);
        stage.setTitle("Components (Buttons) with grids");
        stage.setAlwaysOnTop(false);
        stage.setResizable(false);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}


/* 

¤  The next file "bp09WindowWithGrid2FX.java" also uses GridPane. But there are the
   statements sorted in a slightly different way.


A general link:
->  https://docs.oracle.com/javafx/2/layout/builtin_layouts.htm

*/