import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class HTMLComponentFactory extends UIComponentFactory {

	@Override
	public UIComponent createComponent(int height, int width, int xposition, int yposition, String content,
			String type) {
		// TODO Auto-generated method stub
		UIComponent htmlcomponent = null;
		if(type.equals("Label")) {
			
			htmlcomponent = new HTMLLabel(height,width,xposition,yposition,content);
		}
		
		if(type.equals("Button")) {
			
			htmlcomponent = new HTMLButton(height,width,xposition,yposition,content);
		}
	
		if(htmlcomponent != null) {
			
			components.add(htmlcomponent);
		}
		return htmlcomponent;
	}

	@Override
	public String[] listComponents() {
		// TODO Auto-generated method stub
		String[] componentslist = new String[components.size()];
		for(int i = 0; i < components.size(); i++) {
			
			componentslist[i] = components.get(i).toString();
		}
		return componentslist;
	}

	@Override
	public void build() {
		// TODO Auto-generated method stub
		//builds the html text file
		String dir = System.getProperty("user.dir");
		dir = dir + "HTMLSolution.html";
		File file = new File(dir);
		try {
			
			FileWriter f = new FileWriter(file);
			f.write("<DOCTYPE html><html><body>\n");
			for(UIComponent ui: components) {
				
				f.write(ui.getComponent());
			}
			f.write("</body></html>");
			f.close();
			
			
		} catch(IOException e) {
			e.printStackTrace();
		}
		run();
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		//opening html page
		String dir = System.getProperty("user.dir");
		dir = dir + "HTMLSolution.html";
		//load up the page
		try {
			devEnv.executeCommand("rundll32 url.dll,FileProtocolHandler \""+dir+"\"", false);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public String[] getOptions() {
		// TODO Auto-generated method stub
		String[] options = new String[] {"Label","Button"};
		return options;
	}

}
