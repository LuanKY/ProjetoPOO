package RegraDeNegocios;
public interface MetodosEstoque {
    public String AdicionarProdutoAoEstoque(String classe, int quantidade);
    public void CadastrarVenda(String classe, int quantidade, float pago);
    public void CadastrarVenda(String classe, int quantidade, float pago, float tamanho);
    public void CadastrarVenda(int quantidade, float pago, boolean goiabada);
    public void CadastrarProduto();
    public void ExcluirProduto();
    public void ListarProdutosCadastrados();
    public void ListarProdutosEmEstoque();
    public void ListarProdutosCategoria();
    public void ListarProdutosForaEstoque();
    public void ListarVendas();
    public void ListarComprasCliente();
}
