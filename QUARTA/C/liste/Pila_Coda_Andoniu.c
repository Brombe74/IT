#include <stdio.h>
#include <stdlib.h>

pila* inseriscipila(pila* p,int val);
coda* inseriscicoda(coda* c,int val);

typedef struct tail coda;		//definizione pila e coda
typedef struct stack pila;

struct tail
{						//implementazione pila e coda
	int valore;
	coda* next;
};

struct stack
{
	int valore;
	pila* prev;
};

int main()
{
	coda* c=NULL;
	pila* p=NULL;
	
	int val;
	
	do
	{
		printf("Inserisci il valore nella pila: ");
		scanf("%d",&val);							//ciclo di inserimento nella pila
		
		if(val!=0)
		{
			printf("\n");
			//inseriscipila(p,val);
		}
		
	}while(val!=0);
	
	do
	{
		printf("Inserisci il valore nella coda: ");
		scanf("%d",&val);							//ciclo di inserimento nella coda
		
		if(val!=0)
		{
			printf("\n");
			//inseriscicoda(c,val);
		}
		
	}while(val!=0);
	
	return 0;
	
}

pila* inseriscipila(pila* p,int val)
{
	
}
