
package veicoli;

import java.util.*;


public final class CFurgone extends CVeicoloAMotore
{
    Scanner input=new Scanner(System.in);
    
    protected int capacitaCarico;
    
    public int getCapacita()
    {
        return this.capacitaCarico;
    }
    
    public void setCapacita(int p)
    {
        while(p<=0)
        {
            System.out.println("Reinserisci la capacita' di carico");
            p=input.nextInt();
        }
        
        this.capacitaCarico=p;
    }
    
    public String toString()
    {
        String stringa="";
        
        stringa=stringa+this.capacitaCarico;
        
        return stringa;
        
    }        
}
