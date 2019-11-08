package com.academy.university;

public class ProfesorPartTime implements Profesor{
	/**
	 * Atributos clase Profesor Part Time
	 */
	public String profesorPartTime;
	public double salarioProfesorPartTime;
	public double hoursPerWeek;
	/**
	 * Constructor con par�metros
	 * @param profesorPartT Par�metro Nombre de Profesor Part Time
	 * @param salarioProfesorPartT Par�metro Salario profesor Part Time
	 */
	public ProfesorPartTime(String profesorPartT, double salarioProfesorPartT, double pHoursPerWeek) {
		super();
		this.profesorPartTime = profesorPartT;
		this.salarioProfesorPartTime = salarioProfesorPartT;
		this.hoursPerWeek = pHoursPerWeek;
	}
	/**
	 * M�todo para obtener el nombre del profesor Part Time
	 */
	public String getProfesorName() {
		return "Nombre profesor Part Time: " + this.profesorPartTime;
	}
	/**
	 * M�todo para obtener el salario del profesor Part Time
	 */
	public double getProfesorSalary() {
		return this.salarioProfesorPartTime * this.hoursPerWeek;
	}
	/**
	 * M�todo para obtener el nombre del profesor y tiempo de Experiencia
	 */
	public String getInfoProfesor() {
		return "Informaci�n Profesor Part Time: " + this.profesorPartTime + " - Tiempo de Experiencia: " + this.hoursPerWeek + " horas";
	}

}
