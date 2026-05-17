package mercadoCentral;

public class Impuesto extends Factura {
	private double tasaDelServicio; 
	
	public Impuesto(double tasaDelServicio, AgenciaRecaudadora agencia) {
		super(agencia);
		this.tasaDelServicio = tasaDelServicio;
	}
	
	@Override
	public double montoAPagar() {

		return tasaDelServicio;
	}


}
