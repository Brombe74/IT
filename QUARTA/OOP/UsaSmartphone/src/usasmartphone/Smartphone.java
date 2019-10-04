
package usasmartphone;


public class Smartphone 
{
    private String nomeSmartphone;
    private double credito;
    private int numChiamateUscita;
    private int numChiamateEntrata;
    
    public Smartphone()
    {
        this.nomeSmartphone="";
    }
    public Smartphone(String nomeSmartphone,double credito,int numChiamateEntrata,int numChiamateUscita)
    {
        this.nomeSmartphone=nomeSmartphone;
        this.credito=credito;
        this.numChiamateEntrata=numChiamateEntrata;
        this.numChiamateUscita=numChiamateUscita;
    }
    
    public int getChiamateUscita()
    {
        return this.numChiamateUscita;
    }
    public int getChiamateEntrata()
    {
        return this.numChiamateEntrata;
    }
    public double getCredito()
    {
        return this.credito;
    }
    public String getNomeSmartphone()
    {
        return this.nomeSmartphone;
    }
    public void SetCredito(int nuovoCredito)
    {
        this.credito=nuovoCredito;
    }
    public void aggiornaChiamateEntrata(int numChiamate)
    {
        this.numChiamateEntrata=this.numChiamateEntrata+numChiamate;
    }
   public void aggiornaChiamateUscita(int numChiamate)
   {
       this.numChiamateUscita=this.numChiamateUscita+numChiamate;
   }
}
