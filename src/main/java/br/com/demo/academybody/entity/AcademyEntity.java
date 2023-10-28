package br.com.demo.academybody.entity;

import br.com.demo.academybody.commons.AdvantageType;

	public class AcademyEntity {
		
	private String nomeAcademia;
	private int cnpj;
	private int telefone;
	private String endereco;
	private int id;
	private AdvantageType advantage;
	public String getNomeAcademia() {
		return nomeAcademia;
	}
	public void setNomeAcademia(String nomeAcademia) {
		this.nomeAcademia = nomeAcademia;
	}
	public int getCnpj() {
		return cnpj;
	}
	public void setCnpj(int cnpj) {
		this.cnpj = cnpj;
	}
	public int getTelefone() {
		return telefone;
	}
	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public AdvantageType getAdvantage() {
		return advantage;
	}
	public void setAdvantage(AdvantageType advantage) {
		this.advantage = advantage;
	}
	
	
	}
	

