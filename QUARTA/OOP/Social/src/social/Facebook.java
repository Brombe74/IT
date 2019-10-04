
package social;
import java.util.*;

public final class Facebook extends Social_Network
{
    private int amici;  //attributi
    private String[] Storie;
    
    private final int max_storie=6; //costante per numero massimo di storie da inserire
    private final int max_amici=30; //costante per numero massimo di amici 
    
    Scanner input=new Scanner(System.in);
    
    public Facebook()
    {
        //costruttore vuoto
    }
    
    //*METODI GET*
    
    public int getamici()
    {
        return this.amici;
    }
    
    public String[] getStorie()
    {
        return this.Storie;
    }
    
    //*METODI SET*
    
    public void setamici(int amici)
    {
        this.amici=amici;
    }
    
    public void setStorie(String[] storie)
    {
        this.Storie=storie;
    }
    
    //*METODI VARI*
    
    public int aggiungi_amici(int amici)
    {
        int n;//variabile ausiliaria
        
        System.out.println("--Vuoi aggiungere o togliere amici?\n[0] togli [1] aggoingi--");
        n=input.nextInt();
        
        if(n==1)
            {
                do
                {
                    System.out.println("Quanti amici vuoi aggiungere?");
                    n=input.nextInt();
                }
                while(n<=0 || n+amici>max_amici);
                
                amici=amici+n;
            }
        
        else if(n==0)
        {
                do
                {
                    System.out.println("Quanti amici vuoi togliere?");
                    n=input.nextInt();
                }
                while(n<=0 || amici-n<0);
                
                amici=amici-n;
        }
        
        return amici;
    } 
    
    public String[] Inseriscistorie()
    {
        int num_storie,i;
         
         do
         {
             System.out.println("--Quante storie vuoi mettere?");
             num_storie=input.nextInt();
         }
         while(num_storie<0 || num_storie>max_storie);    
         
         String[] storie=new String[num_storie];
         
         for(i=0;i<num_storie;i++)
         {  //ciclo per inserimento delle foto
             do
             {System.out.println("--Inserisci il titolo della storia in "+i+1 +"a posizione");
             storie[i]=input.nextLine();  //ciclo interno per il controllo di possibili invii
             }
             while(storie[i].isEmpty());
         }
         
         return storie;
     }
    
    public void visualizzaStorie()
    {
        int n_storia,i;
        
        do
        {    
            System.out.println("Quale storia vuoi visualizzare?");
            n_storia=input.nextInt();
        }while(n_storia<0 ||n_storia>max_storie);
        
        for(i=0;i<this.Storie.length;i++)
            {
                if(i==n_storia)
                    {
                        System.out.println("Ecco la tua storia\n --"+this.Storie[i]+"--");
                    }
            }
    }

}
