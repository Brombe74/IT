
package animale;
import java.util.*;


public abstract class Animale 
{
    Scanner input=new Scanner(System.in);
    
    protected String specie;
    protected int n_zampe;
    protected String colore;
    protected String nutrimento;
    
    public String InserisciSpecie()
    {
        String specie;
        do
        {
            System.out.println("Inserisci la specie");
            specie=input.nextLine();
        }
        while(specie.isEmpty());
        
        return specie;
    }
    
    public void setSpecie(String specie)
    {
        this.specie=specie;
    }
    
    public String getSpecie()
    {
        return this.specie;
    }        
    
    public int Inseriscizampe()
    {
        int n_zampe;
        
        do
        {
            System.out.println("Inserisci le zampe dell'animale");
            n_zampe=input.nextInt();
        }while(n_zampe<=0);   
        
        return n_zampe;
    }    
    
    public void setZampe(int n_zampe)
    {
        this.n_zampe=n_zampe;
    }
    
    public int getzampe()
    {
        return this.n_zampe;
    }      
}
