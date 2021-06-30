package RegraDeNegocios;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Cliente implements MetodosCliente{
    private String nome;
    private String cpf;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
    @Override
    public String CadastrarCliente() {
       
        try {        
            FileWriter arq = new FileWriter("cadastroClientes.txt",true);
            PrintWriter pArq = new PrintWriter(arq);
            
            pArq.println("Nome: " + this.nome);
            pArq.println("CPF: " + this.cpf);
            
            pArq.flush();
            pArq.close();
            arq.close();
            
        } catch (IOException ex) {
            Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return "Cadastrado com sucesso!";
    }
    
    @Override
    public void ExcluirCliente() {
    }
    
    @Override
    public void ListarClienteExcluidos() {
    }
    
    @Override
    public void ListarClienteCadastrados() {
        
        Path caminho = Paths.get("cadastroClientes.txt");
        
        try {
            byte[] lista = Files.readAllBytes(caminho);
            String leitura = new String(lista);
            
            JOptionPane.showMessageDialog(null, leitura);
        } catch(Exception erro){
          
        }
                
    }
}
