package br.com.demo.academybody.entity;

import br.com.demo.academybody.commons.AdvantageType;

public class ClientEntity {
	
	private int discount;
	private boolean fidelityProgram;
	private AdvantageType advantage;
	private String clientName;
	private int age;
	private String sex;
	private String weight;
	private String email;
	private int telephone;
	public int getDiscount() {
		return discount;
	}
	public void setDiscount(int discount) {
		this.discount = discount;
	}
	public boolean isFidelityProgram() {
		return fidelityProgram;
	}
	public void setFidelityProgram(boolean fidelityProgram) {
		this.fidelityProgram = fidelityProgram;
	}
	public AdvantageType getAdvantage() {
		return advantage;
	}
	public void setAdvantage(AdvantageType advantage) {
		this.advantage = advantage;
	}
	public String getClientName() {
		return clientName;
	}
	public void setClientName(String clientName) {
		this.clientName = clientName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getWeight() {
		return weight;
	}
	public void setWeight(String weight) {
		this.weight = weight;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getTelephone() {
		return telephone;
	}
	public void setTelephone(int telephone) {
		this.telephone = telephone;
	}
	
	

}
