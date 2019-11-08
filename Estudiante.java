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
	 * Declaración de constructor vacío
	 */
	public Estudiante() {
		
	}

	/**
	 * Método para obtener el nombre del estudiante
	 */
	public String getStudentName() {
		return studentName;
	}
	/**
	 * Método para obtener el id del estudiante
	 */
	public int getIdStudent() {
		return studentId;
	}
	/**
	 * Método para obtener la edad del estudiante
	 */
	public int getAgeStudent() {
		return studentAge;
	}
	/**
	 * Método para obtener información completa del estudiante
	 */
	public String getInfoStudent() {
		return " Información del Estudiante:" + this.studentName + " - Id del Estudiante: " + this.studentId + " - Edad del Estudiante: " + this.studentAge + " años";
	}
	
}
