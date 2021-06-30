package RegraDeNegocios;
public abstract class Doce implements MetodosDoce{
    private String classe;
    private int quantidade;
    private float preco;
    private float renda;
    private float falta;
    private int unidade;

    public Doce(int quantidade) {
        this.quantidade = quantidade;
    }
    
    public String getClasse() {
        return classe;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }

    public float getFalta() {
        return falta;
    }

    public void setFalta(float falta) {
        this.falta = falta;
    }
    
    public int getUnidade() {
        return unidade;
    }

    public void setUnidade(int unidade) {
        this.unidade = unidade;
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
    public abstract String VenderDoce(int quantidade, float pago);
    
    @Override
    public String VenderDoce(float valor) {
        if ((valor)*-1 == this.getFalta()) {
            this.setQuantidade(this.getQuantidade()-this.getUnidade());
            this.setRenda(this.getRenda()+valor);
            this.setFalta(this.getFalta()+valor);
            return "A Compra foi realizada com sucesso";
        } else {
            float troco = valor+this.getFalta();
            this.setQuantidade(this.getQuantidade()-this.getUnidade());
            this.setRenda(this.getRenda()+(valor-troco));
            this.setFalta(this.getFalta()-(valor-troco));
            return "A Compra foi realizada com sucesso, seu troco é de " + troco;
        }
    }
}
