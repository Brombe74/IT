
package ereditarietà;
import java.util.*;

public class Professore extends Persona
{
    private String istituto_ap;
    private int stipendio;
    private String[] materie_gestite;
    
    public Professore()
    {
    
    }
    
    public int Controllostipendio(int stipendio)
    {
      Scanner input= new Scanner(System.in);
      int nstipendio=0;
      
      while(stipendio<=0)
      {
          System.out.println("Reinserisci lo stipendio");
          nstipendio=input.nextInt();
      }
      
      return nstipendio;
    }
    
    public void SetStipendio(int stipendio)
    {
        stipendio=Controllostipendio(stipendio);
        this.stipendio=stipendio;
    }
    
     public void Setistituto(String istituto)
    {
        this.istituto_ap=istituto;
    }
     
     public String[] materie_ges(int materie)
     {
         Scanner input= new Scanner(System.in);
         
         int c;
         String[] Materie_gestite =new String[materie-1] ;
         
         for(c=0;c<materie;c++)
         {
             System.out.println("Inserisci la materia: ");
             Materie_gestite[c]=input.nextLine();
         }
         
         return Materie_gestite;
     }
     
      public void Setmaterie(int materie)
    {   String[] materie_gestite;
        materie_gestite=materie_ges(materie);
        this.materie_gestite=materie_gestite;
    } 

    public int GetStipendio()
    {
        return this.stipendio;
    }
    
    public String GetIstituto()
    {
        return this.istituto_ap;
    }
    
    public String[] GetMaterie()
    {
        return this.materie_gestite;
    }
}