#include <stdio.h>
#include <stdlib.h>


typedef struct list lista;
struct list
{
	int numero;
	lista* next;
	lista* prev;
}; 

lista* InserimentoCoda(lista* l1,int n);
lista* creanodo(int n);
void StampaLista(lista* l1);
void StampaScorso(lista* l1,int pos);
void EliminaNodo(lista* del, lista* l1);

int main()
{
	lista *l1,*del;
	l1=NULL;
	del=NULL;
	
	int n/*,pos*/;
	
	do
	{
		printf("\nInserisci un valore: ");
		scanf("%d",&n);
		
		if(n!=-1)
		{
		 	l1=InserimentoCoda(l1,n);
		}
		
	}while(n!=-1);
	
	StampaLista(l1);
	/*
	do
	{
		printf("\nInserisci la posizione della lista, la quale vuoi vedere il suo valore precedente: ");
		scanf("%d",&pos);
	}while(pos<=0);
	
	StampaScorso(l1,pos);
	*/
	
	del=l1->next->next->next; // quarto nodo
	EliminaNodo(del,l1);
	
	StampaLista(l1);
	
	return 0;
}

lista* creanodo(int n)	//creazione nuovo nodo
{
	lista* nodo=NULL;	
	
	nodo=(lista*)malloc(sizeof(lista));	//allocazione
	
	if(nodo==NULL)
	{				//gestione errore
		printf("Errore nella creazione del nodo");
		return NULL;    
	}
	
	nodo->numero=n;	//assegnazione del valore
	nodo->next=NULL;
	
	return nodo;
}

lista* InserimentoCoda(lista* l1,int n)
{
	lista* testa=NULL;
	lista* coda=NULL;
	
	testa=l1;	//mi salvo la testa
	
	coda=creanodo(n); //creazione di un nuovo nodo
	
	if(l1==NULL)
	{				//se la lista passata è vuota
					//la coda è la testa
		return coda;
	}
	
	while(l1->next!=NULL)
	{	
		l1->next->prev=l1;				//scorrimento lista fino al penultimo elemento
		l1=l1->next;
		
	}
	l1->next=coda;		//aggiungo il nodo alla lista	
    
    
    return testa;
}

void StampaLista(lista* l1)
{
	if(l1==NULL)
	{
		printf("\nLISTA VUOTA");
		return;
	}
	
	while(l1!=NULL)
	{
		printf("%d",l1->numero);
		if(l1->next!=NULL)
		{
			printf("/"); //stampa di separazione
		}
		l1=l1->next;
	}
	
}

void StampaScorso(lista* l1,int pos)
{
	int c=1;
	while(l1!=NULL)
	{
		
		if(pos==c)
		{
			if(l1->prev==NULL)
			{
				printf("\nNON HO UN VALORE PRECEDENTE");		//gestione prima pos
				exit(0);
			}
			
			if(l1->next==NULL)
			{
				printf("\nNON HO UN VALORE SUCCESSIVO");		//gestione ultima pos
				exit(0);
			}	
			
			else if(l1->prev!=NULL)	//condizione messa per "o entra o entra"
			{
				printf("\nValore precedente:%d",l1->prev->numero);
				exit(0);
			}			
		}
		
		else
			{
				c++;
				l1=l1->next;
			}	
	}
}

void EliminaNodo(lista* del, lista* l1)
{
	del->prev->next=del->next;
	
	del->next->prev=del->prev;
	
	free(del);
}
