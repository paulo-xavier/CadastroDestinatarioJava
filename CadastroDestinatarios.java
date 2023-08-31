
/**
 * Escreva uma descrição da classe CadastroDestinatarios aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class CadastroDestinatarios{

    private ListaDestinatarios lista; 
    
    public CadastroDestinatarios(){
        this.lista = new ListaDestinatarios();
    }
    
    public void cadastrar (String email){
            Destinatario dest = new Destinatario(email);
            this.lista.registrar(dest);
    }
    
    
    public void cadastrar (String nome, String email){
            Destinatario dest = new Destinatario(nome, email);
            this.lista.registrar(dest);
    }
    
    
    public void cadastrar(String nome, String email, String telefone){
        Destinatario dest = new Destinatario(nome, email, telefone);
        this.lista.registrar(dest); 
    }
    
    
}
