package lab07;

import javax.swing.*;
import java.awt.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class TestPrb03 {
	static String caleEXEC="F:\\WIP\\C++\\Playground\\Project1\\x64\\Debug";
	public static void main(String[] args) {
		String argumente[]= {"7","8","9","del","4","5","6","÷","1","2","3","*","+","0","-","CLR","(",".",")","="};
		
		System.out.println("Neata !");
		JFrame gui= new JFrame("Calculator");
		gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		gui.setSize(395,610);
		ZonaText z=new ZonaText();
		
		gui.getContentPane().setBackground(Color.cyan);
		gui.setLayout(null);
		apasareButon buttonListener = new apasareButon(z);
		
		Butoane b[]=new Butoane[20];
		
		for(int i=1;i<=20;i++)
		{
			b[i-1]=new Butoane(argumente[i-1],10+((i-1)%4)*90,115+((i-1)/4)*90);
			gui.add(b[i-1]);
			b[i - 1].addActionListener(buttonListener);
		}
		
		b[3].setBackground(new Color(255,0,0)); //here add a color theme for the background of the buttons
		
		b[0].setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0, 0), (int) (0.01 * b[0].getWidth())));
		b[1].setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0, 0), (int) (0.01 * b[1].getWidth())));
		b[2].setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0, 0), (int) (0.01 * b[2].getWidth())));
		b[3].setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0, 0), (int) (0.01 * b[3].getWidth())));
		b[4].setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0, 0), (int) (0.01 * b[4].getWidth())));
		b[5].setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0, 0), (int) (0.01 * b[5].getWidth())));
		b[6].setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0, 0), (int) (0.01 * b[6].getWidth())));
		b[7].setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0, 0), (int) (0.01 * b[7].getWidth())));
		b[8].setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0, 0), (int) (0.01 * b[8].getWidth())));
		b[9].setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0, 0), (int) (0.01 * b[9].getWidth())));
		b[10].setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0, 0), (int) (0.01 * b[10].getWidth())));
		b[11].setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0, 0), (int) (0.01 * b[11].getWidth())));
		b[12].setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0, 0), (int) (0.01 * b[12].getWidth())));
		b[13].setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0, 0), (int) (0.01 * b[13].getWidth())));
		b[14].setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0, 0), (int) (0.01 * b[14].getWidth())));
		b[15].setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0, 0), (int) (0.01 * b[15].getWidth())));
		b[16].setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0, 0), (int) (0.01 * b[16].getWidth())));
		b[17].setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0, 0), (int) (0.01 * b[17].getWidth())));
		b[18].setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0, 0), (int) (0.01 * b[18].getWidth())));
		b[19].setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0, 0), (int) (0.01 * b[19].getWidth())));

		
		gui.add(z);
		gui.setVisible(true);

	}

}



