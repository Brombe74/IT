#include <stdio.h>
#include <stdlib.h>
#include <malloc.h>
#include <unistd.h>
#define Max 20

	typedef struct stud
	{
		char Cognome[Max];
		char Nome[Max];

		int corso;
		int voto;
		int anni_isc;
	}studente;


  void riempivettore(studente* studenti,int n_studenti)
  {
	  int i;

	  for(i=0;i<n_studenti;i++)
	  {
		  printf("\nInserisci il cognome dello studente: ");
		  scanf("%s",(studenti+i)->Cognome);

		  printf("Inserisci il nome dello studente: ");
		  scanf("%s",(studenti+i)->Nome);

		 do
		  {
		  printf("Inserisci in che corso e' lo studente:");
		  scanf("%d",&(studenti+i)->corso);
		  }while((studenti+i)->corso<=0);

		  do
		  {
		  printf("Inserisci il voto dello studente:");
		  scanf("%d",&(studenti+i)->voto);
		  }while((studenti+i)->voto<0);

		  do
		  {
		  printf("Inserisci gli anni di iscrizione dello studente:");
		  scanf("%d",&(studenti+i)->anni_isc);
		  }while((studenti+i)->anni_isc<=0);


	  }
  }

  void stampa(studente* studenti,int n_studenti)
  {
	  int i;

	  for(i=0;i<n_studenti;i++)
	  {
		  printf("\n***Studente %d***\nCognome: %s\nNome: %s"
		  "\nCorso: %d\nVoto:"
		  " %d\nAnni iscrizione: %d\n",i+1,(studenti+i)->Cognome,(studenti+i)->Nome,(studenti+i)->corso,(studenti+i)->voto,(studenti+i)->anni_isc);
	  }
  }


  int studenti_merit(studente* studenti,int n_studenti,int voto,int anni_isc)
  {
	  int merit,i;

	  for(i=0;i<n_studenti;i++)
	  {
		  if((studenti+i)->voto>=0 && (studenti+i)->anni_isc==anni_isc)
		  {
			  merit++;
			  printf("\n**Studente Meritevole %d**\nCognome: %s\nNome: %s",merit,(studenti+i)->Cognome,(studenti+i)->Nome);
		  }
	  }

	 return merit;

  }

  int main()
  {

  	studente* studenti;


  	int n_studenti;

  	int soglia_v,soglia_ann;

  	int studenti_meritevoli;


  	do
	{
  	printf("Inserisci Il numero di studenti: ");
  	scanf("%d",&n_studenti);
    }while(n_studenti<=0);

    studenti=(studente*)malloc(n_studenti*sizeof(studente));


    riempivettore(studenti,n_studenti);
	 stampa(studenti,n_studenti);

	do
	{
		printf("\nInserisci la soglia di voti:");
		scanf("%d",&soglia_v);
	}while(soglia_v<0);

	do
	{
		printf("\nInserisci gli anni di iscrizione:");
		scanf("%d",&soglia_ann);
	}while(soglia_ann<=0);

	studenti_meritevoli=studenti_merit(studenti,n_studenti,soglia_v,soglia_ann);

	printf("\nSono stati trovati %d studenti meritevoli",studenti_meritevoli);
	
	

    free(studenti);
  	return 0;

  }
