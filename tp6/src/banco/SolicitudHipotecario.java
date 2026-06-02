package banco;

public class SolicitudHipotecario extends SolicitudCredito {
	private Propiedad prop;
	
	public SolicitudHipotecario(Cliente cliente, double monto, int plazoMeses, Propiedad prop) {
		super(cliente, monto, plazoMeses);
		this.prop = prop;
	}
	
	public Propiedad propiedadGarantia() {
		return this.prop;
	}
	
	public void setPropiedad(Propiedad prop) {
		this.prop = prop;
	}
	
	

}
