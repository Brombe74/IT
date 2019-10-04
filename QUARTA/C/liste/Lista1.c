#include <stdio.h>
#include <stdlib.h>

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
  if(lista==NULL)
    //allocazione
    lista=malloc(sizeof(El));

  lista->valore=n;
  printf("%d",lista->valore);

  //secondo elemento
  lista->next=malloc(sizeof(El));

  lista=lista->next;
  lista->valore=n+1;
  lista->next=NULL;

  printf("\n%d",lista->valore);

return 0;

}
