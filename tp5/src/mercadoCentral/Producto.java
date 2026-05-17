package mercadoCentral;

public class Producto implements Registrable{
	protected double precio;
	protected int stock = 1;
	
	public Producto (double precio, int stock){
		this.precio = precio;
		this.stock = stock;
	}
	
	public Producto (double precio){
		this.precio = precio;
	}
	
	public void registrar() {
		this.decrementarStock();
	}
	
	public double montoAPagar() {
		return this.getPrecio();
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
	
	public int getStock() {
		return this.stock;
	}
	
	
}
