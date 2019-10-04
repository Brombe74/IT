
package albero;

public class NodoAlbero 
{
    private int info;
    private NodoAlbero dx;
    private NodoAlbero sx;
    
    public NodoAlbero(int c)
    {
        this.info=c;
        sx=null;
        dx=null;
    }
    
    public void setinfo(int c)
    {
        this.info=c;
    }  
    public int getinfo()
    {
        return this.info;
    }
    
    public void setfigliodx(NodoAlbero nuovo)
    {
        this.dx=nuovo;
    }
    public NodoAlbero getfigliodx()
    {
        return this.dx;
    }
    
    public void setfigliosx(NodoAlbero nuovo)
    {
        this.sx=nuovo;
    }
    public NodoAlbero getfigliosx()
    {
        return this.sx;
    }
}
