
/**
 * Escreva uma descrição da classe Destinatario aqui.
 * 
 * @author Gustavo 
 * @version 20230829
 */
public class Destinatario{
    
    private String nome;
    private String email;
    private String telefone;
    

    
    public Destinatario (String email){//constructor
        this.nome = "sem nome";
        this.email = email;
        this.telefone = "sem telefone";
    }
    
    public Destinatario (String nome, String email){//constructor
        this.nome = nome;
        this.email = email;
        this.telefone = "sem telefone";
    }
    
    public Destinatario (String nome, String email, String telefone){//constructor
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
    }
    
    public String getNome(){
        return this.nome;
    } 
    
    public String getEmail(){
        return this.email; 
    }
    
    public String getTelefone(){
        return this.telefone; 
    }

    
}
