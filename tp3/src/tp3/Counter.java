package tp3;

import java.util.ArrayList;  
import java.util.Collections;  
import java.util.List;  
  
public class Counter {  
    private ArrayList<Integer> arr = new ArrayList<Integer>();  
  
    public void addNumber(Integer i) {  
        this.arr.add(i);  
    }  
  
    public int getEvenOcurrences() {  
        return (int) arr.stream().filter(i -> i%2 == 0).count();  
    }  
  
    public int getOddOcurrences() {  
        return (int) arr.stream().filter(i -> i%2 != 0).count();  
    }  
  
    public int losDivisiblesPor(Integer j) {  
        return (int) arr.stream().filter(i -> i%j == 0).count();  
    }  
      
      
      
      
    public int mayorCantDeDigitosPares(){  
        int mayorCantPares = arr.get(0);  
        for(int y:arr) {  
           mayorCantPares = elQueMasParesTiene(mayorCantPares, y);  
                   
        }  
  
        return mayorCantPares;  
    }  
          
    public int elQueMasParesTiene(int x, int y) {  
        return (cantDigitosPares(x) >= cantDigitosPares(y))? x:y;  
    }  
      
    public int cantDigitosPares(int x) {  
          
        int cantDigPares = 0;  
        
        
          
        while(x>0) {  
           cantDigPares += (x%2 == 0) ? 1: 0;   
           x = x/10;  
        }  
          
        return cantDigPares;  
    }  
      
      
      
    public int multiploComunMayor(int x, int y) {  
        int mCMayor = 1000;  
        while(mCMayor > -1 && !(mCMayor%x == 0 && mCMayor%y == 0)) {  
           mCMayor -=1 ;  
        }  
          
        return (mCMayor == 0)? -1 : mCMayor;  
    }  
      
      
      
      
}