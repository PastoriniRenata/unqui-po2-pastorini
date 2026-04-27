package trabajador;

public class Ingreso {
	private String mes;
	private String concepto;
	private double monto;
	
	Ingreso(String mes, String concepto, double monto){
		this.mes = mes;
		this.concepto = concepto;
		this.monto = monto;
	}
	
	public double getMontoPercibido() {
		return monto;
	}
	
	
}
