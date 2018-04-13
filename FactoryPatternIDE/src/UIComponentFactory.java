import java.util.ArrayList;

public abstract class UIComponentFactory {

	protected DevEnvironment devEnv = new DevEnvironment();
	protected ArrayList<UIComponent> components = new ArrayList<UIComponent>();
	public abstract UIComponent createComponent(int height, int width, int xposition, int yposition,String content, String type);
	public abstract String[] listComponents();
	public abstract void build();
	public abstract void run();
	public abstract String[] getOptions();
}
