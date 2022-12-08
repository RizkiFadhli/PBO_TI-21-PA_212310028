package com.ibik.pbo.praktikum;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class latihangui extends JFrame{
	latihangui()
	{	
		//JFrame frame = new JFrame();
				
		setVisible(true);	
		pack();
		setLocationRelativeTo(null);
		setSize(300,150);
		setTitle("Contoh flow layout");
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		create();
	}
	
	 public static void main(String[] args ){
       new latihangui();
	 }
	 
	 private void create() {
		 JButton button1 = new JButton("EAST");
		 JButton button2 = new JButton("tombol2");
		 button2.setText("Tekan");
		 button2.setIcon(new ImageIcon("C:\\\\Users\\lenovo\\Downloads\\main.png"));
		 
		 button2.addActionListener(new ActionListener(){
			 @Override
			 
			 public void actionPerformed(ActionEvent e) {
				 JOptionPane.showMessageDialog(null, "Anda baru saja klik button");
			 }
		 });
		 
		 
		 JButton button3 = new JButton("SOUTH");
		 JButton button4 = new JButton("NORTH");
		 JButton button5= new JButton("WEST");
		 //grid layout
		 BorderLayout b1= new BorderLayout();
		 add(button1, b1.EAST); add(button2, b1.CENTER); add(button3, b1.SOUTH);
		 add(button4, b1.NORTH); add(button5, b1.WEST);
	
		 
	 }
	 
}