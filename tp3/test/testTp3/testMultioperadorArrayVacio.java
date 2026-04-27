package testTp3;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import tp3.Multioperador;

class testMultioperadorArrayVacio {

	private Multioperador operador; 
	private ArrayList<Integer> arr;
	
	
	
	@BeforeEach  
    public void setUp() throws Exception {  
		 operador = new Multioperador(); 
		 arr = new ArrayList<Integer>();

	 }
	 
	@Test  
    public void testSuma() {  

        int amount = operador.suma(arr);  
        
        assertEquals( 0 ,amount);  
    }  
	
	@Test  
    public void testResta() {  

        int amount = operador.resta(arr);  
 
        assertEquals( 0 ,amount);  
    }  
	
	@Test  
    public void testMultiplic() {  
        // Getting the even occurrences  
        int amount = operador.multiplicacion(arr);  
        // I check the amount is the expected one  
        assertEquals( 0 ,amount);  
    }  
	

	
}
