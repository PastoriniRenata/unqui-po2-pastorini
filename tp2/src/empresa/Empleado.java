package empresa;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;


public abstract class Empleado {
	public String nombre;
	public String direccion;
	public String estadoCivil;
	public LocalDate fechaDeNacimiento;
	public Double sueldoBasico;
	
	public Double porcentajeAporteOS ; // se sobreescriben en las clases hijas, esta bien ponerlos aca??
	public Double porcentajeAporteJub ; // se sobreescriben en las clases hijas, esta bien ponerlos aca??

	public Set<ReciboDeSueldo> recibosDeSueldo = new HashSet<>();

	public Empleado(String nombre, String direccion, String estadoCivil, LocalDate fechaNac, Double sueldoBasico){
		
		this.nombre = nombre;
		this.direccion = direccion;
		this.estadoCivil = estadoCivil;
		this.fechaDeNacimiento = fechaNac;
		this.sueldoBasico = sueldoBasico;
	}
	
	public Long edad(){
		return ChronoUnit.YEARS.between(fechaDeNacimiento, LocalDate.now());
	}
	public Double sueldoNeto() {
		return  sueldoBruto() - retenciones();
	}

	public abstract Double sueldoBruto();
	
	public abstract Double retenciones();
	
	public abstract Double aporteObraSocial();

	public abstract Double aporteJubilatorio();
	
	public abstract Map<String, Double> conceptos();
	
	public void guardarRecibo(ReciboDeSueldo r) {
		recibosDeSueldo.add(r);
	}
}
