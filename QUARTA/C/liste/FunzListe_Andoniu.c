/*
Andoniu Daniel
4AI

funzione inserimento elemento nella lista in coda e in testa
"""      stampa
"""      mega free
"""      rimozione nodo
"""      calcolo lunghezza
"""      controllo se vuoto
*/
#include <stdio.h>
#include <stdlib.h>


typedef struct train Treno;
struct train
{
  int vagone;
  Treno* next;
};

Treno* Inserimentoric(Treno* lista,int n);
Treno* InserimentoCoda(Treno* lista,int n);
void StampaLista(Treno* lista);

int main()
{
 //char scelta;

/* printf("Inserisci la tua scelta\n[C] per creare la lista"
" \n[I] per inserire i valori\n[L] per determinare la lunghezza\n"
 "[S] per sapere se la lista è vuota\n[P] per stampare la lista\n"
 "[F] per cercare un valore nella lista\n[E] per eliminare l'ultimo elemento\n"
 "[D]per eliminare certi valori\n");
 scanf("%c",&scelta);

switch (scelta)
 {
   case 'C':
      case 'c':
        printf("bfdhbfh\n");
            break;

    case 'I':
      case 'i':
        printf("bfdhbfh\n");
            break;


    case 'L':
      case 'l':
        printf("bfdhbfh\n");
            break;

    case 'S':
      case 's':
        printf("bfdhbfh\n");
            break;

    case 'P':
      case 'p':
        printf("bfdhbfh\n");
            break;

    case 'F':
      case 'f':
        printf("bfdhbfh\n");
            break;

    case 'E':
      case 'e':
        printf("bfdhbfh\n");
            break;

    case 'D':
      case 'd':
        printf("bfdhbfh\n");
            break;

    default:
      printf("ERRORE");
            break;


 }*/
Treno* lista=NULL;
Treno* temp=NULL;
int flag=1;
 int n;

 do
 {
   printf("Inserisci il valore nella lista: ");
   scanf("%d",&n);
   if(n!=0)
	{	/*
		
		*/	
		if(flag==1)
		{
			flag=0;
			temp=lista;
		}
		lista=Inserimentoric(lista,n);
	}	
 } while(n!=0);


   StampaLista(temp);	
   
  return 0;
}

Treno* InserimentoCoda(Treno* lista,int n)
{
	//arriva all'ultimo nodo
	if(lista!=NULL)
	{
		while(lista->next!=NULL)
		{
			lista=lista->next;
		}
	}
	//crea e inizializza un nuovo nodo
	lista->next=(Treno*)malloc(sizeof(Treno)); 
	lista->next->vagone=n;
    lista->next->next=NULL;
    //collega il nodo corrente al nuovo
      
    
    return lista;
}

Treno* Inserimentoric(Treno* lista,int n)
{
	
/*partendo dall'inizio se il nodo successivo
 * non è vuoto passo al prossimo nodo 
 * partendo dal nodo iniziale
 * */
  if(lista!=NULL)		
  {					
	  return Inserimentoric(lista->next,n);
  }	
/*
 * se il prossimo nodo non esiste
 * lo creo e lo inizializzo
 * */
  else
  {  
	 lista=(Treno*)malloc(sizeof(Treno)); 
	 lista->vagone=n;
     lista->next=NULL;     
  }	

    return lista;  
}

void StampaLista(Treno* lista)
{
	while(lista!=NULL)
	{
		printf("%d  ",lista->vagone);
		lista=lista->next;
	}
}
