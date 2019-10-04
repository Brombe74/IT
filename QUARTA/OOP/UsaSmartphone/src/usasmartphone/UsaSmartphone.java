
package usasmartphone;
import java.util.*;
public class UsaSmartphone {

  
    public static void main(String[] args) 
    { 
       Scanner input=new Scanner(System.in);
       Smartphone Smartphone1 =new Smartphone();
       String nomeSmartphone;
       double credito;
       int numChiamateUscita,numChiamateEntrata,scelta;
       
       System.out.println("Nome dello Smartphone vuoto: "+Smartphone1.getNomeSmartphone());
       
       System.out.println("Inserisci il nome del tuo Smartphone: ");
       nomeSmartphone=input.nextLine();
       
       do{
       System.out.println("Inserisci il tuo credito: ");
       credito=input.nextDouble();
         }while(credito<0);
       
       do{
           System.out.println("Inserisci il numero di chiamate in entrata: ");
           numChiamateEntrata=input.nextInt();
         }while(numChiamateEntrata<0);
       
       do{
           System.out.println("Inserisci il numero di chiamate in uscita: ");
           numChiamateUscita=input.nextInt();
          }while(numChiamateUscita<0);
       
       Smartphone Smartphone2 =new Smartphone(nomeSmartphone,credito,numChiamateEntrata,numChiamateUscita);
       
       System.out.println("--Dati del tuo Smartphone--");
       System.out.println("Nome Smartphone: "+Smartphone2.getNomeSmartphone()+"\nCredito residuo: "+Smartphone2.getCredito());
       System.out.println("Numero chiamate in Entrata: "+Smartphone2.getChiamateEntrata()+"\nNumero chiamate in Uscita: "+Smartphone2.getChiamateUscita());
       
       System.out.println("Vuoi effettuare o ricevere chiamate?\n [0] per nessuna delle due\n[1] per ricevere");
       System.out.println("[2] per chiamare\n[3] per entrambe");
       scelta=input.nextInt();
       
       switch (scelta)
       {
           case 0:
               break;
           case 1:
               do{
               System.out.println("Quante chiamate vuoi ricevere?");
               numChiamateEntrata=input.nextInt();
                 }while(numChiamateEntrata<0);
               Smartphone2.aggiornaChiamateEntrata(numChiamateEntrata);
               break;
           case 2:
               do
               {
                   System.out.println("Quante chiamate vuoi effettuare?");
                   numChiamateUscita=input.nextInt();
               }while(numChiamateUscita<0);
               Smartphone2.aggiornaChiamateUscita(numChiamateUscita);
               break;
           case 3:    
                do{
               System.out.println("Quante chiamate vuoi ricevere?");
               numChiamateEntrata=input.nextInt();
                 }while(numChiamateEntrata<0);
               Smartphone2.aggiornaChiamateEntrata(numChiamateEntrata);
               
               do
               {
               System.out.println("Quante chiamate vuoi effettuare?");
                numChiamateUscita=input.nextInt();
               }while(numChiamateUscita<0);
               Smartphone2.aggiornaChiamateUscita(numChiamateUscita);
               break;
           default:
               System.out.println("Scelta non disponibile");
       }
       System.out.println("--Dati del tuo Smartphone--");
       System.out.println("Nome Smartphone: "+Smartphone2.getNomeSmartphone()+"\nCredito residuo: "+Smartphone2.getCredito());
       System.out.println("Numero chiamate in Entrata: "+Smartphone2.getChiamateEntrata()+"\nNumero chiamate in Uscita: "+Smartphone2.getChiamateUscita());
    }
    
}
