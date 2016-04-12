/**
 *
 * @author Eliomar Santana
 */
public class CommandConcatenar implements ICommand {
    
    public CommandConcatenar(Document document)
    {
        this.document = document;
    }
  
    @Override
    public void execute(String texto ) {
        estadoAnterior = document.getTexto();
        document.concatenar(texto);
    }

    @Override
    public void undo() {
        document.desconcatenar(getEstadoAnterior());
    }
    
    public String getEstadoAnterior(){
        return this.estadoAnterior;
    }
    
    private String estadoAnterior;
    public Document document ;
}
