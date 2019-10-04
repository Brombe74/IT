
package multimedia;
import java.util.*;

public final class Filmato extends ElementoMultimediale
{
    Scanner input=new Scanner(System.in);
    
    private int volume;
    private int luminosita;
    
    
      public int getVolume() 
    {
        return this.volume;
    }
    
    public int controlloVolume()
    {
        int v=-1;
          while(v<0)
        {
            System.out.println("Inserisci di nuovo il volume:");
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
    
      public int controlloLuminosita()
    {
        int l=-1;
        while(l<0 || l>100)
        {
            System.out.println("Inserisci luminosta'");
            l=input.nextInt();
        }
        
        return l;
    }        
    public void setLuminosita(int l)
    {
        this.luminosita=l;
    }        
    
    public int brighter(int aumento)
    {
        while(aumento<0)
        {
            System.out.println("Reinserisci l'aumento");
            aumento=input.nextInt();
        }
        
        int nluminosita;
        if(this.luminosita+aumento>100)
            {
                System.out.println("La luminosita' supera il 100%, la luminosta "
                        + "verra' settata a 100 ");
                nluminosita=100;
            }
        else
            nluminosita=this.luminosita+aumento;
        
        return nluminosita;
    }       
    
    public int darker(int diminuzione)
    {
        while(diminuzione<0)
        {
            System.out.println("Reinserisci la diminuzione");
            diminuzione=input.nextInt();
        }
        
        int nluminosita;
        if(this.luminosita-diminuzione<0)
            {
                System.out.println("La luminosita' risulta minore dello 0%, "
                        + "la luminosta verra' settata a 0 ");
                this.luminosita=0;
            }
        else
            this.luminosita=this.luminosita-diminuzione;
     
        return this.luminosita;
    }
    
    public String play()
    {
        String stringa="";
        
        stringa=stringa+this.titolo+"/"+this.luminosita+"/"+this.volume;
        
        return stringa;
    }        
}
