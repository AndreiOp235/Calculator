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
		this.setEditable(false);
	}
	
	void adaugaText(String in)
	{
		String continut=this.getText();
		if(in=="del")
		{
			this.setText(ZonaText.removeLastCharacter(this.getText()));
		}
		else if (in == "CLR")
		{
			{
				this.setText("");
			}
		}
		else if (in == "(")
		{
			this.setText(continut+ in + " ");
		}
		else if (in == ")")
		{
			this.setText(continut+ " " + in);
		}
		else if(in =="+"||in =="-"||in =="*"||in =="�")
		{
			if (in == "�")
				in = "/";
			this.setText(continut + " " + in + " ");
		}
		else if(in=="=")
		{
			if ((continut.charAt(0) + "").equals(" ")) 
			{
			    continut=continut.substring(1);
			}
			
			this.setText(continut+ " P");
			this.setText(executabil.ruleaza(this.getText()));
			this.setText(ZonaText.removeLastCharacter(this.getText()));
		}
		else
		{
			this.setText(continut+ in);
		}
	}
}
