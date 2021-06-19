package RegraDeNegocios;
public interface MetodosEstoque {
    public String AdicionarProdutoAoEstoque(String classe, int quantidade); 
    public void CadastrarProduto();
    public void ExcluirProduto();
    public void ListarProdutosCadastrados();
    public void ListarProdutosEmEstoque();
    public void ListarProdutosCategoria();
    public void ListarProdutosForaEstoque();
    public void CadastrarVenda();
    public void ListarVendas();
    public void ListarComprasCliente();
}
