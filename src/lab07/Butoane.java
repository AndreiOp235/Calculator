package lab07;

import java.awt.Font;

import javax.swing.JButton;

public class Butoane extends JButton{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	Butoane(String t, int x, int y)
	{
		setText(t);
		setBounds(x, y, 90, 90);
		Font buttonFont = new Font(getFont().getName(), Font.BOLD, getFont().getSize() + 4);
        setFont(buttonFont);
	}
}
