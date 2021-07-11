package RegraDeNegocios;

import java.util.List;

public interface MetodosEstoque {
    public String AdicionarProdutoAoEstoque(String classe, int quantidade);
    public void CadastrarVenda(String classe, int quantidade, float pago);
    public void CadastrarVenda(String classe, int quantidade, float pago, float tamanho);
    public void CadastrarVenda(int quantidade, float pago, boolean goiabada);
    public String CadastrarProduto(int quantidade, String nome, float valor, String tipo);
    public String ListarProdutosEmEstoque();
    public String ListarProdutosCadastrados();
    public String ListarProdutosForaEstoque();
    public String ListarProdutosCategoria(String Categoria);
    public void ExcluirProduto(String nome, String tipo);
    public List ListarVendas();
}
