package mercadoCentral;

public class ProductoCooperativa extends Producto  {
	private double porcentajeDescuento = 10d;
	
	public ProductoCooperativa(double precio) {
		super(precio);
	}
	
	public ProductoCooperativa(double precio, int stock) {
		super(precio, stock);
	}

	@Override
	public double getPrecio() {
		return this.precio * (1 - porcentajeDescuento/100);
	}
}