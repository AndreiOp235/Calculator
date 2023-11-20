package lab07;

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
	}
}
