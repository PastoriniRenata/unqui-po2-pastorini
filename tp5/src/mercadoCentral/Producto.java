package mercadoCentral;

public class Producto {
	protected double precio;
	protected int stock = 0;
	
	Producto (double precio, int stock){
		this.precio = precio;
		this.stock = stock;
	}
	
	Producto (double precio){
		this.precio = precio;
	}
	
	public double getPrecio() {
		return precio;
	}
	
	public void decrementarStock() {
		if(stock == 0) {
			throw new IllegalArgumentException("No hay stock del producto");
		}
		stock--;
	}
	
	public void incrementarStock() {
		stock++;
	}
	
	
}
