package empresa;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;


public class EmpleadoPermanente extends Empleado {
	private Integer cantHijos;
	private Integer antiguedad;
	
	public Double asigPorHijo = 150.0;
	public Double asigPorConyuge = 100.0;
	public Double adicPorAntig = 50.0;
	
	public Double porcentajeAporteOS = 0.1;
	public Double porcentajeAporteJub = 0.15;
	public Double retPorHijo = 20.0;
	
	public EmpleadoPermanente(String nombre, String direccion, String estadoCivil, LocalDate fechaNac, Double sueldoBasico, Integer cantHijos, Integer antiguedad ) {
		super(nombre, direccion, estadoCivil, fechaNac, sueldoBasico);
		this.cantHijos = cantHijos;
		this.antiguedad = antiguedad;
		
	}
	@Override
	public Double sueldoBruto() {

		return sueldoBasico + salarioFamiliar() + antiguedad * adicPorAntig;
	}
	private Double salarioFamiliar() {
		return asignacionPorHijo() +  asignacionPorConyuge() ;
	}
	
	private Double asignacionPorHijo(){
		return asigPorHijo * cantHijos;
	}
	
	public Double asignacionPorConyuge() {
		return asigPorConyuge * (( estadoCivil == "Casado/a") ? 1 : 0);
	}
	@Override
	public Double retenciones() {
		return aporteObraSocial() + retencionPorHijo() + aporteJubilatorio();
	}
	@Override
	public Double aporteObraSocial() {
		return porcentajeAporteOS * sueldoBruto();
	}
	@Override
	public Double aporteJubilatorio() {
		return porcentajeAporteJub * sueldoBruto();
	}
	
	private Double retencionPorHijo() {
		return cantHijos * retPorHijo;
	}
	@Override
	public  Map<String, Double> conceptos(){
		Map<String, Double> conceptos = new HashMap<>();
		conceptos.put("SueldoBasico", sueldoBasico);
		conceptos.put("AsignacionPorHijo", asignacionPorHijo() );
		conceptos.put("AsignacionPorConyuge", asignacionPorConyuge() );
		conceptos.put("AporteOS", aporteObraSocial());
		conceptos.put("AporteJubilacion", aporteJubilatorio());
		
		
		return conceptos;
	}
	
}
