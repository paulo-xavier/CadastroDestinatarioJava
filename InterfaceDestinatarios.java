import java.util.Scanner; 
/**
 * Escreva uma descrição da classe InterfaceDestinatarios aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class InterfaceDestinatarios{

    
    private CadastroDestinatarios cadastro; 
    
    public static void main(String args[]){
        new InterfaceDestinatarios().rodar();
    
    }
    
    public InterfaceDestinatarios(){
         this.cadastro = new CadastroDestinatarios(); 
    }
    
    public void rodar(){
        Scanner leitor = new Scanner (System.in); 
        
        System.out.print("Nome: ");
        String nome = leitor.nextLine();
        System.out.print("Email: ");
        String email = leitor.nextLine();
        System.out.print("Telefone: ");
        String telefone = leitor.nextLine(); 
        

        
        // mandar mensagem em algum momento
        cadastro.cadastrar(nome, email, telefone); 
    
    
    }



}
