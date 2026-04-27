package trabajador;

import java.util.ArrayList;

public class Trabajador {
	private ArrayList<Ingreso> ingresosPercibidosAnio = new ArrayList<Ingreso>();
	
	
	public void agregarIngreso(Ingreso ingreso) {
		ingresosPercibidosAnio.add(ingreso);
	}
	
	
	public double getTotalImponible() {
		return ingresosPercibidosAnio.stream()	
									 .filter(i -> i.getClass() == Ingreso.class) // con filter instanceof no!! xq al ser clase madre-hija, los debe tomar como iguales
									 .mapToDouble(i -> i.getMontoPercibido())
									 .sum();
		
	}
	
	public double getTotalPercibido() {
		return ingresosPercibidosAnio.stream()	
				 .mapToDouble(i -> i.getMontoPercibido())
				 .sum();
	}
	
	public double getImpuestoAPagar(){
		return 0.2 * getTotalImponible();
	}
	

}
