
package lampadina_andoniu;
import java.util.*;

public class Lampadina_Andoniu {

    
    public static void main(String[] args) 
    {
       Scanner input=new Scanner(System.in);
       int colore,lmax,stato,scelta,nuovostato,varlum;
       String nuovocolore,sintesi;
       
       do
       {
       System.out.println("Inserisci il colore della lampadina\n [1]bianco [2]rosso [3]blu [4]giallo");
       colore=input.nextInt();
       }while(colore<1 || colore>4);
       
       do
       {
       System.out.println("Inserisci la luminostà massima della lampadina");
       lmax=input.nextInt();
       }while(lmax<1);
       
       do
       {
       System.out.println("La lampadina la vuoi accesa o spenta?\n [0] accesa [1]spenta");
       stato=input.nextInt();
       }while(stato!=0 && stato!=1);
       
       Lampadina lampadina=new Lampadina(colore,lmax);
       
       System.out.println("Vuoi accendere o spegnere la lampadina?\n[0] per spegnerla [1] per accenderla");
       scelta=input.nextInt();
      
       switch (scelta)
       {
           case 0:
               nuovostato=lampadina.lightoff();
               if(nuovostato==-1)
                   System.out.println("La lampadina è già spenta");
               else 
                   System.out.println("Lampadina spenta");
               break;
           case 1:
               nuovostato=lampadina.lighton();
               if(nuovostato==-1)
                   System.out.println("La lampadina è già accesa");
               else 
                   System.out.println("Lampadina accesa");
               break;
           default:
               System.out.println("Scelta non consentita");
       }
              
      System.out.println("Inserisci il nuovo colore della lampadina");
      scelta=input.nextInt();
      lampadina.setcolore(scelta);
      nuovocolore=lampadina.getcolore();
      
      System.out.println("Colore attuale della lampadina:"+nuovocolore);
      
      System.out.println("Insersci la variazione di luminosità");
      varlum=input.nextInt();
      
      varlum=lampadina.varLum(stato, varlum);
      
      System.out.println("La luminosità attuale:"+varlum);
      
      sintesi=lampadina.toString();
      
      System.out.print("Sintesi della lampadina "+sintesi);
    }
    
}
