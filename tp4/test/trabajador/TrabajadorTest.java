package trabajador;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;



class TrabajadorTest {

	private Trabajador trabajador;
	
	private Ingreso ingresoMarzo;
	private IngresoHoraExtra ingresoAbril;
	private Ingreso ingresoMayo;
	private Ingreso ingresoJunio;
	private Ingreso ingresoJulio;
	
	
	
	@BeforeEach
	public void setUp() {
		trabajador = new Trabajador();
		ingresoMarzo = new Ingreso("Marzo", "sueldo", 110.5d);
		ingresoAbril = new IngresoHoraExtra("Abril", "extra", 987.9, 5);
		ingresoMayo = new Ingreso("Mayo", "Sueldo", 100.5d);
		ingresoJunio = new Ingreso("Junio", "Sueldo", 190d);
		ingresoJulio = new Ingreso("Julio", "Sueldo", 200.0);
		
		
		trabajador.agregarIngreso(ingresoMarzo);
		trabajador.agregarIngreso(ingresoAbril);
		trabajador.agregarIngreso(ingresoMayo);
		trabajador.agregarIngreso(ingresoJunio);
		trabajador.agregarIngreso(ingresoJulio);
		
	}
	
	@Test
	public void testCalcularTotalPercibido() {
		assertEquals(new Double(1588.9), trabajador.getTotalPercibido());
	}
	
	
	@Test
	public void testCalcularTotalImponible() {
		assertEquals(new Double(601), trabajador.getTotalImponible());
	}
	
	@Test
	public void testCalcularTotalImpuesto() {
		assertEquals(new Double(120.2), trabajador.getImpuestoAPagar());
	}
	   
	
	
	
}







