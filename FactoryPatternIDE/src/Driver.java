import javafx.application.Application;
import javafx.stage.Stage;

public class Driver extends Application {

	public static void main(String[] args) throws Exception {
	    launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        JavaFXTest jfx = new JavaFXTest();
        jfx.start(stage);
    }
}
