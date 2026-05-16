package supermercado;

public class Producto {
	protected String nombre;
	protected Double precio;
	protected boolean esPrecioCuidado = false;

	Producto(String nombre, Double precio, boolean esPrecioCuidado){
		this.nombre = nombre;
		this.precio = precio;
		this.esPrecioCuidado = esPrecioCuidado;
	}
	
	Producto(String nombre, Double precio){
		this.nombre = nombre;
		this.precio = precio;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public Double getPrecio() {
		return precio;
	}
	
	public boolean esPrecioCuidado() {
		return esPrecioCuidado;
	}
	
	public void aumentarPrecio(Double aumento) {
		precio += aumento;
	}
	

}
