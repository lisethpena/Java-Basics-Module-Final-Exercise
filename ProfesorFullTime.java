package com.academy.university;

public class ProfesorFullTime implements Profesor{
	/**
	 * Atributos clase @ProfesorFullTime
	 */
	public static final double profSalaryFull = 1.1;
	public String profesorName;
	public double salarioBase;
	public int tiempoExperiencia;
	
	/**
	 * Contructor con parámetros
	 * @param pProfesorName Parámetro Nombre Profesor Full Time 
	 * @param pProfSalary Parámetro Salario Profesor Full Time
	 */
	public ProfesorFullTime(String pProfesorName, double pProfSalary, int pExperienceYear) {
		super();
		this.profesorName = pProfesorName;
		this.salarioBase = pProfSalary;
		this.tiempoExperiencia = pExperienceYear;
	}
	/**
	 * Método que obtiene el nombre de profesor Full Time
	 */
	public String getProfesorName() {
		return this.profesorName;
	}
	/**
	 * Método que obtiene la experiencia en años del profesor Full Time
	 */
	public int getProfesorExperience() {
		return this.tiempoExperiencia;
	}
	/**
	 * Método que obtiene el salario de profesor Full Time
	 */
	public double getProfesorSalary() {
		return this.salarioBase * (profSalaryFull * this.tiempoExperiencia);//Revisar cálculo de Full Time
	}
	
	public String getInfoProfesor() {
		return " Información Profesor Full Time:" + this.profesorName + " - Tiempo de Experiencia: " + this.tiempoExperiencia + " horas";
	}
}
