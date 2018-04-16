
public class HTMLTextArea extends UIComponent {

	public HTMLTextArea(int Height, int Width, int XPosition, int YPosition, String content) {
		super(Height, Width, XPosition, YPosition, content);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getComponent() {
		// TODO Auto-generated method stub
		String htmltextarea = "<textarea name=" + content + "cols=" + getWidth() + "rows=" +getHeight() + ">";
		return htmltextarea;
	}

}
