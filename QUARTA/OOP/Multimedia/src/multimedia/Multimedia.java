
package multimedia;
import java.util.*;

public class Multimedia {

    
    public static void main(String[] args) 
    {
        Scanner input=new Scanner(System.in);
        
        char scelta;
        int lum,vol,durat,aumento,diminuzione;
        String titolo,ritorno;
        
        
        System.out.println("Cosa vuoi fare?\n[f] per filmato  [a] per audio  [i] per immagine");
        scelta=input.nextLine().charAt(0);
        
        switch (scelta)
        {
            case 'f':
                case 'F':
                    Filmato film= new Filmato();
                    

                    titolo=film.InserimentoTitolo();
                    film.setTitolo(titolo);
                      
                    lum=film.controlloLuminosita();
                    film.setLuminosita(lum);
                    
                    
                    vol=film.controlloVolume();
                    film.setVolume(vol);
                    
                    
                    durat=film.controlloDurata();
                    film.setDurata(durat);
   
                    ritorno=film.play();
                    
                    System.out.println(ritorno);
                    break;
                    
            case 'a':
                case 'A':
                    Audio audio=new Audio();
                    
                    titolo=audio.InserimentoTitolo();
                    audio.setTitolo(titolo);
                    
                    durat=audio.controlloDurata();
                    audio.setDurata(durat);
                    
                    vol=audio.controlloVolume();
                    audio.setVolume(vol);
                      
                    ritorno=audio.play();
                    
                    System.out.println(ritorno);
                    break;
                    
                case 'i':
                    case 'I':
                       Immagine img=new Immagine();
                       
                       titolo=img.InserimentoTitolo();
                       img.setTitolo(titolo);
                       
                       lum=img.controlloLuminosita();
                       img.setLuminosita(lum);       
                       
                    
                       
                       ritorno=img.play();
                    
                       System.out.println(ritorno);
                       
                       break;
                       
                default:
                        
                        System.out.println("Scelta non consentita");
                        break;
        }        
    }
    
}
