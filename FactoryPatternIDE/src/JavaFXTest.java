import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 * PACKAGE_NAME.FactoryPatternIDE
 * Created by dan on 4/11/18.
 */
public class JavaFXTest {

    public JavaFXTest() {
    }

    public void start(Stage primaryStage) throws Exception {
        Button button = new Button("BUTTON");
        button.setOnAction(e -> {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Alert.");
            alert.setHeaderText(null);
            alert.setContentText("This is an alert.");
            alert.showAndWait();
        });
        StackPane root = new StackPane();
        root.getChildren().add(button);

        Scene scene = new Scene(root, 800, 600);

        primaryStage.setTitle("TEST APP");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
