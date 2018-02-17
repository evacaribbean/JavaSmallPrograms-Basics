
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.scene.control.*;
import javafx.scene.layout.FlowPane;
import javafx.scene.paint.Color;
import javafx.scene.web.HTMLEditor;
import javafx.stage.Stage;
import javafx.scene.Scene;


public class bp07WindowWithPanesFX extends Application {

    @Override
    public void start(Stage stage) throws Exception {

        Label label1 = new Label("Here, continuing using just one pane (TextFlow). Together " +
                "with a lot of controls.                                   " +
                "                                                      \n\n" +
                "The window is resizable. Just test - drag and resize to see" +
                " how the pane \"TextFlow\" works.                          " +
                "                                                       \n\n");
        Label label2 = new Label("In the code comments you will find all the JavaFX's " +
                "predefined panes. Just test and change the pane to\n another" +
                " one to see what happens.\n\n\n");


        ProgressBar progessLine = new ProgressBar(0.4);
        Label label4 = new Label("     ");
        ProgressIndicator progessCircle = new ProgressIndicator(0.7);
        Label label5 = new Label("     ");
        TextField textField = new TextField("A text field");
        Label label6 = new Label("     ");
        CheckBox cbox1 = new CheckBox("checkbox one");
        CheckBox cbox2 = new CheckBox("checkbox two");
        cbox1.setSelected(true);

        ColorPicker colorPicker1 = new ColorPicker();
        ColorPicker colorPicker2 = new ColorPicker(Color.BISQUE);
        ColorPicker colorPicker3 = new ColorPicker(Color.web("#8066cc"));

        ScrollBar scrollBar = new ScrollBar();
        scrollBar.setMin(0);
        scrollBar.setMax(100);
        scrollBar.setValue(50);

        Slider slider = new Slider();
        slider.setMin(0);
        slider.setMax(100);
        slider.setValue(40);
        slider.setShowTickLabels(true);
        slider.setShowTickMarks(true);
        slider.setMajorTickUnit(50);
        slider.setMinorTickCount(5);
        slider.setBlockIncrement(10);

        final HTMLEditor htmlEditor = new HTMLEditor();
        htmlEditor.setPrefHeight(420);

        FlowPane tPane = new FlowPane();
        tPane.getChildren().addAll(label1, label2, progessLine, label4, progessCircle, label5,
                textField, label6, cbox1, cbox2, colorPicker1, colorPicker2,
                colorPicker3, scrollBar, slider, htmlEditor);

        Scene scene = new Scene(tPane, 604, 700);
        stage.setTitle("An ordinary resizable window with: setResizible(true), setAlwaysOnTop(false)");
        stage.setAlwaysOnTop(false);
        stage.setResizable(true);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}


/*

¤  Below are JavaFX's predefined panes:

HBox , VBox , BorderPane , StackPane , TextFlow , AnchorPane , TitlePane , GridPane, FlowPane.
The "Group" is also a kind of pane. But a more correct is to define Group as a "Layout Bound".

¤  The class named Pane is the base class of all the layouts in JavaFX. And the classes belongs
   to the package javafx.layout (each layout above represents a class). And many of the Panes
   determine the position of their children on their own.

¤  The bp-serie starts with a simple window. And for each file (program) are different panes in use.


¤  Some code tips

        //  these two statements
        RadioButton rb1 = new RadioButton();
        rb1.setText("Home");
        //  ...can instead be written like this
        RadioButton rb1 = new RadioButton("radio button 1");


        //   just a combo box
        final ComboBox comboBox = new ComboBox();
        comboBox.getItems().addAll("This", "is a", "ComboBox");

        //  just a choice box
        ChoiceBox choiceBox = new ChoiceBox(FXCollections.observableArrayList( "This", "is a", "ChoiceBox"));


        //  a plain HTML-Editor
        import javafx.application.Application;
        import javafx.scene.Scene;
        import javafx.scene.web.HTMLEditor;
        import javafx.stage.Stage;

        public class bp07WindowWithPanesFX extends Application {

            @Override
            public void start(Stage stage) {
                stage.setTitle("A HTML-Editor");
                stage.setWidth(600);
                stage.setHeight(400);
                final HTMLEditor htmlEditor = new HTMLEditor();
                htmlEditor.setPrefHeight(220);
                Scene scene = new Scene(htmlEditor);
                stage.setScene(scene);
                stage.show();
            }

            public static void main(String[] args) {
                launch(args);
            }
        }


Two general links on layouts:
->  https://docs.oracle.com/javafx/2/api/javafx/scene/layout/package-summary.html
->  https://docs.oracle.com/javafx/2/layout/builtin_layouts.htm

A link on nodes:
->  https://docs.oracle.com/javase/8/javafx/api/javafx/scene/Node.html

*/