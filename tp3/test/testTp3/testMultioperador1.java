package testTp3;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import tp3.Multioperador;



class testMultioperador1 {

	private Multioperador operador; 
	private ArrayList<Integer> arr;
	
	
	
	@BeforeEach  
    public void setUp() throws Exception {  
		 operador = new Multioperador(); 
		 arr = new ArrayList<Integer>();
		 
		 arr.add(1);
		 arr.add(2);
		 arr.add(3);
		 arr.add(4);
	 }
	 
	@Test  
    public void testSuma() {  

        int amount = operador.suma(arr);  
        
        assertEquals( 10,amount);  
    }  
	
	@Test  
    public void testResta() {  

        int amount = operador.resta(arr);  
 
        assertEquals( -8,amount);  
    }  
	
	@Test  
    public void testMultiplic() {  
        // Getting the even occurrences  
        int amount = operador.multiplicacion(arr);  
        // I check the amount is the expected one  
        assertEquals( 24,amount);  
    }  
	
	
	

}



