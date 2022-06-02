/**
 * 
 */
package Ejercicios;

import java.time.LocalDate;
import java.util.List;

/**
 * @author alicia
 *
 */
public class Productos_perecederos {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Productos productoA = new Productos("Leche La Serenisima", 120.20, LocalDate.of(2022, 06, 04), true);
		Productos productoB = new Productos("Yogurt con colchon de frutas Yogs", 95.60, LocalDate.of(2022, 06, 06), true);
		Productos productoC = new Productos("Mermelada Baggio", 250.30, LocalDate.of(2022, 8, 8), true);
		Productos productoD = new Productos("Queso cremoso Cosalta", 1200.60, LocalDate.of(2022, 06, 10), true);
		Productos productoE = new Productos("Postre Serenito", 118.20, LocalDate.of(2022, 06, 03), true);
		
		Productos producto1= new Productos(null, 0, null, false);
		producto1.setNombre("Snacks Doritos");
		producto1.setPrecio(250.00);
		producto1.setVencimiento(LocalDate.of(2022, 06, 12));
		producto1.setPerecedero(false);
		Productos producto2 = new Productos("Arroz 10 Minutos", 85.80, LocalDate.of(2025, 06, 04), false);
		Productos producto3 = new Productos("Fideos Marolio", 70.20, LocalDate.of(2027, 07, 03), false);
		Productos producto4 = new Productos("Semola San Bernardo", 45.60, LocalDate.of(2028, 12, 06), false);
		Productos producto5 = new Productos("Papas fritas Lays", 350.50, LocalDate.of(2028, 06, 25), false);
		
      List<Productos> productos = List.of(productoA, productoB, productoC , productoD, productoE, producto1, producto2, producto3, producto4, producto5);
		
		double precioTotal = 0;
		// 50.5 + 100.25 + 50 + 30 + 225 = 455.75
		for(Productos producto : productos) {
			precioTotal += producto.calcularPrecio();
		}
		
		System.out.println("El precio total es: $" + precioTotal);
	}
			

}