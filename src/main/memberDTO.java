package main;

import java.util.ArrayList;

public class memberDTO {
	private ArrayList<String> id = new ArrayList<String>();
	public ArrayList<String> pwd = new ArrayList<String>();
	public ArrayList<String> getId() {
		return id;
	}
	public void setId(String id) {
		this.id.add(id);
	}
	public ArrayList<String> getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd.add(pwd);
	}
}


