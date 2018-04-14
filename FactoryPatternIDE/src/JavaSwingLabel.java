import javax.swing.JLabel;

public class JavaSwingLabel extends UIComponent{

	public JavaSwingLabel(int Height, int Width, int XPosition, int YPosition, String content) {
		super(Height, Width, XPosition, YPosition, content);
	}

	@Override
	public String getComponent() {
		String javaLabel = "JLabel a = new JLabel(" + getContent() + "); "
				+ "a.setBounds(" + getXPosition() + ", " + getYPosition() + 
				", " + getWidth()+ ", " + getHeight() + ");";
		return javaLabel;
	}

}
