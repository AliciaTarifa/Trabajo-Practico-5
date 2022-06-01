/**
 * 
 */
package Ejercicios;

/**
 * @author alicia
 * 
 * Crear una clase Productos con atributos: Nombre, precios, vencimiento, con 2 tipos de  productos 
 * perecederos y no perecederos. 
 * Crear sus constructores getters y setters. 
 * crear  una función llamada calcular: en producto simplemente seria calcular precio por cantidad,  
 * en perecederos el precio se reducirá según los días a caducar, si le queda 1 día se reducirá  4 veces el precio, 
 * si le quedan 2 días se reducirá el precio 3 veces, si le quedan 3 días se  reducirá la mitad el precio. Crear una 
 * clase ejecutable y crear un array de productos y  muestra el precio total de vender 5 productos de cada uno.  
 *
 */
public class Productos {
	String nombre;
	double precio;
	int vencimiento;
	boolean perecedero;
	
	public Productos(String nombre, double precio, int vencimineto, boolean perecedero){
		this.nombre = nombre;
		this.precio = precio;
		this.vencimiento = vencimineto;
		this.perecedero = perecedero;
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

	public int getVencimiento() {
		return vencimiento;
	}

	public void setVencimiento(int vencimiento) {
		this.vencimiento = vencimiento;
	}

	public boolean isPerecedero() {
		return perecedero;
	}

	public void setPerecedero(boolean perecedero) {
		this.perecedero = perecedero;
	}
	
	double calcular(int cantidad) {
		double total = 0;
		if (this.perecedero) {
			if (this.vencimiento <= 1) {
				total = (this.precio/4)*cantidad;
			}
			else {
				if((1>this.vencimiento)|| (this.vencimiento<=2)) {
					total=(this.precio/3)*cantidad;
				}
				else {
					if(this.vencimiento==3) {
						total=(this.precio/2)*cantidad;
					}
				}
			}
			total=this.precio*cantidad;
		}
		return total;
	}	

}
