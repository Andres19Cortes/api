package com.IBM.test.ApiconsultaUsuarios.Usuarios;

public class InfoCompany {
	
	private String name;
	private String catchPhrase;
	private String bs;
	public InfoCompany(String name, String catchPhrase, String bs) {
		super();
		this.name = name;
		this.catchPhrase = catchPhrase;
		this.bs = bs;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCatchPhrase() {
		return catchPhrase;
	}
	public void setCatchPhrase(String catchPhrase) {
		this.catchPhrase = catchPhrase;
	}
	public String getBs() {
		return bs;
	}
	public void setBs(String bs) {
		this.bs = bs;
	}
	
	

}
