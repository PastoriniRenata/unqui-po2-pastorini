package mercadoCentral;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class mercadoCentralTest {
	
	private Caja caja1;
	private Producto arroz;
	private Producto leche;
	private Producto azucar;
	private Producto carne;
	
	
	@BeforeEach
    public void setUp() {
		caja1 = new Caja();
		arroz = new ProductoCooperativa(100, 10);
		leche = new Producto(200);
		azucar = new Producto(300, 5); 
		carne = new Producto(1000, 2);
		
	}
	 
	 
	@Test
	void intentaComprarLeche() {
		caja1.registrar(leche);
		
		// Verifica que se lance IllegalArgumentException al agregar la aleche a la caja porque no tiene stock
        IllegalArgumentException excepcion = assertThrows(
            IllegalArgumentException.class, 
            () -> caja1.registrar(leche)
        );

        // Verifica que el mensaje de error sea el correcto
        assertEquals("No hay stock del producto", excepcion.getMessage());
    }
	
	@Test
	void stockCambia() {
		caja1.registrar(arroz);
		caja1.registrar(arroz);
		caja1.registrar(arroz);
		caja1.registrar(azucar);
		caja1.registrar(carne);
		
		assertEquals(arroz.getStock(), 7);
		assertEquals(azucar.getStock(), 4);
		assertEquals(carne.getStock(), 1);	
	}
	
	@Test
	void subeStock() {
		arroz.incrementarStock();
		assertEquals(arroz.getStock(), 11);
	}
	
	@Test
	void totalCaja(){
		caja1.registrar(arroz);
		caja1.registrar(arroz);
		caja1.registrar(arroz);
		caja1.registrar(azucar);
		caja1.registrar(carne);
		assertEquals(caja1.montoTotal(), 1570);
	}
	
	
	

}
