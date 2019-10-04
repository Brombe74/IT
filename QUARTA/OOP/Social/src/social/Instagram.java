
package social;
import java.util.*;

public final class Instagram extends Social_Network
{
    private String[] Storie;
    
    private final int max_storie=6; //costante per numero massimo di storie da inserire
    
    Scanner input=new Scanner(System.in);
    
    public Instagram()
    {
        //costruttore vuoto
    }
    public String[] getStorie()
    {
        return this.Storie;
    }
    
    public void setStorie(String[] storie)
    {
        this.Storie=storie;
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
