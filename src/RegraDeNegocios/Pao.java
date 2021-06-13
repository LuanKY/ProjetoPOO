package RegraDeNegocios;
public abstract class Pao implements MetodosPao{
    private int quantidade;
    private float preco;

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }
    
    @Override
    public void VenderPao() {
    }
}
