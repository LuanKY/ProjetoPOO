package RegraDeNegocios;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Cliente implements MetodosCliente{
    private String nome;
    private String cpf;
    
    public Cliente(String nome, String cpf){
        this.nome = nome;
        this.cpf = cpf;
    }
    
    public Cliente(){
        
    }
    
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
            
            pArq.println(this.nome);
            pArq.println(this.cpf);
            
            pArq.flush();
            pArq.close();
            arq.close();
            
        } catch (IOException ex) {
            Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return "Cliente cadastrado com sucesso!";
    }
    
    @Override
    public String ExcluirCliente(String nome, String cpf) {
        
       File arq = new File("cadastroClientes.txt");
        
        try{
           FileReader fr = new FileReader(arq);
           BufferedReader br = new BufferedReader(fr);
           
           String linhaCadastro = br.readLine();
           ArrayList<String> salvar = new ArrayList();
           
           while(linhaCadastro != null){
               if(linhaCadastro.equals(nome) == false && linhaCadastro.equals(cpf) == false){
                   salvar.add(linhaCadastro);
               }
               linhaCadastro = br.readLine();
           }
           
           fr.close();
           br.close();
           
           FileWriter fw2 = new FileWriter(arq, true);
           fw2.close();
        
           FileWriter fw = new FileWriter(arq);
           BufferedWriter bw = new BufferedWriter(fw);
           
           for(int i = 0; i < salvar.size(); i++){
               bw.write(salvar.get(i));
               bw.newLine();
           }
           
           bw.close();
           fw.close();
           
           
        }catch(IOException ex){
            
        }
     
        try {        
            FileWriter exl = new FileWriter("excluirClientes.txt",true);
            PrintWriter pArq = new PrintWriter(exl);
            
            pArq.println(nome);
            pArq.println(cpf);
            
            pArq.flush();
            pArq.close();
            exl.close();
            
        } catch (IOException ex) {
            Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return "Excluido com sucesso!";
       
    }
    
    @Override
    public void ListarClienteExcluidos() {
        
         Path caminho = Paths.get("excluirClientes.txt");
        try {
            byte[] lista = Files.readAllBytes(caminho);
            String leitura = new String(lista);
            
            JOptionPane.showMessageDialog(null, leitura);
        }catch(Exception erro){
          
        }
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
