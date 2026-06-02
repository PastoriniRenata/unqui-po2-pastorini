package banco;

public abstract class SolicitudCredito {
	private Cliente cliente;
	private double monto;
	private int plazoMeses;
	private boolean esAceptable = false;
	
	
	public SolicitudCredito(Cliente cliente, double monto, int plazoMeses) {
		this.cliente = cliente;
		this.monto = monto;
		this.plazoMeses = plazoMeses;
		
	}
	
	public double cuotaMensual() {
		return this.monto/this.plazoMeses;
	}
	
	
	
	
	public void setAceptable(boolean b) {
		this.esAceptable = b ;
	}
	
	public boolean esAceptada() {
		return this.esAceptable;
	}

	
	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public double getMonto() {
		return monto;
	}

	public void setMonto(double monto) {
		this.monto = monto;
	}

	public int getPlazoMeses() {
		return plazoMeses;
	}

	public void setPlazoMeses(int plazoMeses) {
		this.plazoMeses = plazoMeses;
	}

	public boolean isEsAceptable() {
		return esAceptable;
	}

	public void setEsAceptable(boolean esAceptable) {
		this.esAceptable = esAceptable;
	}

	
	

	
}
