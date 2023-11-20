package lab07;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.*;
import java.awt.*;

public class TestPrb03 {

	public static void main(String[] args) {
		String argumente[]= {"7","8","9","del","4","5","6","÷","1","2","3","*","0","+","-","="};
		// TODO Auto-generated method stub
		System.out.println("Neata !");
		JFrame gui= new JFrame("Calculator");
		gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		gui.setSize(395,520);
		
		gui.getContentPane().setBackground(Color.cyan);
		gui.setLayout(null);
		
		Butoane b[]=new Butoane[16];
		
		for(int i=1;i<=16;i++)
		{
			b[i-1]=new Butoane(argumente[i-1],10+((i-1)%4)*90,115+((i-1)/4)*90);
			gui.add(b[i-1]);
		}
		ZonaText z=new ZonaText();
		gui.add(z);
		
		
		gui.setVisible(true);
		
        
	}

}

