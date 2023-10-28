package br.com.demo.academybody.entity;

import java.time.LocalDate;

import br.com.demo.academybody.commons.TrainingRoutineType;

public class TrainingEntity {

	private int point; 
	private LocalDate date;
	private TrainingRoutineType trainingRoutineType;
	private boolean heart;
	private String description;
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
	
	
	
}
