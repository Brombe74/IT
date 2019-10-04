/*Leggere un voto in input (carattere tra "A" ed "E") e stamparne il significato:
 * A = ottimo, B = discreto, C = sufficiente, D = insufficiente, E = gravemente insufficiente*/
import java.util.*;
public class Esercizio1 {
	
	public static void main (String args[])
	 {
		
		Scanner input =new Scanner(System.in);
		
		char v;
		
		System.out.println("Inserisci voto tra A ed E:");
		
		c=input.next().charAt(0);
		switch(v)
		{
			
		case 'A':
			System.out.println("Ottimo");
			break;
			
		case 'B':
			System.out.println("Discreto");
			break;
			
		case 'C':
			System.out.println("sufficiente");
			break;
			
		case 'D':
			System.out.println("Insufficiente");
			break;
	
		case 'E':
			System.out.println("Gravemente insufficiente");
			break;
			
		default: System.out.print("errore");
		
		}
	}
