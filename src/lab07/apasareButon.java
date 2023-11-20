package lab07;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class apasareButon implements ActionListener {
    ZonaText z;

    public apasareButon(ZonaText z) {
        this.z = z;
    }
    
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() instanceof JButton) {
	        JButton clickedButton = (JButton) e.getSource();
	        z.adaugaText(clickedButton.getText());
	    }
	}
}
