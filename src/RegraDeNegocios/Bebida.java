package RegraDeNegocios;
public abstract class Bebida implements MetodosBebida{
    private String classe;
    private float quantidade;
    private float preco;
    private float renda;
    private float falta;
    private float ml;
    private int copos;

    public Bebida(float quantidade) {
        this.quantidade = quantidade;
    }

    public String getClasse() {
        return classe;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }

    public float getMl() {
        return ml;
    }
    
    public int getCopos() {
        return copos;
    }

    public void setCopos(int copos) {
        this.copos = copos;
    }

    public void setMl(float ml) {
        this.ml = ml;
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


    public float getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(float quantidade) {
        this.quantidade = quantidade;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }
    
    @Override
    public abstract String VenderBebida(int quantidade, float pago);
    
    @Override
    public String VenderBebida(float valor) {
        if ((valor)*-1 == this.getFalta()) {
            this.setQuantidade(this.getQuantidade()-this.ml*this.getCopos());
            this.setRenda(this.getRenda()+valor);
            this.setFalta(this.getFalta()+valor);
            return "A Compra foi realizada com sucesso";
        } else {
            float troco = valor+this.getFalta();
            this.setQuantidade(this.getQuantidade()-this.ml*this.getCopos());
            this.setRenda(this.getRenda()+(valor-troco));
            this.setFalta(this.getFalta()-(valor-troco));
            return "A Compra foi realizada com sucesso, seu troco é de " + troco;
        }
    }
}
