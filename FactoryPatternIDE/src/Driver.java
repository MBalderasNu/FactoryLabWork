

public class Driver {

	public static void main(String[] args) throws Exception {
	    
		IDECreation ic = new IDECreation(new LanguageSelection());
		ic.GenerateUI();
    }

//    @Override
//    public void start(Stage stage) throws Exception {
//        JavaFXTest jfx = new JavaFXTest();
//        jfx.start(stage);
//    }
}
