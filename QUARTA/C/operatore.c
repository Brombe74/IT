#include <stdio.h>
#include <stdlib.h>

//operatore sizeof() ritorna la dimensione della variabile 


int main(void)
{
	char a;
	int s;
	float f;
	char* pa;
	int* p;
	float* pf;
	
	int A[6];
	
	struct Ar
	{
		int Vet[10];
		int a;
		char c;
	}vet;
	
	printf("Dimensione di un carattere: %d\n",sizeof(a));
	printf("Dimensione di un intero: %d\n",sizeof(s));
	printf("Dimensione di un float: %d\n",sizeof(f));
	printf("Dimensione di un puntatore a char: %d\n",sizeof(pa));
	printf("Dimensione di un puntatore a int: %d\n",sizeof(p));
	printf("Dimensione di un puntatore a float: %d\n",sizeof(pf));

	printf("Dimensione di un puntatore a char, con asterisco: %d\n",sizeof(*pa));
	
	printf("\nDimensione di un vettore: %d\n",sizeof(A));
	
	printf("\nDimensione di una struttura: %d\n",sizeof(vet));
		
	return 0;
}
