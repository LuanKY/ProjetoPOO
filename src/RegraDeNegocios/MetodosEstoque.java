package RegraDeNegocios;
public interface MetodosEstoque {
    public String AdicionarProdutoAoEstoque(String classe, int quantidade);
    public void CadastrarVenda(String classe, int quantidade, float pago);
    public void CadastrarVenda(String classe, int quantidade, float pago, float tamanho);
    public void CadastrarVenda(int quantidade, float pago, boolean goiabada);
    public void CadastrarProduto(int quantidade, String nome, float valor, String tipo);
    public String ListarProdutosEmEstoque();
    public String ListarProdutosCadastrados();
    public String ListarProdutosForaEstoque();
    public void ExcluirProduto();
    public void ListarProdutosCategoria();
    public void ListarVendas();
    public void ListarComprasCliente();
}
