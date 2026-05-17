package mercadoCentral;

abstract class Factura implements Registrable{
	private AgenciaRecaudadora agenciaRecaudadora;
	
	public Factura(AgenciaRecaudadora agencia){
		this.agenciaRecaudadora = agencia;
	}
	
	abstract public double montoAPagar();
	
	public void registrar() {
		agenciaRecaudadora.registrarPago(this);
	}
}
