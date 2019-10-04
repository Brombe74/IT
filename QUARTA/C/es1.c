
#include <stdio.h>
#include <stdlib.h>	//per free

int main(void)
{
	int n1=456;
	
	int *p ;

	p=&n1;
	
	printf("HEHEH %p",p);

	free(p);	//ultima istruzione
	
	return 0;
}
