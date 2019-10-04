
#include <stdio.h>
#include <stdlib.h>	//per free

int main(void)
{
	
	int n=7;
	int n2=4;
	int *p;
	int *p2;

	
	p=&n2;
	
	printf("Indirizzo di n: %d",&n);
	printf("\nValore di p: %d",p);		//avrò l'indirizzo
	printf("\nValoer di &*p: %d",&*p);	
	
	printf("\n**DOPO**\n");
	
	printf("Valore di n %d",n);
	printf("\nValore di *p",*p);	//avrò la variabile;
	printf("\nValore *&n %d",*&n);
	
	n2=n;
	
	n=*p;
	
	
	
	printf("\n**SCAMBIO VARIABILI**\n");
	printf("VALORE N1: %d\nVALORE N2 :%d",n,n2);
	
	free(p);


	return 0;
}
