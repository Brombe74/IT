
package multimedia;
import java.util.*;

public abstract class ElementoMultimediale //implements Interfaccia
{
    Scanner input=new Scanner(System.in);
    
    protected String titolo=" ";
    protected int durata;
    
    
    public void setTitolo(String t)
    {
        this.titolo=t;
    }  
    
      public String getTitolo()
    {
        return this.titolo;
    }  
    
    public int controlloDurata()
    {
        int d=0;
        
        while(d<=0)
        {
            System.out.println("Inserisci la durata");
            d=input.nextInt();
        }
        
        return d;
    }        
      
    public void setDurata(int d)
    {
        this.durata=d;
    }  
    
    public int getDurata()
    {
        return this.durata;
    }
    
    public String InserimentoTitolo()
    {
        String t;
        System.out.println("Inserisci titolo:");
        t=input.nextLine();

    return t;
    
    }     
    
    public String play()
    {
        return this.titolo;
    }        
}
