/**
 *
 * @author Eliomar Santana
 */
public class Main {
    public static void main(String[] args)
    {
        Document doc = new Document();
        ICommand comandoConcaternar = new CommandConcatenar(doc);
        comandoConcaternar.execute("Texto1-> ");
        ICommand comandoConcaternar2 = new CommandConcatenar(doc);
        comandoConcaternar2.execute("Texto2-> ");
        ICommand comandoConcaternar3 = new CommandConcatenar(doc);
        comandoConcaternar3.execute("texto3-> ");
        
        System.out.println(doc.getTexto());
        System.out.println("");
        System.out.println("Desconcatenando...");
        
        comandoConcaternar3.undo();
        System.out.println(doc.getTexto());
        comandoConcaternar2.undo();
        System.out.println(doc.getTexto());
        comandoConcaternar.undo();
        System.out.println(doc.getTexto());
        
        ICommand comandoConcaternar4 = new CommandConcatenar(doc);
        comandoConcaternar4.execute("Texto4-> ");
        
        System.out.println(doc.getTexto());
    }
}