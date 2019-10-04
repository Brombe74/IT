import java.util.*;
public class vettori{
	
	
	
	public static void main(String[] args){
		//definire il vettore nel main e passare il vettore
		//come parametro per fare la stampa
		int v[]=new int[10];
		//oppure
		int dim;
		dim=15;
		int v2[]=new int[dim];
		int i=0;
		for(i=0;i<10;i++)
		v[i]=i;
		for(i=0;i<10;i++) //se metto 11 o maggiore mi da sempre giusto ma mi da un errore di range
		System.out.println(" "+v[i]);
		System.out.println(" "+v[4]);
		System.out.println(" "+v[5]);
		System.out.println(" "+v[12]); //mi da errore perchè è fuori dal range
	}
	}
