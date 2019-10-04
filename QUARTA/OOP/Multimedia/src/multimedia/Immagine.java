
package multimedia;
import java.util.*;

public final class Immagine extends ElementoMultimediale
{
    Scanner input=new Scanner(System.in);
    
    protected int luminosita;
    
    public int getLuminosita()
    {
        return this.luminosita;
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
    
    public String Show()
    {
        String stringa="";
        
        stringa=stringa+"Titolo:"+this.titolo+"Luminosita:"+this.luminosita;
        
        return stringa;
        
    }         
            
}
