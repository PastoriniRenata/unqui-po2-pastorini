package trabajador;

public class IngresoHoraExtra extends Ingreso {
	private double cantHsExtra;

	IngresoHoraExtra(String mes, String concepto, double monto, double cantHsExtra) {
		super(mes, concepto, monto);
		this.cantHsExtra = cantHsExtra;
		
	}

}
