package RegraDeNegocios;
public abstract class Pao implements MetodosPao{
    private int quantidade;
    private float preco;
    private float renda;
    private float falta;

    public Pao(int quantidade) {
        this.quantidade = quantidade;
    }

    public float getFalta() {
        return falta;
    }

    public void setFalta(float falta) {
        this.falta = falta;
    }

    public float getRenda() {
        return renda;
    }

    public void setRenda(float renda) {
        this.renda = renda;
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
    
    @Override
    public abstract String VenderPao(int quantidade, float pago);
    
    @Override
    public abstract String VenderPao(float valor);
}
