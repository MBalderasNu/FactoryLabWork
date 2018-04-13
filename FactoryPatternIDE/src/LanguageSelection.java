
public class LanguageSelection extends FactoryChooser{

	@Override
	public UIComponentFactory getLanguageSelection(String language) {
		// TODO Auto-generated method stub
		UIComponentFactory factory = null;
		if(language.equals("Java"))
		{
			factory = new JavaFactory();
		}
		
		else if(language.equals("HTML"))
		{
			factory = new HTMLComponentFactory();
		}
		return factory;
	}

	@Override
	public String[] getLanguageList() {
		// TODO Auto-generated method stub
		return new String[] {"HTML","Java"};
	}

}
