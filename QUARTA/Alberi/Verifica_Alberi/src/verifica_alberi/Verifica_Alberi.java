
package verifica_alberi;


public class Verifica_Alberi 
{
    public static void main(String[] args)
    {
        int conta=0;
        
        albero a=new albero();
        albero b=new albero();
        
        b=a;
        
        a.addFiglioDx(1,1);
        a.Stampa_Pre(a.ptr);       //stampe di debug
        System.out.println();
        
        a.addFiglioDx(1,2);
        a.Stampa_Pre(a.ptr);
        System.out.println();
        
        a.addFiglioDx(2,1);
        a.Stampa_Pre(a.ptr);
        System.out.println();
        
        a.addFiglioSx(1,2);
        a.Stampa_Pre(a.ptr);  
        System.out.println();
        
        a.addFiglioSx(2,3);
        a.Stampa_Pre(a.ptr);
        System.out.println();
  
        a.addFiglioDx(3,2);
        a.Stampa_Pre(a.ptr);
        System.out.println();
        
        
        System.out.println("STAMPA PRE-ORDER");
        a.Stampa_Pre(a.ptr);
        System.out.println("\nSTAMPA IN-ORDER");
        a.Stampa_In(a.ptr);
        System.out.println("\nSTAMPA POST-ORDER");
        a.Stampa_Post(a.ptr);
        
        b.addFiglioDx(2,5);
        
        conta=a.cercaconta(b.getptr(),2,conta);
        
        System.out.println("\n2 Trovato:"+conta+" volte");
        
        boolean controllo=a.StessaStruttura(a.getptr(),b.getptr());
        
        System.out.println(controllo);
    }
}    

