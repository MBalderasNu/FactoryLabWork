import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

public class JavaIDE {
	public static void main(String[] args) { 
		JFrame f = new JFrame(); 
		f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		JPanel p = new JPanel();p.setLayout(null);
		JButton button = new JButton("test"); button.setBounds(25, 25, 25, 25);
		p.add(button);
		f.add(p);f.setSize(800, 500);f.setVisible(true);}
}