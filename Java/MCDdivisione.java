/* Andoniu Daniel 3°AI 25/10/2017
 * esercizio che verifica l'MCd di un numero tramite le divisioni successive*/

import java.util.*;
public class MCDdivisione 
{
	
	public static void main (String args[])
	 {
		
		Scanner input =new Scanner(System.in);
		
		int a,b,r;
		
		System.out.println("Inserisci a:");
		a=input.nexInt();
		
		System.out.println("Inserisci b:");
		b=input.nexInt();
		
		if(a>b)
		{
			r=b;
			b=a;
			a=r;
		}	
			r=(a%b==0);
		do{
			if(r==0)		
				{
					System.out.println("MCD:"+b);
				}
					
			else{
				a=b;
				b=r;
				r=a%b;
				}
			}while(a%b==0);
		
	}
}
