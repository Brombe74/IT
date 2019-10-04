#include <stdio.h>
#include <stdlib.h>



void somma(int* sum, int x, int y)
{

	
	*sum=x+y;
}


int main()
{
	int* p;
	
	int x=10;
	int y=6;
	
	//prototipo void *malloc(size_T size);
	
	p=malloc(sizeof(int));
	
	somma(p,x,y);
	
	
	printf("Valore di x:%d",x);
	printf("\nValore di y:%d",y);
	printf("\nValore del puntatore:%d",*p);
	
	free(p);
	
	return 0;

}

