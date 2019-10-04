import java.util.*;
// per fare lettura
//libreria scanner
public class primoesercizio {
	
	public static void main (String args[]) {
		Scanner input =new Scanner(System.in);
		System.out.println("Inserisci un numero");
		int s=input.nextInt();
		switch(s){
		case 1:
		System.out.println("Oggi è lunedì");
		break;
		case 2:
		System.out.println("Oggi è martedì");
		break;
		case 3:
		System.out.println("Oggi è mercoledì");
		break;
		case 4:
		System.out.println("Oggi è giovedì");
		break;
		case 5:
		System.out.println("Oggi è venerdì");
		break;
		case 6:
		System.out.println("Oggi è sabato");
		break;
		case 7:
		System.out.println("Oggi è domenica");
		break;

		default:System.out.println("errore");}
}

}
