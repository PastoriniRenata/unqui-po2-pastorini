package trabajador;

public class IngresoHoraExtra extends Ingreso {
	private int cantHsExtra;

	IngresoHoraExtra(String mes, String concepto, Double monto, int cantHsExtra) {
		super(mes, concepto, monto);
		this.cantHsExtra = cantHsExtra;		
	}
	
	@Override
	public double getMontoImponible() {
		return 0;
	}

}
