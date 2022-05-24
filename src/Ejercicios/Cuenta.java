/**
 * 
 */
package Ejercicios;

/**
 * @author alicia
 * 
 * Crear una clase llamada Cuenta que tendr� los atributos: titular (que es una persona) y  cantidad (puede tener decimales). 
 * El titular ser� obligatorio y la cantidad es opcional.  Construye los siguientes m�todos para la clase: 
 * - Un constructor;  
 * - mostrar(): Muestra los datos de la cuenta;  
 * - ingresar(cantidad): se ingresa una cantidad a la cuenta, si la cantidad introducida es  negativa, no se har� nada;  
 * - retirar(cantidad): se retira una cantidad a la cuenta. La cuenta puede estar en n�meros  rojos. 
 *
 */
public class Cuenta {
	Persona titular;
	double cantidad;

	public Cuenta(Persona titular, double cantidad) {
		this.titular = titular;
		this.cantidad = cantidad;
	}

	public void mostrar() {
		System.out.println("Titular nombre:"+ this.titular.getApellido() +" "+ this.titular.getNombre());
		System.out.println("Titular DNI:"+ this.titular.getDni());
		System.out.println("Titular cantidad de dinero en la cuenta:"+ this.cantidad);
	}
	
	public void ingresar(double cantidad) {
		if (cantidad<0) {
			System.out.println("No se puede ingresar montos negativos");
		} else {
			this.cantidad = cantidad;
			System.out.println("Se ingres� la cantidad de " + cantidad + " exitosamente");
			System.out.println("La cuenta actualizada qued� como: ");
			this.mostrar();	
		}
	}
	
	public void retirar(double cantidad) {
		if (cantidad<0) {
			System.out.println("No se puede retirar montos negativos");
		} else {
			this.cantidad = cantidad;
			System.out.println("Se retir� la cantidad de " + cantidad + " exitosamente");
			System.out.println("La cuenta actualizada qued� como: ");
			this.mostrar();	
		}
	}
}
