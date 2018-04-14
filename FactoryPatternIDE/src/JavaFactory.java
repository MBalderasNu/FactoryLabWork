import java.awt.Desktop;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class JavaFactory extends UIComponentFactory{

	@Override
	public UIComponent createComponent(int height, int width, int xposition, int yposition, String content,
			String type) {
		UIComponent javacomponent = null;
		if(type.equals("Label")) {
			javacomponent = new JavaSwingLabel(height, width, xposition, yposition, content);
		}
		
		if(type.equals("Button")) {
			javacomponent = new JavaSwingButton(height, width, xposition, yposition, content);
		}
		
		if(javacomponent != null) {
			components.add(javacomponent);
		}
		
		return javacomponent;
	}

	@Override
	public String[] listComponents() {
		String[] componentsList = new String[components.size()];
		for(int i = 0; i < components.size(); i++) {
			componentsList[i] = components.get(i).toString();
		}
		return componentsList;
	}

	@Override
	public void build() {
		// TODO Auto-generated method stub
		// make filler file
		// compile it using javac saidfile
		// run java saidfile
		String dir = System.getProperty("user.dir");
        dir = dir + "/JavaIDE.java";
        File file = new File(dir);
        try {

            FileWriter f = new FileWriter(file);
            f.write("public class JavaIDE { "
            		+ "public static void main(String[] args) { "
            		+ "System.out.println(\"Test\");");
            for (UIComponent ui : components) {

                f.write(ui.getComponent());
            }
            f.write("}}");
            f.close();


        } catch (IOException e) {
            e.printStackTrace();
        }
        run();
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		 String dir = System.getProperty("user.dir");
        dir = dir + "/JaveIDE.java";
        //load up the page
        try {
//				devEnv.executeCommand("rundll32 url.dll,FileProtocolHandler \""+dir+"\"", false);
            if (Desktop.isDesktopSupported()) {
                Desktop desktop = Desktop.getDesktop();
                File file = new File(dir);
                //breaks here saying cannot find file
                desktop.open(new File(dir));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
	}

	@Override
	public String[] getOptions() {
		// TODO Auto-generated method stub
		String[] options = new String[] {"Label", "Button"};
		return options;
	}

	
}
