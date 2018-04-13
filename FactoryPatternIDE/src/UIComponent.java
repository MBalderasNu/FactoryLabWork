
public abstract class UIComponent {
	
	int Height;
	int Width;
	int XPosition;
	int YPosition;
	String content;
	
	public UIComponent(int Height, int Width, int XPosition, int YPosition, String content) {
		
		this.Height = Height;
		this.Width = Width;
		this.XPosition = XPosition;
		this.YPosition = YPosition;
		this.content = content;
	}
	
	public abstract String getComponent();

	public int getHeight() {
		return Height;
	}

	public void setHeight(int height) {
		Height = height;
	}

	public int getWidth() {
		return Width;
	}

	public void setWidth(int width) {
		Width = width;
	}

	public int getXPosition() {
		return XPosition;
	}

	public void setXPosition(int xPosition) {
		XPosition = xPosition;
	}

	public int getYPosition() {
		return YPosition;
	}

	public void setYPosition(int yPosition) {
		YPosition = yPosition;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

}
