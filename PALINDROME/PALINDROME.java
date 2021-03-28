package project;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class PALINDROME extends JFrame implements ActionListener
{
	PALINDROME() 
	{
	   getContentPane().setBackground(Color.DARK_GRAY);
//-------------------------------------------------------------------------------------	   
	   JLabel l = new JLabel();
	   l.setIcon(new ImageIcon("PROGRAM_IMG\\PALINDROME_PALINDROME.PNG"));
	   l.setBounds(0, -15, 800, 800); 
	   getContentPane().add(l);
	
	   setSize(780,800);   // WIDTH, HEIGHT
	   getContentPane().setLayout(null);
	   setVisible(true);
	}	
//---------------------------------------------------------------------------------	
    public void actionPerformed(ActionEvent arg0) {}

    public static void main(String[] args) 
	{
	   new PALINDROME();
	}
	
}