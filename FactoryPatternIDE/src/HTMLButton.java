
public class HTMLButton extends UIComponent {

	public HTMLButton(int Height, int Width, int XPosition, int YPosition, String content) {
		super(Height, Width, XPosition, YPosition, content);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getComponent() {
		// TODO Auto-generated method stub
		String htmlbutton = "<button type=\"button\" style=\"position: absolute; top:" + getYPosition()  + "px; left:" + getXPosition() 
		+ "px; width: " + getWidth() + "px; height:" + getHeight()  + "px; \">" + getContent() +"</button>\n";
		return htmlbutton;
	}

	
}
