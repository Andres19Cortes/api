package com.IBM.test.ApiconsultaUsuarios.Usuarios;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "usuario")
public class Usuarios {
	
	@Id 
	private String _id;
	private String Name;
	private String username;
	private String email;
	private InfoAddress address;
	private String phone;
	private String website;
	private InfoCompany company;
	public Usuarios(String _id, String name, String username, String email, InfoAddress address, String phone,
			String website, InfoCompany company) {
		super();
		this._id = _id;
		Name = name;
		this.username = username;
		this.email = email;
		this.address = address;
		this.phone = phone;
		this.website = website;
		this.company = company;
	}
	public String get_id() {
		return _id;
	}
	public void set_id(String _id) {
		this._id = _id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public InfoAddress getAddress() {
		return address;
	}
	public void setAddress(InfoAddress address) {
		this.address = address;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getWebsite() {
		return website;
	}
	public void setWebsite(String website) {
		this.website = website;
	}
	public InfoCompany getCompany() {
		return company;
	}
	public void setCompany(InfoCompany company) {
		this.company = company;
	}
	
	
}
