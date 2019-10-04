
package social;
import java.util.*;


public final class Twitter extends Social_Network
{
    private int followers;
    
    private final int max_followers=1000;   //costante per il nmax di followers
    
    Scanner input=new Scanner(System.in);
    
    public Twitter()
    {
        //costruttore vuoto
    }
    
    public int getfollowers()
    {
        return this.followers;
    }
    
    public void setfollowers(int followers)
    {
        this.followers=followers;
    }
    
    public int Inseriscifollowers()
    {
        int f;
        
        do
        {
            System.out.println("Quanti followers hai?");
            f=input.nextInt();
        }while(f<0 || f>max_followers);
        
        return f;
    }
    
    public String twitta()    //metodo che funziona come un normale post
    {
        String twitt;       //si arriverà qua tramite scelta dell'utente
                            //cosa scriverà verrà stampata nel main
        
        System.out.println("Inserisci cosa twittare");
        twitt=input.nextLine();
        
        return twitt;
    }        
}
