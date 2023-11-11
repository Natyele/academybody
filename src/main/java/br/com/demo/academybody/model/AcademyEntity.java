package br.com.demo.academybody.model;

import java.util.List;

import br.com.demo.academybody.commons.AdvantageType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name = "academy")

public class AcademyEntity {

	// Atributos
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String nomeAcademia;
	private long cnpj;
	private int telefone;
	private String endereco;
	private List<AdvantageType> advantageList;
	public String getNomeAcademia() {
		return nomeAcademia;
	}
	public void setNomeAcademia(String nomeAcademia) {
		this.nomeAcademia = nomeAcademia;
	}
	public long getCnpj() {
		return cnpj;
	}
	public void setCnpj(long cnpj) {
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
	public List<AdvantageType> getAdvantageList() {
		return advantageList;
	}
	public void setAdvantageList(List<AdvantageType> advantageList) {
		this.advantageList = advantageList;
	}
	
	
	}
	

