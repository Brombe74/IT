
package multimedia;
import java.util.*;

public final class Audio extends ElementoMultimediale
{
    Scanner input=new Scanner(System.in);
    
    protected int volume;

    
    public int getVolume() 
    {
        return this.volume;
    }
    
    public int controlloVolume()
    {
        int v=-1;
          while(v<0)
        {
            System.out.println("Inserisci il volume:");
            v=input.nextInt();
        }   
          
          return v;
    }        
    
    public void setVolume(int v)
    {
        this.volume=v;   
    }  
    
    public int louder(int v)
    {
        while(v<0)
        {
            System.out.println("Reinserisci la variazione di volume:");
            v=input.nextInt();
        }
        
        if(this.volume+v>100)
        {
            System.out.println("Il volume supera il 100%, il volume verra' settato a 100");
            this.volume=100;
        }
        
        else   
            this.volume=this.volume+v;
        
        
        return this.volume;
    }       
    
    public int weaker(int v)
    {
        while(v<0)
        {
            System.out.println("Reinserisci la variazione di volume:");
            v=input.nextInt();
        }
        
        if(this.volume-v<0)
        {
            System.out.println("Il volume e' minore di 0, il volume verra' settato a 0");
            this.volume=0;
        }
        
        else   
            this.volume=this.volume-v;
        
        
        return this.volume;
    }    
    
    
    @Override 
    public String play()
    {
        String stringa="";
        
        stringa=stringa+this.titolo+"/"+this.volume;
        
        return stringa;
    }        
    
}
