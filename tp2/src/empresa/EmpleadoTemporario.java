package empresa;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;


public class EmpleadoTemporario extends Empleado {
	private LocalDate finDesignacion;
	private Integer cantHsExtra;
	
	public Double adicPorHsExtra = 40.0;
	
	public Double descMayor50 = 25.0;


	public Double aporteJubXHsExtra = 5.0;
	public Double porcentajeAporteOS = 0.1;
	public Double porcentajeAporteJub = 0.1;
	
	
	public EmpleadoTemporario(String nombre, String direccion, String estadoCivil, LocalDate fechaNac, Double sueldoBasico,LocalDate finDesignacion, Integer cantHsExtra) {
		super(nombre, direccion, estadoCivil, fechaNac, sueldoBasico);
		this.finDesignacion = finDesignacion;
		this.cantHsExtra = cantHsExtra;
	}

	@Override
	public Double sueldoBruto() {
		return sueldoBasico +  adicPorHsExtra * cantHsExtra - retenciones();
	}

	@Override
	public Double retenciones() {
		return aporteObraSocial() + aporteJubilatorio();
	}

	@Override
	public Double aporteObraSocial() {
		return porcentajeAporteOS * sueldoBruto() + decuentoOSSiEsMayorDe50();
	}

	@Override
	public Double aporteJubilatorio() {
		return porcentajeAporteJub * sueldoBruto() + aporteJubXHsExtra * cantHsExtra;
	}
	
	public Double decuentoOSSiEsMayorDe50() {
		return descMayor50 * (( edad() > 50 )? 1:0);
	}
	
	@Override
	public  Map<String, Double> conceptos(){
		Map<String, Double> conceptos = new HashMap<>();
		conceptos.put("SueldoBasico", sueldoBasico);
		conceptos.put("AdicPorHorasExtra", adicPorHsExtra * cantHsExtra);
		conceptos.put("AporteOS", aporteObraSocial());
		conceptos.put("AporteJubilacion", aporteJubilatorio());
		
		
		return conceptos;
	}
}














