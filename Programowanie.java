import static java.lang.Character.toUpperCase;

public class Programowanie {
	public static void main(String args[]){
		
	char dane[] = {'p','r','o','g','r','a','m','o','w','a','n','i','e'};
	
	for(int i = 0; i < dane.length; i++){
		if (i == 0){
			System.out.print(toUpperCase(dane[0]));
		}
		else {
			System.out.print(dane[i]);
		}
			
	}
		
		System.out.println();
		
	for( int i = 0; i < dane.length; i++){
		System.out.print(toUpperCase(dane[i]));
	}
	
}
}
