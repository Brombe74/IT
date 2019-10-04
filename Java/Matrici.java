import java.util.*;
import java.util.Random;
public class Matrici{


public static void main(String args[]){
				//dichiarare una matrice 10X10
				//con valori casuali compresi tra 0 e 100
			int a[][]=new int [10][10];
			a [0][0]=23;
			int i=0,j=0;
			System.out.println("STAMPA MATRICE");
			for(i=0;i<=9;i++){		//scorre righe
				for(j=0;j<=9;j++){
						a[i][j]=(int) (Math.random()*100);
					System.out.print(String.format("%4d",a[i][j]));
					} //fine colonne
					System.out.println(""); //fine righe
			}
		}
	}
