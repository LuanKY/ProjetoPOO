package RegraDeNegocios;
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
    public void CadastrarCliente() {
    }
    
    @Override
    public void ExcluirCliente() {
    }
    
    @Override
    public void ListarClienteExcluidos() {
    }
    
    @Override
    public void ListarClienteCadastrados() {
    }
}
