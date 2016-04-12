/**
 *
 * @author Eliomar Santana
 */
public class Document {
    
    public Document()
    {
        this.texto = " TextoInicial-> ";
    }
    
    public void concatenar(String texto)
    {
        this.texto += texto;
    }
    
    public void desconcatenar(String anterior)
    {
        this.texto = anterior;
    }
    
    public String getTexto()
    {
        return texto;
    }
   
    private String texto ;
}
