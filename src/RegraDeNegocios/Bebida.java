package RegraDeNegocios;
public abstract class Bebida implements MetodosBebida{
    private char tamanho;
    private int quantidade;
    private float preco;
    private float renda;
    private float falta;
    
    
    public Bebida(int quantidade, char tamanho) {
        this.quantidade = quantidade;
        this.tamanho = tamanho;
    }
    
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
    
    public float getRenda() {
        return renda;
    }

    public float getFalta() {
        return falta;
    }

    public void setRenda(float renda) {
        this.renda = renda;
    }

    public void setFalta(float falta) {
        this.falta = falta;
    }
    
    @Override
    public abstract String VenderBebida(int quantidade, char tamanho, float pago);
    
}
