
public class HTMLLabel extends UIComponent {

	public HTMLLabel(int Height, int Width, int XPosition, int YPosition, String content) {
		super(Height, Width, XPosition, YPosition, content);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getComponent() {
		// TODO Auto-generated method stub
		String htmllabel = "<p style=\"position:absolute; top:" + getYPosition()  + "px; left:" + getXPosition() + "px; width:" + getWidth() + "px; height:" + getHeight()  + "px; \">" + getContent() +"</p>\n";
		return htmllabel;
	}

}
