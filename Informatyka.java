// zadanie 3.2

import static java.lang.Character.toUpperCase;
import static java.lang.Character.toLowerCase;

public class Informatyka {
	public static void main(String args[]){
		
		char znak[] = {'I', 'n', 'f','o' ,'r', 'm', 'a', 't', 'y', 'k', 'a'};
		
		
		for(char z : znak ){	
			System.out.print(z);
			System.out.print('\n');
		}
		
		for(char z : znak){
			System.out.print(z);
			System.out.print(' ');
		}
			
			System.out.println();
		for(char z : znak){
			System.out.print(toUpperCase(z));
			
		}
		
			System.out.println();
		for(char z : znak){
			System.out.print(toLowerCase(z));
		}
 
	}
    
}