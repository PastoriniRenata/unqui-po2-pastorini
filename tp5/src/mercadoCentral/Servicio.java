package mercadoCentral;

public class Servicio extends Factura {
	

	private double costoPorUnidad;
	private int cantUnidadesConsumidas;
	
	Servicio(double costoPorUnidad, int cantUnidadesConsumidas,AgenciaRecaudadora agencia) {
		super(agencia);
		this.costoPorUnidad = costoPorUnidad;
		this.cantUnidadesConsumidas = cantUnidadesConsumidas;
	}
	
	@Override
	public double montoAPagar() {
		return costoPorUnidad * cantUnidadesConsumidas;
	}

	

}
