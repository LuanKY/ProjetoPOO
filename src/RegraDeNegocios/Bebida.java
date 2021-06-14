package RegraDeNegocios;
public abstract class Bebida implements MetodosBebida{
    private char tamanho;
    private int quantidade;
    private float preco;
    //teste
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
    
    public char getTamanho() {
        return tamanho;
    }

    public void setTamanho(char tamanho) {
        this.tamanho = tamanho;
    }
    
    @Override
    public void VenderBebida() {
    }
}
