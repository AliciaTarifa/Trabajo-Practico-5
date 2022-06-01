/**
 * 
 */
package Ejercicios;

/**
 * @author alicia
 * 
 * Usando la clase persona del ejercicio 1 crear una clase empleado que deber� tener el  atributo sueldo b�sico. Implementar los m�todos:  
 * - calculoSueldo(): este se calcula como la cantidad de horas trabajadas por el sueldo b�sico 
 * - verEmpleado(): visualiza los datos del empleado.
 *
 */
public class Empleado {
	double sueldo;
	Persona trabajador;
	
	public Empleado (double sueldo, Persona trabajador) {
		this.sueldo = sueldo;
		this.trabajador = trabajador;
	}
	
	public void calculoSueldo(int horas) {
		double sueldo = this.sueldo * horas;
		System.out.println("El sueldo es: " + sueldo);
	}
	public void verEmpleado () {
		System.out.println("Nombre del empleado: "+ this.trabajador.apellido + " "+ this.trabajador.nombre);
		System.out.println("DNI del empleado: " + this.trabajador.dni);	
	}

}
