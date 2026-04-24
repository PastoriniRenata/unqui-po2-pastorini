package empresa;

import java.time.LocalDate;
import java.util.Map;


public class ReciboDeSueldo {
	public String nombreEmpleado; 
	public LocalDate fechaEmision; 
	public String direccion; 
	public Double sueldoBruto; 
	public Double sueldoNeto; 
	public Map<String, Double> conceptos;  
	
	public ReciboDeSueldo(Empleado e) {
		this.nombreEmpleado = e.nombre;
		this.fechaEmision = LocalDate.now();
		this.direccion = e.direccion;
		this.sueldoBruto = e.sueldoBruto();
		this.sueldoNeto = e.sueldoNeto();
		this.conceptos = e.conceptos();
		
	}

}
