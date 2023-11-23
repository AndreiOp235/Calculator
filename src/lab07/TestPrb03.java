package lab07;

import javax.swing.*;
import java.awt.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class TestPrb03 {
	static String caleEXEC="";
	public static void main(String[] args) {
		String argumente[]= {"7","8","9","del","4","5","6","÷","1","2","3","*","+","0","-","CLR","(",".",")","="};
		// TODO Auto-generated method stub
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
		
		gui.add(z);
		gui.setVisible(true);

	}

}

