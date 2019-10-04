
package veicoli;
import java.util.*;

public final class CAutomobile extends CVeicoloAMotore
{
    Scanner input=new Scanner(System.in);
    
    protected int numPorte;
    
    
    public int getNumPorte()
    {
        return this.numPorte;
    }
    
    public void setNumPorte(int p)
    {
        while(p<2 || p>4 || p==3)
        {
            System.out.println("Reinserisci il numero di porte");
            p=input.nextInt();
        }
        this.numPorte=p;
    }
    
    public String toString()
    {
        String stringa="";
        
        stringa=stringa+this.numPorte;
        
        return stringa;
    }
}
