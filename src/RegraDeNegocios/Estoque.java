package RegraDeNegocios;
public class Estoque implements MetodosEstoque{
    private float caixa;

    public float getCaixa() {
        return caixa;
    }

    public void setCaixa(float caixa) {
        this.caixa = caixa;
    }
    
    @Override
    public void CadastrarProduto() {
    }
    
    @Override
    public void ExcluirProduto() {
}
    @Override
    public void ListarProdutosCadastrados() {
    }
    
    @Override
    public void ListarProdutosEmEstoque() {
    }
    
    @Override
    public void AdicionarProdutoAoEstoque() {
    }
    
    @Override
    public void ListarProdutosCategoria() {
    }
    
    @Override
    public void ListarProdutosForaEstoque() {
    }
    
    @Override
    public void CadastrarVenda() {
    }
    
    @Override
    public void ListarVendas() {
    }
    
    @Override
    public void ListarComprasCliente() {
    }
}
