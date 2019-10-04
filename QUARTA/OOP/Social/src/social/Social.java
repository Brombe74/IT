
package social;
import java.util.*;

public class Social {

    
    public static void main(String[] args) 
    {
        char scelta;
        String nome,telefono,password;
        String[] foto,storie;
        int followers,amici=0;              //parte dichiarativa
        
        String twitt;
        
        Scanner input=new Scanner(System.in);
        
        System.out.println("In che social vuoi entrare?\n [F] per Facebook"
                + "[I] per Instagram [T] per Twitter");
        scelta=input.nextLine().charAt(0);
        
        switch (scelta)
        {
            case 'F':
                case 'f':
                    
                    Facebook utentef= new Facebook();
                    
                    nome=utentef.inseriscinome();
                    utentef.setnome(nome);
                    
                    password=utentef.inseriscipasswoed();
                    utentef.setpassword(password);
                    
                    telefono=utentef.inseriscitelefono();
                    utentef.setTelefono(telefono);
                    
                    foto=utentef.inseriscifoto();
                    
                    storie=utentef.Inseriscistorie();
                    
                    utentef.visualizzaStorie();
                    
                   amici=utentef.aggiungi_amici(amici);
                    utentef.setamici(amici);
                    
                    break;
                    
            case 'I':
                case 'i':
                     Instagram utentei= new Instagram();
                    
                    nome=utentei.inseriscinome();
                    utentei.setnome(nome);
                    
                    password=utentei.inseriscipasswoed();
                    utentei.setpassword(password);
                    
                    telefono=utentei.inseriscitelefono();
                    utentei.setTelefono(telefono);
                    
                    foto=utentei.inseriscifoto();
                    
                    storie=utentei.Inseriscistorie();
                    
                    utentei.visualizzaStorie();
                    break;   
                    
            case 'T':
                case 't':
                    
                    Twitter utentet= new Twitter();
                    
                    nome=utentet.inseriscinome();
                    utentet.setnome(nome);
                    
                    password=utentet.inseriscipasswoed();
                    utentet.setpassword(password);
                    
                    telefono=utentet.inseriscitelefono();
                    utentet.setTelefono(telefono);
                    
                    foto=utentet.inseriscifoto();
                   
                    twitt=utentet.twitta();
                    System.out.println(twitt);
                    
                    followers=utentet.Inseriscifollowers();
                    
                    break;
                    
                default:
                    System.out.println("ERRORE");
                    break;
        }    
        
    }
    
}
