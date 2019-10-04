
package verifica_alberi;

public class albero 
{
    public NodoAlbero ptr;
    
    public albero()
    {
        ptr=null;
    }
    
    public void addFiglioDx(int ricerca, int figlio)
    {
        NodoAlbero n=new NodoAlbero(figlio);
        if(this.ptr==null) //albero vuoto prima volta sto creando la radice
        {
            this.ptr=n;
            return; //creazione radice e termina 
        }
        
        NodoAlbero p;
        p=cerca(this.ptr,ricerca);
        
        if(p!=null)
        {
            p.setfigliodx(n);
        } 
        else
            System.out.println("non trovo nodo padre "+ ricerca );
    }
    
     public void addFiglioSx(int ricerca,int figlio)
    {
        NodoAlbero n=new NodoAlbero(figlio);
        if(this.ptr==null) //albero vuoto prima volta sto creando la radice
        {
            this.ptr=n;
            return; //creazione radice e termina 
        }
        
        NodoAlbero p;
        p=cerca(ptr,ricerca);
        
        if(p!=null)
        {
            p.setfigliosx(n);
        }        else
            System.out.println("non trovo nodo padre "+ ricerca );
    }
    
    private NodoAlbero cerca(NodoAlbero p,int ricerca)
    {
        NodoAlbero p1=null;
        
        if(p==null)
        {
            return null;
        }
        
        if(p.getinfo()==ricerca)
        {
            return p;
        }
        
        if(p.getfigliosx()!=null)
        {
            p1=cerca(p.getfigliosx(),ricerca);
        }
        
        if(p.getfigliodx()!=null)
        {
            p1=cerca(p.getfigliodx(),ricerca);
        }
        
        return p1;
    }
    
    
    public void Stampa_Pre(NodoAlbero p)
    {
        if(p==null)
        {
            return;
        }
        
        System.out.print(p.getinfo()+"/");
        
        if(p.getfigliosx()!=null)
        {
            Stampa_Pre(p.getfigliosx());
        }
        
         if(p.getfigliodx()!=null)
        {
            Stampa_Pre(p.getfigliodx());
        }        
    }
    
        public void Stampa_In(NodoAlbero p)
    {
        if(p==null)
        {
            return;
        }    
        if(p.getfigliosx()!=null)
        {
            Stampa_In(p.getfigliosx());
        }
        
        System.out.print(p.getinfo()+"/");
        
         if(p.getfigliodx()!=null)
        {
            Stampa_In(p.getfigliodx());
        }        
    }
        
    public void Stampa_Post(NodoAlbero p)
    {
        if(p==null)
        {
            return;
        }
        
        if(p.getfigliosx()!=null)
        {
            Stampa_Post(p.getfigliosx());
        }
        
         if(p.getfigliodx()!=null)
        {
            Stampa_Post(p.getfigliodx());
        }        
        
        System.out.print(p.getinfo()+"/"); 
    }     
    
    public NodoAlbero getptr()
    {
        return this.ptr;
    }
    
    public int cercaconta(NodoAlbero p,int valore,int conta)
    {
        if(p==null)
        {
            if(conta==0)
            {
                conta--;
            }
            return conta;
        }
        
        if(p.getinfo()==valore)
        {
            conta++;
        }
        
        if(p.getfigliosx()!=null)
        {
            return cercaconta(p.getfigliosx(),valore,conta);
        }
        
        if(p.getfigliodx()!=null)
        {
            return cercaconta(p.getfigliodx(),valore,conta);
        }

        return conta;
    }
    
    public boolean StessaStruttura(NodoAlbero p1,NodoAlbero p2)
    {
        if(p1==null && p2==null)
        {
            return true;
        }
        
        else if((p1==null) || (p2==null))
        {
            return false;
        }
        
        else
        {
             return StessaStruttura(p1.getfigliosx(),p2.getfigliosx()) &&
                    StessaStruttura(p1.getfigliodx(),p2.getfigliodx());
        }
    }        
}
                    