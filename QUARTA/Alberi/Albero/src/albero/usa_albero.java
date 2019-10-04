
package albero;

public class usa_albero {

   
    public static void main(String[] args)
    {
        albero a=new albero();
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
        
        a.addFiglioDx(2,3);
        a.Stampa_Pre(a.ptr);
        System.out.println();
        
        /*
                    A
                   / \
                 B    F  
                /      \
              C         H 
             / 
           D
            \
             E 
        */        
        
        System.out.println("STAMPA PRE-ORDER");
        a.Stampa_Pre(a.ptr);
        System.out.println("\nSTAMPA IN-ORDER");
        a.Stampa_In(a.ptr);
        System.out.println("\nSTAMPA POST-ORDER");
        a.Stampa_Post(a.ptr);
        
    }    
}
