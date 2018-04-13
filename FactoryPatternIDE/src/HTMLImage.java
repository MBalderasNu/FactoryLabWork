/**
 * PACKAGE_NAME.FactoryPatternIDE
 * Created by dan on 4/13/18.
 */
public class HTMLImage extends UIComponent {
    public HTMLImage(int Height, int Width, int XPosition, int YPosition, String content) {
        super(Height, Width, XPosition, YPosition, content);
    }

    @Override
    public String getComponent() {
        String htmlimage = "<img src=" + content + " alt=" + content + " height=" + getHeight() + " width=" + getWidth() + "" +
                ">";


        return htmlimage;
    }
}
