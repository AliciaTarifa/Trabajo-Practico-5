/**
 * 
 */
package Ejercicios;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;


/**
 * @author alicia
 * 
 * Crear una clase Productos con atributos: Nombre, precios, vencimiento, con 2 tipos de  productos 
 * perecederos y no perecederos. 
 * Crear sus constructores getters y setters. 
 * crear  una funci�n llamada calcular: en producto simplemente seria calcular precio por cantidad,  
 * en perecederos el precio se reducir� seg�n los d�as a caducar, si le queda 1 d�a se reducir�  4 veces el precio, 
 * si le quedan 2 d�as se reducir� el precio 3 veces, si le quedan 3 d�as se  reducir� la mitad el precio. Crear una 
 * clase ejecutable y crear un array de productos y  muestra el precio total de vender 5 productos de cada uno.  
 *
 */
public class Productos {
	private String nombre;
	private double precio;
	private LocalDate vencimiento;
	private boolean perecedero;
	
	public void Producto() {}
	
	public Productos(String nombre, double precio, LocalDate vencimineto, boolean esPerecedero){
		this.nombre = nombre;
		this.precio = precio;
		this.vencimiento = vencimineto;
		this.perecedero = esPerecedero;
	}
	public double calcularPrecio() {
		LocalDate fechaActual = LocalDate.now(); 
		int diasAVencer = (int) fechaActual.until(this.vencimiento, ChronoUnit.DAYS);
		
		if(this.perecedero) {
			if(diasAVencer == 1) {
				return this.precio / 4;
			}else if(diasAVencer == 2) {
				return this.precio / 3;
			}else if(diasAVencer == 3) {
				return this.precio / 2;
			}else if(diasAVencer > 3){
				return this.precio;
			}else {
				return 0;
			}
		}else {
			return this.precio;
		}
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public LocalDate getVencimiento() {
		return vencimiento;
	}

	public void setVencimiento(LocalDate vencimiento) {
		this.vencimiento = vencimiento;
	}

	public boolean isPerecedero() {
		return perecedero;
	}

	public void setPerecedero(boolean perecedero) {
		this.perecedero = perecedero;
	}

	
}
