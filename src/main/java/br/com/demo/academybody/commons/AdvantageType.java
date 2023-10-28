package br.com.demo.academybody.commons;

public enum AdvantageType {
	PERSONAL_TRAINERS(0, "Personal Trainers"),
	SUPPLEMENTS(1, "Suplementos"), 
	EXTRA_SERVICES(2, "Serviços Extras");

	private int codigo;
	private String description;

	private AdvantageType(int codigo, String description) {
		this.codigo = codigo;
		this.description = description;
	}

	public int getCodigo() {
		return codigo;
	}

	public String getDescription() {
		return description;
	}

}

