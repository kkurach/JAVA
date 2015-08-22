// zadanie 3.5

public class Wspak2 {
	public static void main(String args[]){
		
		char dane[] = {'p','r','o','g','r','a','m','o','w','a','n','i','e'};
		
		
		for(int j = dane.length - 1, i = 0; i < j; i++, j--){
			
			char p = dane[i];
			dane[i] = dane[j];
			dane[j] = p;
		
		
		}
		System.out.println(dane);
	}
}