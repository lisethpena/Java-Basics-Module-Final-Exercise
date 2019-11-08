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
	 * Contructor con par�metros
	 * @param pProfesorName Par�metro Nombre Profesor Full Time 
	 * @param pProfSalary Par�metro Salario Profesor Full Time
	 */
	public ProfesorFullTime(String pProfesorName, double pProfSalary, int pExperienceYear) {
		super();
		this.profesorName = pProfesorName;
		this.salarioBase = pProfSalary;
		this.tiempoExperiencia = pExperienceYear;
	}
	/**
	 * M�todo que obtiene el nombre de profesor Full Time
	 */
	public String getProfesorName() {
		return this.profesorName;
	}
	/**
	 * M�todo que obtiene la experiencia en a�os del profesor Full Time
	 */
	public int getProfesorExperience() {
		return this.tiempoExperiencia;
	}
	/**
	 * M�todo que obtiene el salario de profesor Full Time
	 */
	public double getProfesorSalary() {
		return this.salarioBase * (profSalaryFull * this.tiempoExperiencia);//Revisar c�lculo de Full Time
	}
	
	public String getInfoProfesor() {
		return " Informaci�n Profesor Full Time:" + this.profesorName + " - Tiempo de Experiencia: " + this.tiempoExperiencia + " horas";
	}
}
