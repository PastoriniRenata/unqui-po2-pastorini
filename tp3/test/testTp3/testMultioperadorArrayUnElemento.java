package testTp3;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import tp3.Multioperador;

class testMultioperadorArrayUnElemento {

	private Multioperador operador; 
	private ArrayList<Integer> arr;
	
	
	
	@BeforeEach  
    public void setUp() throws Exception {  
		 operador = new Multioperador(); 
		 arr = new ArrayList<Integer>();
		 
		 arr.add(10);

	 }
	 
	@Test  
    public void testSuma() {  

        int amount = operador.suma(arr);  
        
        assertEquals( 10,amount);  
    }  
	
	@Test  
    public void testResta() {  

        int amount = operador.resta(arr);  
 
        assertEquals( 10,amount);  
    }  
	
	@Test  
    public void testMultiplic() {  

        int amount = operador.multiplicacion(arr);  

        assertEquals( 10,amount);  
    }  
	
	
}
