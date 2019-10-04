#include <stdio.h>
#include <stdlib.h>


int main()
{
	
	float Numbers[10]={0.0,1.1,2.2,3.3,4.4,5.5,6.6,7.7,8.8,9.9};
	
	
	int i;
	
	for(i=0;i<10;i++)
	{
		printf("\nValore in posizione [%d]:%.2f",i,Numbers[i]);
	}
	
	float* nPtr;
	
	char c[25];//variabile usata successivamente
	
	nPtr=malloc(sizeof(float));
	
	Numbers[0]=0.0;
	
	nPtr=Numbers;
	
	printf("\n");
	
	for(i=0;i<10;i++)
	{
		printf("\nValore in posizione, tramite puntatore [%d]:%.2f",i,Numbers[i]);
	}
	
	printf("\n\n\n************************************************\n\n\n");
	
	
	int *a;
	
	int d;
	
	printf("\nPremi qualsiasi tasto per procedere: ");	//input per poter pulire il terminale
	scanf("%s",c);
	
	system("clear");

	printf("Inserisci la dimensione del vettore:");
	scanf("%d",&d);
	
	a=malloc(d*sizeof(int));
	

	
	for(i=0;i<d;i++)
	{
		printf("\nInserisci il valore in posizione [%d]: ",i);
		scanf("%d",&a[i]);
	}
	
	for(i=0;i<d;i++)
	{
		printf("\nValore in posizione [%d] :%d",i,*(a+i)); // *(a+i) == a[i]
	}
	
	
	
	
	return 0;
}
