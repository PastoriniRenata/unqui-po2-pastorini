package empresa;

import java.util.HashSet;
import java.util.Set;
import java.util.function.Function;

public class Empresa {
	
	public String nombre;
	public String cuit;
	public Set<Empleado> empleados = new HashSet<>();;
	
	Empresa(String nombre, String cuit){
		this.nombre = nombre;
		this.cuit = cuit;
	}
	
	
	public Double desembolsoNeto() { 
 
		return totales(Empleado::sueldoNeto);
	}
	
	public Double totalSueldosBruto() { 
	
		return totales(Empleado::sueldoBruto);
	}
	
	
	public Double totalRetenciones() { 
		
		return totales(Empleado::retenciones);
	}
	
	public Double totales(Function<Empleado, Double> funcion) {
	    return empleados.stream()        
	            .map(funcion)            
	            .mapToDouble(d -> d)     
	            .sum();                  
	}
	
	public void liquidacionDeSueldos() {
		for(Empleado e : empleados) {
			ReciboDeSueldo r = new ReciboDeSueldo(e);
			e.guardarRecibo(r);
		}
		
	}
	
	
	
	
}
