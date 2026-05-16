package mercadoCentral;

import java.util.ArrayList;
import java.util.List;

public class Caja {
	private List<Producto> productos = new ArrayList<Producto>();
	
	public double montoTotal() {
		return productos.stream().mapToDouble(p -> p.getPrecio()).sum();
	}
	
	public void addProducto(Producto producto) {
		productos.add(producto);
	}
	
	
	
}
