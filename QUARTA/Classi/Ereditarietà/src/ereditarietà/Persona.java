
package ereditarietà;


public class Persona 
{
    private String Nome;
    private String Cognome;
    private int età;
    
public Persona()
{
    
}

public void SetNome(String nome)
    {
       this.Nome=nome;
    }

public String GetNome()
{
    return this.Nome;
}

public void SetCognome(String cognome)
    {
       this.Cognome=cognome;
    }

public String GetCognome()
{
    return this.Cognome;
}

public void SetNome(int età)
    {
       this.età=età;
    }

public int GetEtà()
{
    return this.età;
}

}

