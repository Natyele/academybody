package br.com.demo.academybody.commons;

public enum TrainingRoutineType {
	PRACTICE_A(0, "Treino A"),
	PRACTICE_B(1, "Treino B"), 
	PRACTICE_C(2, "Treino C");
	
	private int codigo;
	private String description;

	private TrainingRoutineType(int codigo, String description) {
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

