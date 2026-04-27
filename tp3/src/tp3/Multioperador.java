package tp3;

import java.util.ArrayList;

public class Multioperador {
	public int suma(ArrayList<Integer> arr) {
		int total = 0;
		
		if(arr.size()!=0) {
			for(int x:  arr) {
				total += x;
			}
		}
		
		return total;
	}
	
	
	public int resta(ArrayList<Integer> arr) {
		int total = 0;
		
		if(arr.size()>0) {
			total = arr.get(0);
			arr.remove(0);
			
			for(int x:  arr) {
				total -= x;
			}
			
		}
		
	
		
		return total;
	}
	
	public int multiplicacion(ArrayList<Integer> arr) {
		int total = 1;
		
		if(arr.size()==0) {
			total = 0;
		}
		
		for(int x:  arr) {
			total *= x;
		}
		
		
		return total;
	}
}
