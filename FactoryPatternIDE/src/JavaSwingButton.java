import javax.swing.JButton;

public class JavaSwingButton extends UIComponent{
	
	public JavaSwingButton(int Height, int Width, int XPosition, int YPosition, String content) {
		super(Height, Width, XPosition, YPosition, content);
	}

	@Override
	public String getComponent() {
		String javaButton = "JButton button = new JButton(\"" + getContent() +"\"); "
				+ "button.setBounds(" + getXPosition() + ", " + getYPosition() + 
				", " + getWidth() + ", " + getHeight() + ");";
		return javaButton;
	}

}
