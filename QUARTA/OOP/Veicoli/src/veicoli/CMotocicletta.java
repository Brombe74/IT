
package veicoli;

import java.util.*;


public final class CMotocicletta extends CVeicoloAMotore
{
    Scanner input=new Scanner(System.in);
    
    protected String Tipologia;
    protected int numTempiMotore;
    
    public String getTipologia()
    {
        return this.Tipologia;
    }
    
    public void setTipologia(String t)
    {
        this.Tipologia=t;
    }
    
    
      public int getTempiMotore()
    {
        return this.numTempiMotore;
    }
    
    public void setnumTempiMotore(int t)
    {
        while(t<=0 || t>10)
        {
            System.out.println("Reinserisci i tempi del motore");
            t=input.nextInt();
        } 
        this.numTempiMotore=t;
    }
    
    public String toString()
    {
        String stringa="";
        
        stringa=stringa+this.Tipologia+"/"+this.numTempiMotore;
        
        return stringa;
    }        
}
