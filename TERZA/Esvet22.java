//Andoniu Daniel 3°AI 22/11/2017

import java.util.*;
import java.util.Random;
public class Esvet22 {
	public static int crea(int a[])
		{	int N;
			Scanner input =new Scanner(System.in);
			do{
			System.out.print("Inserisci grandezza del vettore:");
			a[N]=input.nextInt();
			for(int i=0;i<a.length;i++)
			a[i]=(int) (Math.random()*100);
		}
			while(N<=10);
		retun a;
	public static void main (String args[]) {
		int i;
		System.out.println("Inserisci grandezza del vettore:");
		i=input.nextInt();
		int v[]=new int[i];
		crea(v);
	}
}
