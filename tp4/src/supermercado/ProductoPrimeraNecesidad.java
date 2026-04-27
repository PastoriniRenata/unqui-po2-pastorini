package supermercado;

public class ProductoPrimeraNecesidad extends Producto {
	private double porcentajeDescuento;

	ProductoPrimeraNecesidad(String nombre, double precio, boolean esPrecioCuidado, double porcentajeDescuento) {
		super(nombre, precio, esPrecioCuidado);
		this.porcentajeDescuento = porcentajeDescuento;
	}
	
	
	//no se si hace falta:
	ProductoPrimeraNecesidad(String nombre, double precio, double porcentajeDescuento) {
		super(nombre, precio);
		this.porcentajeDescuento = porcentajeDescuento;
	}
	
	@Override
	public double getPrecio() {
		return precio * (1 - porcentajeDescuento/100);
	}
	
}
