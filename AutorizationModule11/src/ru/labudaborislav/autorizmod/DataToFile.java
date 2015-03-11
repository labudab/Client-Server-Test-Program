package ru.labudaborislav.autorizmod;
import java.util.ArrayList;

import by.zti.SerializationManager;

public class DataToFile {
	private static ArrayList<RegData> regcollection = new ArrayList<RegData>();
	@SuppressWarnings("unchecked")
	public DataToFile() {
		RegistrationWindow FromReg = new RegistrationWindow(new GetLoginAndPass() {
            @Override
            public void login(String login) {
                System.out.println("Login in DataToFile: " + login);
            }

            @Override
            public void pass(String pass) {
                System.out.println("Pass in DataToFile: " + pass);
            }

            @Override
            public void group(String group) {
                System.out.println("Group in DataToFile: " + group);
            }
        });
		System.out.println(regcollection.size());		
		RegData regMetod = new RegData();
//		regMetod.setLoginreg(FromReg.logn.getText());
//		regMetod.setPassreg(FromReg.passn.getText());
//		System.out.println(regMetod.getLoginreg() + "Это логин");
//		regMetod.setLoginreg(JOptionPane.showInputDialog(null, "Login"));
//		regMetod.setPassreg(JOptionPane.showInputDialog(null, "Password"));
		regcollection.add(regMetod);
		for(RegData p : regcollection){
		System.out.println("Данные из DataToFile: " +p.getLoginreg()+ " " +p.getPassreg()+ " " +p.getGrpreg());
		}
		System.out.println(regcollection.size());
		SerializationManager.serializeData(regcollection,"users","dat","Data//");	
	}
	
}
