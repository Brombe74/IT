#include <stdio.h>
#include <stdlib.h>

struct Node
{
	int data;
	struct Node* next;
	struct Node* prev;
};

struct Node* head; // puntatore  head node. definita globale cosi da usarla sempre

//Crea "new Node" nuovo nodo  e restituire puntatore ad esso
struct Node* GetNewNode(int x)
{
	struct Node* newNode= (struct Node*)malloc(sizeof(struct Node));
	newNode->data = x;
	newNode->prev = NULL;
	newNode->next = NULL;
	return newNode;
}

//Inserire in TESTA della lista "doubly linked list"
void InsertTESTA(int x)
{
	struct Node* newNode = GetNewNode(x);
	printf(" \n... INSERISCO %d IN TESTA  ", x);
	if(head == NULL) 
	{
		head = newNode;
		return;
	}
	head->prev = newNode;
	newNode->next = head;
	head = newNode;

}

//Inser in CODA  della " Doubly linked list"
void InsertCODA(int x) 
{
	struct Node* temp = head;
	struct Node* newNode = GetNewNode(x);
	printf(" \n... INSERISCO %d IN CODA  ", x);
	if(head == NULL)
	{
		head = newNode;
		return;
	}
	while(temp->next != NULL) temp = temp->next; // scorro il prossimo nodo...
	temp->next = newNode;
	newNode->prev = temp;
}
//funzione ricerca ricorsiva, rertituisce puntatore al nodo trovato
struct Node* Cerca(struct Node *l, int f)
{
    if ((l==NULL )||(l->data==f)) 
		return l;
    else
		Cerca(l->next,f);

}

/* Function che elimina un nodo (occorre passare *del)
   head_ref --> punta alla testa.
   del  -->  puntatore al nodo da eliminare ...... usare la cerca precedentemente*/


void deleteNode(struct Node *head, struct Node *del)
{
  /* manca un caso particolare individuarlo e completare la funzione */
  struct Node* head_ref = head;
  
  if(del==head)
  {
	  if(head->next!=NULL)
	   {
	   head=head->next;
	   head->prev=NULL;
	   
	   }
  }   
  /* cambio next  se  devo cancellare un nodo che NON e' l'ultimo */
  else
  {
  if(del->next != NULL)
    del->next->prev = del->prev;

  /* cambio prev  se  devo cancellare un nodo che NON e' il primo */
  if(del->prev != NULL)
    del->prev->next = del->next;
                
  }
  /* liberare la memopria occupata da free*/
  free(del);
  return;
}

//stampa gli elementi della lista nell'ordine inserito
void Print() 
{
	struct Node* temp = head;
	printf(" ... STAMPO LISTA ....: ");
	while(temp != NULL) 
	{
		printf("%d ",temp->data);
		temp = temp->next;
	}
	printf("\n");
}

//stampa gli elementi della lista nell'ordine inverso inserito
void StampaContrario() 
{
    printf(" ... STAMPO AL CONTRARIO ....: ");
	struct Node* temp = head;
	if(temp == NULL) return; // empty list, exit
	// successivo
	while(temp->next != NULL)
	{
		temp = temp->next;
	}
	// vado  backward utilizzando il puntatore  prev

	while(temp != NULL)
	{
		printf("%d ",temp->data);
		temp = temp->prev;
	}
	printf("\n");
}



int main() 
{

	head = NULL; // empty list. set head as NULL.

	// inserisco in testa e in coda poi faccio le stampe
	InsertCODA(1);
	Print();
	StampaContrario();
	
	
	InsertCODA(2);
	Print();
	StampaContrario();
	
	
	InsertCODA(3);
	Print();
	StampaContrario();
	
	InsertTESTA(99);
	Print();
	StampaContrario();
	
	
	InsertCODA(4);
	Print();
	StampaContrario();
	
	
	InsertTESTA(98);
	Print();
	StampaContrario();
	
	
	InsertTESTA(97);
	Print();
	StampaContrario();
	
	
	InsertCODA(6);
	Print();
	StampaContrario();
	
	
	struct Node* temp = head;
	//chiamo cerca che restituisce il puntatore al nodo da eliminare e poi chiamo la funz di elimina
	temp=Cerca(head,3);
	
	if (temp==NULL)
		printf("non ho trovato l'elemento \n");
   else
   {    printf("\n ho trovato l'elemento %d  e lo elimino ",temp->data);
	    deleteNode(head, temp);  /*delete last node*/
        //testare quale caso non � stato preso in considerazione e modificare la funzione
   }

	Print();

}
