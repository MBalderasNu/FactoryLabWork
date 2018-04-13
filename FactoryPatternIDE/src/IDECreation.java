import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

public class IDECreation {
	/*
	 * GUI used to select actual IDE created
	 * 
	 */

	UIComponentFactory Factory;
	UIComponent component = null;
	String value = "";
	FactoryChooser languageSelection;
	ArrayList<UIComponent> components = new ArrayList<UIComponent>();
	
	public IDECreation(FactoryChooser languageSelection) {
		
		super();
		this.languageSelection = languageSelection;
	}
	
	public void GenerateUI() {
		
		JFrame f = new JFrame();
		f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		
		JPanel p = new JPanel();
		p.setLayout(null);

		//----------------languages available--------------
		JComboBox languageList = new JComboBox(languageSelection.getLanguageList());
		languageList.setBounds(200, 200, 400, 50);
		value = languageList.getSelectedItem().toString();
		Factory = languageSelection.getLanguageSelection(value);
		languageList.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				value = languageList.getSelectedItem().toString();
				Factory = languageSelection.getLanguageSelection(value);
			}
		});
		p.add(languageList);
		
		//-----------Clicked, Triggers Attributes UI--------
		JButton addbutton = new JButton("AddComponent");
		addbutton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				//String value = 
						openComponentUI();
			}
		});
		addbutton.setBounds(200, 250, 200, 30);
		p.add(addbutton);
		
		//---------Will build the IDE-----------
		JButton build= new JButton("Build");
		build.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Factory.build();
			}
		});
		build.setBounds(400, 250, 200, 30);
		p.add(build);
		
		
		//Label above the JComboBox
		JLabel label = new JLabel("IDE Creator");
		label.setBounds(350, 10, 100, 200);
		p.add(label);
		

		f.add(p);
		f.setSize(800, 500);
		f.setVisible(true);
	}
	
	private void openComponentUI() {
		String value ="HTML";
		JFrame f = new JFrame();
		f.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		JPanel p = new JPanel();
		p.setLayout(null);
		
		//----------X Label and X Field
		JLabel xlbl = new JLabel("X:");
		xlbl.setBounds(10, 55, 15, 10);
		p.add(xlbl);
		
		JTextField x = new JTextField();
		x.setBounds(50, 50, 100, 20);
		p.add(x);
		
		
		//----------Y Label and Y Field
		JLabel ylbl = new JLabel("Y:");
		ylbl.setBounds(10, 75, 15, 10);
		p.add(ylbl);
		
		JTextField y = new JTextField();
		y.setBounds(50, 70, 100, 20);
		p.add(y);
		
		
		//---------Height Label and Height Field
		JLabel heightlbl = new JLabel("Height:");
		heightlbl.setBounds(10, 90, 100, 18);
		p.add(heightlbl);
		
		JTextField height = new JTextField();
		height.setBounds(50, 90, 100, 20);
		p.add(height);
		
		//-----------Width Label and Width Field
		JLabel widthlbl = new JLabel("Width:");
		widthlbl.setBounds(10, 116, 100, 10);
		p.add(widthlbl);
		
		
		JTextField width = new JTextField();
		width.setBounds(50, 110, 100, 20);
		p.add(width);
		
		//----------Text Label and Text Field---------
		JLabel textlbl = new JLabel("Text:");
		textlbl.setBounds(10, 35, 100, 10);
		p.add(textlbl);
		
		JTextField string = new JTextField();
		string.setBounds(50, 30, 100, 20);
		p.add(string);
		
		//----------Submit Button
		JButton button = new JButton("Submit");
		button.setBounds(160, 50, 100, 50);
		p.add(button);
		
		String[] compStrings =  Factory.getOptions();
		
		JComboBox componentList = new JComboBox(compStrings);
		componentList.setBounds(85, 130, 100, 25);
		p.add(componentList);
		f.add(p);
		f.setSize(400, 300);
		f.setVisible(true);
		button.addActionListener(new ActionListener() {
			
			@Override 
			public void actionPerformed(ActionEvent e) {
				String compType = componentList.getSelectedItem().toString(); 
				int numx = Integer.parseInt(x.getText());
				int numy = Integer.parseInt(y.getText());
				int numheight = Integer.parseInt(height.getText());
				int numwidth = Integer.parseInt(width.getText());
			    component = Factory.createComponent(numx, numy, numheight, numwidth, string.getText(), compType);
				components.add(component);
				f.setVisible(false);
				
			}
		});
	}
	
}
