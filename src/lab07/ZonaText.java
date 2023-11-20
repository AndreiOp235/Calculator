package lab07;

import javax.swing.JTextArea;

public class ZonaText extends JTextArea{
	public static String removeLastCharacter(String input) {
        if (input == null || input.isEmpty()) {
            return input;
        }
        return input.substring(0, input.length() - 1);
    }
	
	
	private static final long serialVersionUID = 1L;
	ZonaText()
	{
		setBounds(10, 10, 360, 100);
	}
	
	void adaugaText(String in)
	{
		String continut=this.getText();
		if(in=="del")
		{
			this.setText(ZonaText.removeLastCharacter(this.getText()));
		}
		else if(in =="+"||in =="-"||in =="*"||in =="÷")
		{
			if (in == "÷")
				in = "/";
			this.setText(continut+ " " + in + " ");
		}
		else if(in=="=")
		{
			this.setText(continut+ " P");
			this.setText(executabil.ruleaza(this.getText()));
		}
		else
		{
			this.setText(continut+ in);
		}
	}
}
