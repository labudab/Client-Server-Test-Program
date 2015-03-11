package ru.labudaborislav.autorizmod;

import java.io.Serializable;

public class RegData implements Serializable  {
	
	private  String loginreg;
	private  String passreg;
	private  String grpreg;
		
	
	public String getLoginreg() {
		return loginreg;
	}

	public void setLoginreg(String loginreg) {
		this.loginreg = loginreg;
	}

	public String getPassreg() {
		return passreg;
	}

	public void setPassreg(String passreg) {
		this.passreg = passreg;
	}

	public String getGrpreg() {
		return grpreg;
	}

	public void setGrpreg(String grpreg) {
		this.grpreg = grpreg;
	}

	public RegData(){
//		System.out.println("Логин из regData "+getLoginreg());
//		System.out.println("Пароль из regData "+getPassreg());
//		System.out.println("Группа из regData " +getGrpreg());
	}

    private void processing() {
        new GetLoginAndPass() {
            @Override
            public void login(String login) {
                System.out.println("Login in RegData: " + login);
            }

            @Override
            public void pass(String pass) {
                System.out.println("Pass in RegData: " + pass);
            }

            @Override
            public void group(String group) {
                System.out.println("Group in RegData: " + group);
            }
        };
    }
	
}