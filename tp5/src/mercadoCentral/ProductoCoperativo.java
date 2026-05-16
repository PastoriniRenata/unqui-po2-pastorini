package mercadoCentral;

public class ProductoCoperativo extends Producto {
	
	ProductoCoperativo(double precio, int stock) {
		super(precio, stock);
		// TODO Auto-generated constructor stub
	}

	private double porcentajeDescuento = 10d;
	
	@Override
	public double getPrecio() {
		return precio * (1 - porcentajeDescuento/100);
	}
}
