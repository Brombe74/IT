/* Andoniu Daniel 3°AI 25/10/2017
 * esercizio che verifica l'MCd di un numero tramite le sottrazioni successive*/

import java.util.*;
public class MCDsottrazione {
	
	public static void main (String args[]) {
		Scanner input =new Scanner(System.in);
		int M,N;
			System.out.println("Inserisci M:");
			M=input.nextInt();
			System.out.println("Inserisci N:");
			N=input.nextInt();
			do{
				if(M>N)
				M=M-N;
				else
				N=N-M;}
			while(M!=N);
		System.out.println("MCD:"+M);
		}
}
