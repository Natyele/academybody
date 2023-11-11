package br.com.demo.academybody.model;

import java.time.LocalDate;

import br.com.demo.academybody.commons.TrainingRoutineType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name = "training")

public class TrainingEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private int point;
	private LocalDate date;
	private TrainingRoutineType trainingRoutineType;
	private boolean heart;
	private String description;
	private boolean conclusion;

	public int getPoint() {
		return point;
	}

	public void setPoint(int point) {
		this.point = point;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public TrainingRoutineType getTrainingRoutineType() {
		return trainingRoutineType;
	}

	public void setTrainingRoutineType(TrainingRoutineType trainingRoutineType) {
		this.trainingRoutineType = trainingRoutineType;
	}

	public boolean isHeart() {
		return heart;
	}

	public void setHeart(boolean heart) {
		this.heart = heart;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public boolean isConclusion() {
		return conclusion;
	}

	public void setConclusion(boolean conclusion) {
		this.conclusion = conclusion;
	}
	

}
