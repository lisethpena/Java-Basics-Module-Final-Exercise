package com.academy.university;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Run {
		public static void main(String[] args) {
			boolean exit = false;
			System.out.println("\n		****UNIVERSITY****	");
			
			/**
			 * Creación de objetos de la clase 
			 */
			
			ArrayList<Clase> claseList = new ArrayList<>();
			
			claseList.add(new Clase("Estadistica", "A20", new ProfesorFullTime("Liseth Peña",345600,4), new Estudiante("Pedro", 123, 25)));
			claseList.add(new Clase("Matematica Basica", "C3", new ProfesorFullTime("Vanessa Herrera",546780,6), new Estudiante("Maria", 456, 23)));
			claseList.add(new Clase("Geometría", "B11", new ProfesorPartTime("Pedro Casallas",4500000,45), new Estudiante("Antonio", 789, 18)));
			claseList.add(new Clase("Geometría", "B11", new ProfesorPartTime("Pedro Casallas",4500000,45), new Estudiante("Ana", 535, 23)));
			claseList.add(new Clase("Estadistica", "A20", new ProfesorFullTime("Liseth Peña",345600,4), new Estudiante("Cristiano", 444, 20)));
			claseList.add(new Clase("Encriptación", "VV3", new ProfesorPartTime("Milena Rojas", 7890000,11.5), new Estudiante("Cristina", 555, 22)));
			claseList.add(new Clase("Calculo", "A20", new ProfesorPartTime("Lila Rojas",7000000,56.5), new Estudiante("Camilo", 654, 29)));
			claseList.add(new Clase("Fisica", "D345", new ProfesorPartTime("Sindy Pajón", 9800000,49), new Estudiante("Lia", 677, 24)));
			
			/**
			 * Listado de profesores
			 */
			ArrayList<Profesor> profesorList = new ArrayList<>();
			profesorList.add(new ProfesorFullTime("Liseth Peña",25000,4));//Revisar cálculo de Full Time
			profesorList.add(new ProfesorFullTime("Vanessa Herrera",546780,6));//Revisar cálculo de Full Time
			profesorList.add(new ProfesorPartTime("Pedro Casallas",4500,45));
			profesorList.add(new ProfesorPartTime("Marcos Torre", 3200000,87));
			profesorList.add(new ProfesorPartTime("Luca Fetuccini", 5670000,32));
			profesorList.add(new ProfesorPartTime("Milena Rojas", 7890000,11.5));
			profesorList.add(new ProfesorPartTime("Lila Rojas",7000000,56.5));
			profesorList.add(new ProfesorPartTime("Sindy Pajón", 9800000,49));
			
			Clase currentClase = null;		
			
			//INICIO
			 while (!exit) {
					//Mostrar opciones del supermercado 
					System.out.println("\n\n		***Menu de la Universidad***");
					System.out.println("\n 1. Imprimir listado de profesores con sus datos* \n");
					System.out.println("\n 2. Opción 2::Imprimir listado de clases y un submenu de clases* \n");
					System.out.println("\n 3. Opción 3::Crear nuevo estudiante y agregarlo a una clase existente* \n");
					System.out.println("\n 4. Opción 4::Crear nueva clase y agregar profesor y datos relevantes* \n");
					System.out.println("\n 5. Opción 5::Listar todas las clases donde tengan sus estudiantes * \n");
					System.out.println("\n 6. Opción 6::Salir del Menú* \n");
					//Ingresar el menú de opción - Desde la consola
					Scanner optionNumber = new Scanner(System.in);
					//Ingresa la informacion
					Scanner teclado = new Scanner(System.in);
						
					try {
			            System.out.println("\nDigite una opción:");
			            int optNumber = optionNumber.nextInt();
			            Profesor currentProfesor = null;
			            switch (optNumber) {
			            
			                case 1:
			                	System.out.println("Ha digitado (Opción1) ** Listado de profesores de la universidad **");
			                	//Lista de profesores		                	
			                	
				    				for(int j=0; j<profesorList.size(); j++) {
				    					// currentProfesor es de tipo Profesor - Le asigno lo que vaya obteniendo cada vez que pasa por la posición j			    					
				    					currentProfesor = profesorList.get(j);				    					
				    					System.out.println("\n " + currentProfesor.getInfoProfesor());
				    				}
			                    break;
			                case 2:
			                	int vOpcionClase;
			                	
			                	System.out.println("\n Ha digitado (Opción2) - Listado de clases ");
			                	for (int i=0; i<claseList.size();i++) {
			    					currentClase = claseList.get(i);
			    					System.out.println("\n" + (i+1) + ". " + currentClase.getNameClass());
			    				}
			                			
			                	System.out.println("\n Escoja una clase");
			                	vOpcionClase = teclado.nextInt();
			                	
			                	System.out.println("\n Usted escogió la clase: " + claseList.get(vOpcionClase-1).getNameClass());
			                	System.out.println(claseList.get(vOpcionClase-1).getInfoClase());
			                	
			                    break;
			                case 3:
			                	
			                	System.out.println("\n Ha digitado (Opción3) - Crear nuevo estudiante y agregarlo a una clase existente ");
			                	String vStudentNameIn;
			                	int vStudentId, vStudentAge;
			                	/**
			                	 * Creacion de la lista para crear un estudiante y asociarlo a una clase
			                	 */
			                	ArrayList<Clase> newClaseListByEstudiante = new ArrayList<>();
			        			Clase newClaseByEstudiante = null;
			        			
			        			/**
			                	 * Pedir por pantalla al usuario los datos para agregar una nuevo estudiante asociado a una clase existente
			                	 */
			        			System.out.println("Digite el nombre del nuevo estudiante: ");
			        			vStudentNameIn = teclado.next();
			                	
			        			//Id del Estudiante escrita por consola
			                	System.out.println("Digite el Id del nuevo estudiante: ");
			                	vStudentId = teclado.nextInt();
			                	
			                	//Edad del Estudiante escrita por consola
			                	System.out.println("Digite la edad del nuevo estudiante: ");
			                	vStudentAge = teclado.nextInt();
			                	
			                	/**
			                	 * Asignacion a newClaseList para adicionar la nueva clase ingresada por el usuario por consola
			                	 */
			                	newClaseListByEstudiante.add(new Clase("Astronomia","Salon3" ,(new ProfesorFullTime("LisethP",5500000,4)), (new Estudiante(vStudentNameIn, vStudentId, vStudentAge))));
			                	/**
			                	 * Asignación a la nueva clase de los valores obtenidos en pantalla en la posición 0 inicial del vector newClaseList
			                	 */
			                	newClaseByEstudiante = newClaseListByEstudiante.get(0);
			                	System.out.println("*--------Nuevo Estudiante creado-------*");
			                	System.out.println(newClaseByEstudiante.getEstudiante().getInfoStudent());
			                	System.out.println("\n*--------Estudiantes creados previamente-------*");
			                	/**
			                	 * Ciclo for para recorrer la lista-Clase y obtener los valores de cada estudiante
			                	 */
			                	for (int i=0; i<claseList.size();i++) {
									currentClase = claseList.get(i);
									System.out.println(currentClase.getEstudiante().getInfoStudent());
			                	}
			                	
			                	break;
   
			                case 4:
			                	/**
			                	 * Variables para crear el objeto Clase, Profesor, Estudiante
			                	 */
			                	String vClaseNombre, vClassRoom, vProfesor,	vEstudianteNombre;
			                	
			                	ArrayList<Clase> newClaseList = new ArrayList<>();
			        			Clase newClase = null;
			        			
			                	System.out.println("\n **** Ha digitado (Opción4) - Crear nueva clase y agregar profesor y datos relevantes ****");
			                	
			                	/**
			                	 * Pedir por pantalla al usuario los datos para agregar una nueva clase con profesor, estudiantes y demás datos
			                	 */
			                	System.out.println("Digite el nombre de la nueva clase: ");
			                	vClaseNombre = teclado.next();
			                	//Nombre de la clase escrita por consola
			                	System.out.println("Digite el salón de clase: ");
			                	vClassRoom = teclado.next();
			                	//Nombre del profesor escrita por consola
			                	System.out.println("Digite el nombre del profesor: ");
			                	vProfesor = teclado.next();
			                	//Nombre del estudiante escrito por consola
			                	System.out.println("Digite el nombre del estudiante:");
			                	vEstudianteNombre = teclado.next();

			                	/**
			                	 * Asignacion a newClaseList para adicionar la nueva clase ingresada por el usuario por consola
			                	 */
			                	newClaseList.add(new Clase(vClaseNombre,vClassRoom ,(new ProfesorFullTime(vProfesor,5500000,4)), (new Estudiante(vEstudianteNombre, 555, 222))));
			                	/**
			                	 * Asignación a la nueva clase de los valores obtenidos en pantalla en la posición 0 inicial del vector newClaseList
			                	 */
			                	newClase = newClaseList.get(0);
			                	System.out.println("*--------Nueva Clase agregada-------*");
			                	System.out.println(newClase.getInfoClase());
			                	System.out.println("\n*--------Clases creadas previamente-------*");

			                	for (int i=0; i<claseList.size();i++) {
									currentClase = claseList.get(i);
									System.out.println(currentClase.getInfoClase());
								}
			                	
			                	break;
			                case 5:
			                	
			                	System.out.println("\n Ha digitado (Opción5) - Listar todas las clases donde tengan sus estudiantes");
			                	for (int i=0; i<claseList.size();i++) {
								currentClase = claseList.get(i);
								System.out.println("\nNombre de la Clase: "+ currentClase.getNameClass() + " - Nombre del curso: " + currentClase.getCourseName() + " - Estudiante " +currentClase.getEstudiante().getStudentName() + " - Id del Estudiante: " + currentClase.getEstudiante().getIdStudent() + " - Edad Estudiante: " + currentClase.getEstudiante().getAgeStudent());
							
								
			                	}
			                   break; 
			                case 6:
			                	
			                	System.out.println("\n Saliendo de la aplicación");
			                	exit = true;
			                    break;
			                default:
			                    System.out.println("Solamente válido opción --- ");
			                    break;
			            }
			        } catch (InputMismatchException e) {
			            System.out.println("Ingrese una opción válida por favor." );
			            optionNumber.nextInt();
			        	
			        }
					 
										
					
				}

		}
}


