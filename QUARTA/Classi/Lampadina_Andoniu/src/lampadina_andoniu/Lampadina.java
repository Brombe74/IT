package lampadina_andoniu;
import java.util.*;


public class Lampadina
{
    private int colorelampadina;
    private int livelloluminosità;
    private int statolampadina;
    
        public Lampadina(int colore,int lmax)
        {
            this.colorelampadina=colore;
            this.livelloluminosità=lmax;
                    
        }
   public int varLum(int stato,int variazione)
   {
       int nuovaluminosità;
       
       if(stato==1)
            nuovaluminosità=this.livelloluminosità+variazione;
       else 
            return 0;
       
       if(nuovaluminosità<0)
           nuovaluminosità=0;
       else if(nuovaluminosità>this.livelloluminosità)
           nuovaluminosità=this.livelloluminosità;
       
       return nuovaluminosità;
   }
   
   public int lighton()
   {
       if(this.statolampadina==0)
           this.statolampadina=1;
       else 
           return -1;
       
       return this.statolampadina;
       
   }
   
    public int lightoff()
   {
       if(this.statolampadina==1)
           this.statolampadina=0;
       else 
           return -1;
       
       return this.statolampadina;
       
   }
    public String getcolore()
    {
        String stringa="";
        if(this.colorelampadina==1)
            stringa="bianco";
        else if(this.colorelampadina==2)
            stringa="rosso";
        else if(this.colorelampadina==3)
            stringa="blu";
        else if(this.colorelampadina==4)
            stringa="giallo";
        
        return stringa;
    }
    
    public int getluminosità()
    {
        return this.livelloluminosità;
    }
    
    public void setcolore(int nuovocolore)
    {
        if(nuovocolore>4)
            nuovocolore=4;
        else if(nuovocolore<1)
            nuovocolore=1;
        
        this.colorelampadina=nuovocolore;
        
    }
    
    public String toString()
    {
        String colore="",luminosità,stato="",sintesi;
        
        if(this.colorelampadina==1)
            colore="bianco";
        else if(this.colorelampadina==2)
            colore="rosso";
        else if(this.colorelampadina==3)
            colore="blu";
        else if(this.colorelampadina==4)
            colore="giallo";
        luminosità=String.valueOf(this.livelloluminosità);
        
        if(this.statolampadina==1)
            stato="accesa";
        else if(this.statolampadina==0)
            stato="spenta";
        
       return  sintesi=colore+";"+luminosità+";"+stato;
    }
}
