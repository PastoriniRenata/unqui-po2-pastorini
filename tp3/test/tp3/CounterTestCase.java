package tp3;  
  
import static org.junit.jupiter.api.Assertions.*;  
import org.junit.jupiter.api.BeforeEach;  
import org.junit.jupiter.api.Test;  

  
public class CounterTestCase {  
    private Counter counter;  
        /**  
        * Crea un escenario de test básico, que consiste en un contador        * con 10 enteros        *        * @throws Exception  
        */    
    @BeforeEach  
    public void setUp() throws Exception {  
        //Se crea el contador  
        counter = new Counter();  
        //Se agregan los numeros. Un solo par y nueve impares  
        counter.addNumber(123);  
        counter.addNumber(345);  
        counter.addNumber(56689);  
        counter.addNumber(71314);  
        counter.addNumber(992614);  
        //counter.addNumber(1);  
        //counter.addNumber(1);        
		//counter.addNumber(1);        
		//counter.addNumber(1);        
		//counter.addNumber(4);    
        }  
    /**  
    * Verifica la cantidad de pares    */    @Test  
    public void testEvenNumbers() {  
        // Getting the even occurrences  
        int amount = counter.getEvenOcurrences();  
        // I check the amount is the expected one  
        assertEquals(amount, 2);  
    }  
      
    @Test  
    public void testOddNumbers() {  
        // Getting the odd occurrences  
        int amount = counter.getOddOcurrences();  
        // I check the amount is the expected one  
        assertEquals(amount, 3);  
    }  
      
    @Test  
    public void testDivisibles() {  
        int amount = counter.losDivisiblesPor(1);  
        assertEquals(amount, 5);  
    }  
    //////////////////////////////////////////////  
    @Test  
    public void testMasPares() {  
        int amount = counter.mayorCantDeDigitosPares();  
        assertEquals(amount, 56689);  
    }  
      
    @Test  
    public void testMultiplos() {  
          
        assertEquals(999, counter.multiploComunMayor(3,9));  
        assertEquals(-1, counter.multiploComunMayor(999,1000));  
    }  
      
      
}