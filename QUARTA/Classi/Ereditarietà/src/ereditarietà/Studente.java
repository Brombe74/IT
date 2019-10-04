
package ereditarietà;
import java.util.*;

public class Studente extends Persona
{
    private int Matricola;
    private int classe;
    private String Indirizzo;
    private boolean frequenza;
    
    Scanner input=new Scanner(System.in);
    
    public Studente()
    {
        
    }        
    
   public int controlloMat(int matricola)
   {
     
       int nmatricola=0;
       
       while(matricola>1000 || matricola<=0)
       {
           System.out.println("Inserisci la matricola:");
           nmatricola=input.nextInt();
       }
       
       return nmatricola;
   }        
    
   public void SetMatricola(int matricola)
   {
       
       this.Matricola=controlloMat(matricola);
   }
   
     public int controlloClass(int classe)
   {
     
       int nclasse=0;
       
       while(classe>5|| classe<0)
       {
           System.out.println("Inserisci la classe:");
           nclasse=input.nextInt();
       }
       
       return nclasse;
   }   
     
      public void SetClasse(int classe)
   {
       
       this.Matricola=controlloClass(classe);
   }
}
