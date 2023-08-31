import static java.nio.file.StandardOpenOption.*;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.io.BufferedWriter;
import java.io.IOException;
import java.util.List;

/**
 * Escreva uma descrição da classe ListaDestinatarios aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class ListaDestinatarios{
    
    public void registrar(Destinatario dest){
        String nome = dest.getNome();
        String email = dest.getEmail();
        String telefone = dest.getTelefone();
        
        escreve(nome + "," + email + "," + telefone); 
    }
    
     public void escreve(String registro) {
        Path p = Paths.get("./destinatarios.csv");
        try (BufferedWriter out = Files.newBufferedWriter(p, CREATE, APPEND)) {
            out.write(registro);
            out.write("\n");
        } catch (IOException x) {
            System.err.println(x);
        }
    }

    public void le(String nomeArquivo) {
        Path file = Paths.get(nomeArquivo);
        List<String> linhasArquivo;
        try {
            linhasArquivo = Files.readAllLines(file);
            System.out.print(linhasArquivo);
        } catch (IOException ioe) {

        }
    }

}
