
package veicoli;
import java.util.*;

public abstract class CVeicoloAMotore
{
    Scanner input=new Scanner(System.in);
    
    protected int annoImmatricolazione;
    protected String Marca;
    protected String tipoAlimentazione;
    protected int cilindrata;
    
 public int getAnnoImm()
{
  return this.annoImmatricolazione; 
}

public void setAnnoImm(int anno)
{
    while(anno<1990)
    {
        System.out.println("--Reinserisci l'anno di immatricolazione--\n");
        anno=input.nextInt();
    }
    
    this.annoImmatricolazione=anno;
}

public String getMarca()
{
    return this.Marca;
}

public void setMarca(String m)
{
    this.Marca=m;
}


public String getTipoAlimentaz()
{
    return this.tipoAlimentazione;
}

public void setTipoAlimentaz(String alimentazione)
{
    this.tipoAlimentazione=alimentazione;
}


public int getCilindrata()
{
    return this.cilindrata;
}   

public void setCilindrata(int cilindrata)
{
    while(cilindrata<0)
    {
        System.out.println("--Reinserisci la cilindrata--\n");
        cilindrata=input.nextInt();
    }
    
    this.cilindrata=cilindrata;
}        
}
 

