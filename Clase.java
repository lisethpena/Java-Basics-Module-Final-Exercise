package com.academy.university;

public class Clase {
	/**
	 * Atributos de la Clase
	 */
	private String nameClass;
	private String courseName;
	private Profesor profesor;
	private Estudiante estudiante;
	
	public Clase(String pNameClass, String pCourseName, Profesor pProfesor, Estudiante pEstudiante) {
		super();
		this.nameClass = pNameClass;
		this.courseName = pCourseName;
		this.profesor = pProfesor;
		this.estudiante = pEstudiante;
	}
	/**
	 * Declaración de constructor vacío
	 */
	public Clase() {
		
	}	
	/**
	 * Método para obtener el nombre de la clase
	 */
	public String getNameClass() {
		return this.nameClass;
	}
	/**
	 * Método para obtener el nombre del curso
	 */
	public String getCourseName() {
		return this.courseName;
	}
	/**
	 * Método para obtener el nombre del profesor
	 */
	public Profesor getProfesor() {
		return this.profesor;
	}
	/**
	 * Método para obtener la información de la clase Estudiante
	 */
	public Estudiante getEstudiante() {
		return this.estudiante;
	}
	/**
	 * 
	 * @return Retorna @Nombre de la Clase, @Nombre del curso, @Nombre del Profesor+Tiempo de Experiencia, @Estudiante con el nombre, id, edad
	 */
	public String getInfoClase() {
		return "Datos de la clase: " + this.nameClass + " - Nombre del curso: " + this.courseName + this.profesor.getInfoProfesor() + this.estudiante.getInfoStudent();
		
	}
	
}
