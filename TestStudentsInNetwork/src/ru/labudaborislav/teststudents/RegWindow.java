package ru.labudaborislav.teststudents;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import by.zti.SerializationManager;

public class RegWindow extends JFrame{
	JTextField logn, passn, group;
	JLabel inlogn, inpassn, statreg, groupn, regstat;
	JButton back, regnown;
	reactclas reacttoreg = new reactclas();
	
	public RegWindow(){
		super("Регистрация нового пользователя");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(400, 400);
		setResizable(false);
		setLocationRelativeTo(null);
		JPanel mainPanel = new JPanel();
		mainPanel.setLayout(null);
		regstat = new JLabel("Регистрация нового пользователя");
		regstat.setSize(250,25);
		regstat.setLocation(100,50);
		logn = new JTextField(16);
		logn.setSize(160,25);
		logn.setLocation(200,120);
		inlogn = new JLabel("Введите логин:");
		inlogn.setSize(160,25);
		inlogn.setLocation(80,120);
		passn = new JTextField(16);
		passn.setSize(160,25);
		passn.setLocation(200,160);
		inpassn = new JLabel("Введите пароль:");
		inpassn.setSize(160,25);
		inpassn.setLocation(80,160);
		group = new JTextField(2);
		group.setSize(160,25);
		group.setLocation(200,200);
		groupn = new JLabel("Группа:");
		groupn.setSize(160,25);
		groupn.setLocation(80,200);
		back = new JButton("Назад");
		back.setSize(80,20);
		back.setLocation(50,250);
		regnown = new JButton("Зарегистрировать");
		regnown.setSize(220,20);
		regnown.setLocation(140,250);
		mainPanel.add(inlogn);
		mainPanel.add(logn);
		mainPanel.add(inpassn);
		mainPanel.add(passn);
		mainPanel.add(back);
		mainPanel.add(regnown);
		mainPanel.add(group);
		mainPanel.add(groupn);
		mainPanel.add(regstat);
		back.addActionListener(reacttoreg);
		regnown.addActionListener(reacttoreg);
		setContentPane(mainPanel);
		
	}
	public class reactclas implements ActionListener{
				public ArrayList<UsersClass> userlist = new ArrayList<UsersClass>();
				public void actionPerformed(ActionEvent e){
			if(e.getSource()==back){
				JFrame HelloW = new HelloWindow();
				setVisible(false);
				HelloW.setVisible(true);
		
			}
			if(e.getSource()==regnown){
				UsersClass callUS = new UsersClass();
				
				callUS.setLoginreg(logn.getText());
				callUS.setPassreg(passn.getText());
				callUS.setGrpreg(group.getText());
				System.out.println(callUS.getLoginreg());
				System.out.println(callUS.getPassreg());
				System.out.println(callUS.getGrpreg());
				//users.add(regdata);
				//System.out.println(regdata.size());
				SerializationManager.serializeData(callUS,"users","dat","Data//");
				
			}
	
}
	}
	
	
}
