

import java.util.Scanner;

public class consecutivos {
	public static void main(String[] args) {
		
		Scanner t = new Scanner(System.in);
		
		System.out.println("Cuantos numeros desea ingresar: ");
		int j = t.nextInt();
		
		int[] A = new  int[j];
		
		for(int i = 0; i <j; i++) {
			System.out.println("Rellene el "+(i+1)+" numero");
			
			A[i] =t.nextInt();
			
		}
		int z=0, multi, a = A[0]*A[1]*A[2]*A [3];
		
		//codigo que obtiene el mayr valor de la multiplicacion y la posicion
		if(j >= 4) {
			
			for (int k= 0; k<=j-4; k++) {
				
				multi = A[k]*A[k+1]*A[k+2]*A[k+3];
				System.out.println(multi);
				
				if(multi > a) {
					a = multi;
					z = k;
					System.out.println("El valor de k es : "+ k + "y el valor de a es : "+a);
				}		
			}	
		}
		else
			System.out.println("error numeros insuficientes");
		
		
		System.out.println("los numeros son: ");
		
		/*se imprime los valores del conjunto de nmeros consecutivos 
		que dan la mayor multiplicacion, a partir de posicion obtenida*/
		
		for(int s =0; s<4 ; s++) {
			
			System.out.println(A[z]);
			z++;
		}

		
	}


}
