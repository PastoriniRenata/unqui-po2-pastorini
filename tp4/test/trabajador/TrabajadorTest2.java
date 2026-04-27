package trabajador;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class TrabajadorTest2 {

    private Ingreso ingreso1;
    private Ingreso ingreso2;
    private IngresoHoraExtra ingreso3;

    private Trabajador trabajador1;
    
    @BeforeEach
    public void setUp() {
        ingreso1 = new Ingreso("Enero", "Motivo 1", 1000);
        ingreso2 = new Ingreso("Febrero", "Motivo 2", 2000);
        ingreso3 = new IngresoHoraExtra("Marzo", "Motivo hs extra", 500, 5);
        
        trabajador1 = new Trabajador();
        
        trabajador1.agregarIngreso(ingreso1);
        trabajador1.agregarIngreso(ingreso2);
        trabajador1.agregarIngreso(ingreso3);
    }
    
    @Test
    public void trabajadorTest() {
        
        assertEquals(3500.0, trabajador1.getTotalPercibido());
        
    }

}
