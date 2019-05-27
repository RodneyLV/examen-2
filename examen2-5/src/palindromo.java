
import java.util.Scanner;

//Llantoy Vargas Rodney
public class palindromo {
	public static void main(String[] args) {
		
		Scanner t = new Scanner(System.in);
		
		System.out.println("escriba la palabra a evaluar");
		String m =t.nextLine();
		
		String c =palindromo(m);
		
		

	}
	
	
	public static String palindromo(String m) {
		
		String c="";
		
		for(int i = m.length()-1 ; i >= 0; i--) {
			
			c =  c + m.charAt(i);
		}

		if(m.length()>=2) {
			if (m.equals(c))
				System.out.println("Es un palindromo");
			else
			System.out.println("No es un palindrmo");
		}else
			System.out.println("no ha introduciodo una palabra");

		
		return c;
	}
	
	
	
	

}
