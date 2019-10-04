
package social;
import java.util.*;

public abstract class Social_Network implements Interfaccia
{
    private String nome;
    private String telefono;
    private String password;
    private String[] foto;      //attributi
    private boolean disattivato ;
    private boolean sospeso;
    
    Scanner input=new Scanner(System.in);   //scanner per poter lavorare nei metodi
   
    //*METODI GET*
    
    public String getnome()
    {
        return this.nome;
    }        
    
    public String get_telefono()
    {
        return this.telefono;
    }    
    
    public String getpassword()
    {
        return this.password;
    }    
    
    public String[] getfoto()
    {
        return this.foto;
    }

    public boolean getdisattivato()
    {
        return this.disattivato;
    }

    public boolean getsospeso()
    {
        return this.sospeso;
    }
    
    //*METODI SET*
    
    public void setnome(String nome)
    {
        this.nome=nome;
    }  
    
    public void setTelefono(String telefono)
    {
        this.telefono=telefono;
    }  
    
    public void setpassword(String password)
    {
        this.password=password;
    }  
    
    public void setfoto(String[] foto)
    {
        this.foto=foto;
    }
    
    public void setdisattivato(boolean disattivato)
    {
        this.disattivato=disattivato;
    }  
    
    public void setsospeso(boolean sospeso)
    {
        this.sospeso=sospeso;
    }  
    
    //*METODI DI INSERIMENTO DATI
    
    public String inseriscinome()
    {
        String nome;
        
        do
        {
         System.out.println("--Inserisci il nome utente--");
         nome=input.nextLine();
        }
        while(nome.isEmpty());
        
        return nome;
    }
    
     public String inseriscipasswoed()
     {
         String password;
         
        do
        {
         System.out.println("--Inserisci la password--");
         password=input.nextLine();
        }
        while(password.isEmpty());
         
        return password;
     }  
     
     public String inseriscitelefono()
     {
         String telefono;
         
        do
        {
         System.out.println("--Inserisci il tuo numero di telefono--");
         telefono=input.nextLine();
        }
        while(telefono.isEmpty());
         
        return telefono;
     }
     
     public String[] inseriscifoto()
     {
         int num_foto,i;
         
         do
         {
             System.out.println("--Quante foto vuoi postare?");
             num_foto=input.nextInt();
         }
         while(num_foto<0 || num_foto>maxFoto);    
         
         String[] foto=new String[num_foto];
         
         for(i=0;i<num_foto;i++)
         {  //ciclo per inserimento delle foto
             do
             {System.out.println("--Inserisci il titolo della foto in "+i+1 +"a posizione");
             foto[i]=input.nextLine();  //ciclo interno per il controllo di possibili invii
             }
             while(foto[i].isEmpty());
         }
         
         return foto;
     }
     
     
     //*METODI DI DISATTIVAZIONE ACCOUNT*
     public boolean disattiva_account()
     {
         boolean d=true;//variabile per disattivare l'account
                        //già messa a true in quanto l'account viene attualmente usato
         int scelta;
         
         System.out.println("--Vuoi disattivare l'account?\n[1] si [0] no");
         scelta=input.nextInt();
         
         if(scelta==1)
            { 
             d=false;
             System.out.println("--Attenzione account disattivato--");
            }
         
         else if(scelta==0)
            { 
             System.out.println("--Puoi usare ancora il tuo account--");
            }
         
         else 
             System.out.println("Impossibile eseguire l'operazione scelta");
             
         return d;
     }
     
     public boolean sospendi_account()
     {
         return false;
     }        
             
}
