import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class JavaFactory extends UIComponentFactory {

    @Override
    public UIComponent createComponent(int height, int width, int xposition, int yposition, String content,
                                       String type) {
        UIComponent javacomponent = null;
        if (type.equals("Label")) {
            javacomponent = new JavaSwingLabel(height, width, xposition, yposition, content);
        }

        if (type.equals("Button")) {
            javacomponent = new JavaSwingButton(height, width, xposition, yposition, content);
        }

        if (javacomponent != null) {
            components.add(javacomponent);
        }

        return javacomponent;
    }

    @Override
    public String[] listComponents() {
        String[] componentsList = new String[components.size()];
        for (int i = 0; i < components.size(); i++) {
            componentsList[i] = components.get(i).toString();
        }
        return componentsList;
    }

    @Override
    public void build() {
        // TODO Auto-generated method stub
        String dir = System.getProperty("user.dir");
        dir = dir + "/src/JavaIDE.java";
        File file = new File(dir);
        try {

            FileWriter f = new FileWriter(file);
            f.write("import javax.swing.JButton;import javax.swing.JFrame;import javax.swing.JPanel;import javax.swing.WindowConstants;"
                    + "public class JavaIDE { "
                    + "public static void main(String[] args) { "
                    + "JFrame f = new JFrame(); "
                    + "f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);"
                    + "JPanel p = new JPanel();"
                    + "p.setLayout(null);");
            for (UIComponent ui : components) {
                System.out.println(ui);
                f.write(ui.getComponent());
//                f.write("p.add()");
            }
            f.write("f.add(p);"
                    + "f.setSize(800, 500);"
                    + "f.setVisible(true);}}");
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
        String outDir = "\"\"" + dir + "/out/production/FactoryPatternIDE\"\"";
        dir = "\"\"" + dir + "/src/JavaIDE.java\"\"";
        //load up the page
        outDir = outDir.replace(" ", "\\\\ ");
        dir = dir.replace(" ", "\\\\ ");
        try {
            //needs the output of where the compiler is going to be
//        	devEnv.executeCommand("C:\\Program Files\\Java\\jdk1.8.0_60\\bin\\javac.exe\" -d  \""+dir+"\"", true);
            devEnv.executeCommand("javac -d " + outDir + " " + dir, true);
            //needs the output of where the compiler is going to be
//        	devEnv.executeCommand("C:\\Program Files\\Java\\jdk1.8.0_60\\bin\\java\" -classpath  \""+dir+"\"", true);
            devEnv.executeCommand("java -classpath " + outDir + " JavaIDE", true);


//			devEnv.executeCommand("rundll32 url.dll,FileProtocolHandler \""+dir+"\"", false);
//            if (Desktop.isDesktopSupported()) {
//                Desktop desktop = Desktop.getDesktop();
//                File file = new File(dir);
//                //breaks here saying cannot find file
//                desktop.open(new File(dir));
//            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public String[] getOptions() {
        // TODO Auto-generated method stub
        String[] options = new String[]{"Label", "Button"};
        return options;
    }


}
