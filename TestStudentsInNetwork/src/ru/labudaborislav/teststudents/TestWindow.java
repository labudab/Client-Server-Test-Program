package ru.labudaborislav.teststudents;

import javax.swing.JFrame;

public class TestWindow extends JFrame {
	public TestWindow(){
		super("Тестирование");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(1024, 768);
		setResizable(false);
		setLocationRelativeTo(null);
	}

}
