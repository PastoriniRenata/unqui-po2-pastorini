package supermercado;

public class ProductoPrimeraNecesidad extends Producto {
	private Double porcentajeDescuento;

	ProductoPrimeraNecesidad(String nombre, Double precio, boolean esPrecioCuidado, Double porcentajeDescuento) {
		super(nombre, precio, esPrecioCuidado);
		this.porcentajeDescuento = porcentajeDescuento;
	}
	
	
	//no se si hace falta:
	ProductoPrimeraNecesidad(String nombre, Double precio, Double porcentajeDescuento) {
		super(nombre, precio);
		this.porcentajeDescuento = porcentajeDescuento;
	}
	
	@Override
	public Double getPrecio() {
		return precio * (1 - porcentajeDescuento/100);
	}
	
}
