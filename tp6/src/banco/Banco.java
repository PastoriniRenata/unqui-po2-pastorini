package banco;

import java.util.ArrayList;
import java.util.List;

public class Banco {
	private List<Cliente> clientes = new ArrayList<Cliente>(); 
	private List<SolicitudCredito>  solicitudes = new ArrayList<SolicitudCredito>(); 
	
	public void addCliente(Cliente c) {
		clientes.add(c);
	}
	
	public void registrarSolicitud(SolicitudCredito s, Evaluador e ) {
		solicitudes.add(s);	
		s.esAceptable(e.evaluar(s)); 
		
		// faltaria lo de desembolsar O SERIA TIPO PRINTIAR "SE ACETO/ NO SE ACCEPTO"???
	}
	
	public double calcularDesembolso() {
		return solicitudes.stream()
						  .filter( s -> s.esAceptada() )
						  .mapToDouble(s-> s.cuotaMensual())
						  .sum();
	}
	
	public void evaluarSolicitud(SolicitudCredito s, Evaluador e ) {
		s.esAceptable(e.evaluar(s)); 
		// o es un bool y en el main/test se encarga d hacer esto y aca solo le preguntas al evaluador??
		
		// return e.evaluar(s);
	}
	
//	public void otorgarCredito(SolicitudCredito s){
//		solicitudes.add(s);		
//	}
}
