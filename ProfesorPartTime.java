package com.academy.university;

public class ProfesorPartTime implements Profesor{
	/**
	 * Atributos clase Profesor Part Time
	 */
	public String profesorPartTime;
	public double salarioProfesorPartTime;
	public double hoursPerWeek;
	/**
	 * Constructor con parámetros
	 * @param profesorPartT Parámetro Nombre de Profesor Part Time
	 * @param salarioProfesorPartT Parámetro Salario profesor Part Time
	 */
	public ProfesorPartTime(String profesorPartT, double salarioProfesorPartT, double pHoursPerWeek) {
		super();
		this.profesorPartTime = profesorPartT;
		this.salarioProfesorPartTime = salarioProfesorPartT;
		this.hoursPerWeek = pHoursPerWeek;
	}
	/**
	 * Método para obtener el nombre del profesor Part Time
	 */
	public String getProfesorName() {
		return "Nombre profesor Part Time: " + this.profesorPartTime;
	}
	/**
	 * Método para obtener el salario del profesor Part Time
	 */
	public double getProfesorSalary() {
		return this.salarioProfesorPartTime * this.hoursPerWeek;
	}
	/**
	 * Método para obtener el nombre del profesor y tiempo de Experiencia
	 */
	public String getInfoProfesor() {
		return "Información Profesor Part Time: " + this.profesorPartTime + " - Tiempo de Experiencia: " + this.hoursPerWeek + " horas";
	}

}
