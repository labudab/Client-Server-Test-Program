package ru.labudaborislav.teststudents;

import javax.swing.JFrame;

public class RegWindow extends JFrame{
	public RegWindow(){
		super("Регистрация нового пользователя");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(800, 800);
		setResizable(false);
		setLocationRelativeTo(null);
		
	}
}
