
import javafx.application.Application;
import javafx.scene.layout.StackPane;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javafx.scene.Scene;


public class bp03WindowFX extends Application {

    @Override
    public void start(Stage stage) throws Exception {

        StackPane sPane = new StackPane();
        sPane.getChildren().add(new Button("En Knapp"));

        Scene scene = new Scene(sPane, 700, 500);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) { Application.launch(args); }
}



//  https://docs.oracle.com/javafx/2/get_started/jfxpub-get_started.htm         