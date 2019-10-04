#include <stdio.h>
#include <stdlib.h>

void Nuovo_nodo(El* lista,int n);

typedef struct EL El;

struct EL
{
  int valore;
  El* next;
};

int main()
{
  int n;
  El* lista;

  lista=NULL;
  //fa inserire un numero
  n=35;

  int i;

  for(i=0;i<5;i++)
  {
    printf("\nInserisci il numero nella lista:", );
    scanf("%d",&n );

    Nuovo_nodo(lista,n);
  }



return 0;

}

void Nuovo_nodo(El* lista,int n)
{
  if(lista==NULL)
    {
        lista=malloc(sizeof(El));
        lista->valore=n;
        printf("\n%d",lista->valore );
        lista->next=NULL;
    }
  else
    Nuovo_nodo(lista->next,n);
}
