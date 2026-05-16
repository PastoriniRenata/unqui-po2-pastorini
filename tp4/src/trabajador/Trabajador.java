package trabajador;

import java.util.ArrayList;
import java.util.List;


public class Trabajador {
	private List<Ingreso> ingresosPercibidosAnio = new ArrayList<Ingreso>();
	
	
	public void agregarIngreso(Ingreso ingreso) {
		ingresosPercibidosAnio.add(ingreso);
	}
	
	
	public Double getTotalImponible() {
		return ingresosPercibidosAnio.stream()	
									 .mapToDouble(Ingreso::getMontoImponible)
									 .sum();
				
//				
//				.filter(i -> i.getClass() == Ingreso.class) // con filter instanceof no!! xq al ser clase madre-hija, los debe tomar como iguales
//									 .mapToDouble(i -> i.getMontoPercibido())
//									 .sum();
	}
	
	
	public Double getTotalPercibido() {
		Double total =  ingresosPercibidosAnio.stream()	
				 							  .mapToDouble(Ingreso::getMontoPercibido)
				 							  .sum();
		
		return total - getImpuestoAPagar();
	}
	
	public Double getImpuestoAPagar(){
		return 0.2 * getTotalImponible();
	}
	

}
