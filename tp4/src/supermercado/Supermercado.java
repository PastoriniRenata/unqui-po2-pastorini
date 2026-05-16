package supermercado;

import java.util.ArrayList;
import java.util.List;

public class Supermercado {
	private String nombre;
	private String direccion;
	private List<Producto> productos = new ArrayList<Producto>();
	
	Supermercado (String nombre, String direccion){
		this.nombre = nombre;
		this.direccion = direccion;
	}
	
	public int getCantidadDeProductos() {
		return productos.size();
	}
	
	public void agregarProducto(Producto p) {
		productos.add(p);
	}
	
	public Double getPrecioTotal() {
		return productos.stream()
                		.mapToDouble(p -> p.getPrecio())
                		.sum();
	}
	
}
