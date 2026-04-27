package supermercado;

public class Producto {
	protected String nombre;
	protected double precio;
	protected boolean esPrecioCuidado = false;

	Producto(String nombre, double precio, boolean esPrecioCuidado){
		this.nombre = nombre;
		this.precio = precio;
		this.esPrecioCuidado = esPrecioCuidado;
	}
	
	Producto(String nombre, double precio){
		this.nombre = nombre;
		this.precio = precio;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public double getPrecio() {
		return precio;
	}
	
	public boolean esPrecioCuidado() {
		return esPrecioCuidado;
	}
	
	public void aumentarPrecio(double aumento) {
		precio += aumento;
	}
	

}
