package com.ibik.pbo.praktikum;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class Latihan01 extends JFrame {
	Latihan01() {
		setVisible(true);
		pack();
		setSize(300,300);
		setLocationRelativeTo(null);
		setTitle("Latihan 01");
		GenerateMenuButton(this);
	}
	public static void main(String[] args) 
	{
		new Latihan01();
	}
	private void GenerateMenuButton(JFrame frame) {
		JPanel upperPanel = new JPanel();
		JButton btn_hello = new JButton("Selamat datang");
		JButton btn_halo = new JButton("いらっしゃいませ");
		
		btn_hello.setSize(100, 50);
		btn_halo.setSize(100, 50);
		
		upperPanel.add(btn_halo);
		upperPanel.add(btn_hello);
		
		JPanel bottomPanel = new JPanel();
		JButton btn_ibik = new JButton("IBIK");
		
		btn_ibik.setSize(100,50);
		bottomPanel.add(btn_ibik);
		
		btn_hello.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "it means 'welcome' in english");
			}
		});
		
		
		btn_halo.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Artinya Halo dalam Bahasa Jepang");
			}
		});
		
		btn_ibik.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "IBIK is an acronym for 'Institute Bisnis dan Informatika Kesatuan'");				
			}
		});
			frame.add(upperPanel, BorderLayout.NORTH);
			frame.add(bottomPanel, BorderLayout.SOUTH);
	}
}
