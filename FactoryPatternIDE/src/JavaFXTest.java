import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * PACKAGE_NAME.FactoryPatternIDE
 * Created by dan on 4/11/18.
 */
public class JavaFXTest {

    public JavaFXTest() {
    }

    public void start(Stage primaryStage) throws Exception {
        ComboBox box = new ComboBox();
        box.getItems().addAll(
                "Java",
                "HTML");
        box.getSelectionModel().selectFirst();

        Button button = new Button("BUTTON");
        button.setOnAction(e -> {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Alert.");
            alert.setHeaderText(null);
            alert.setContentText("The selected item is: " + box.getValue());
            alert.showAndWait();
        });
        VBox root = new VBox();
        root.getChildren().add(button);
        root.getChildren().add(box);

        Scene scene = new Scene(root, 800, 600);

        primaryStage.setTitle("TEST APP");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
