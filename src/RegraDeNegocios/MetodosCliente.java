package RegraDeNegocios;
public interface MetodosCliente {
    public String CadastrarCliente();
    public String ExcluirCliente(String nome, String cpf);
    public void ListarClienteExcluidos();
    public void ListarClienteCadastrados();
}
