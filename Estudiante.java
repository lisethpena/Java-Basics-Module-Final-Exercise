package com.academy.university;

public class Estudiante {
	
	/**
	 * Variables de la clase Estudiante
	 */
	private String studentName;
	private int studentId;
	private int studentAge;
	
	public Estudiante(String studentName, int studentId, int studentAge) {
		super();
		this.studentName = studentName;
		this.studentId = studentId;
		this.studentAge = studentAge;
	}
	
	/**
	 * Declaraci�n de constructor vac�o
	 */
	public Estudiante() {
		
	}

	/**
	 * M�todo para obtener el nombre del estudiante
	 */
	public String getStudentName() {
		return studentName;
	}
	/**
	 * M�todo para obtener el id del estudiante
	 */
	public int getIdStudent() {
		return studentId;
	}
	/**
	 * M�todo para obtener la edad del estudiante
	 */
	public int getAgeStudent() {
		return studentAge;
	}
	/**
	 * M�todo para obtener informaci�n completa del estudiante
	 */
	public String getInfoStudent() {
		return " Informaci�n del Estudiante:" + this.studentName + " - Id del Estudiante: " + this.studentId + " - Edad del Estudiante: " + this.studentAge + " a�os";
	}
	
}
