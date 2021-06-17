package RegraDeNegocios;
public class PaoDeForma extends Pao{
    public PaoDeForma(int quantidade) {
        super(quantidade);
    }
    
    @Override
    public String VenderPao(int pacote, float pago) { // 1 Pacote possui 10 unidades
        this.setPreco(5);
        if (this.getQuantidade() >= pacote) {
            if (pago > (pacote*this.getPreco())) {
                float troco = pago-(pacote*this.getPreco());
                this.setQuantidade(this.getQuantidade()-pacote);
                this.setRenda(this.getRenda()+(pago-troco));
                return "A Compra foi realizada com sucesso, seu troco é de " + troco;
            } else if (pago == (pacote*this.getPreco())) {
                float troco = 0;
                this.setQuantidade(this.getQuantidade()-pacote);
                this.setRenda(this.getRenda()+pago);
                return "A Compra foi realizada com sucesso";
            } else {
                this.setRenda(this.getRenda()+pago);
                this.setFalta(pago - (pacote*this.getPreco()));
                return "A Compra não pode ser realizada, faltou R$" + (this.getFalta())*-1;
            }
        } else {
            return "A Compra não pode ser realizada, pois só há " + this.getQuantidade() + " Pães no estoque";
        }
    }
    
    @Override
    public String VenderPao(float valor) {
        if ((valor)*-1 == this.getFalta()) {
            this.setRenda(this.getRenda()+valor);
            this.setFalta(this.getFalta()+valor);
            return "A Compra foi realizada com sucesso";
        } else {
            float troco = valor+this.getFalta();
            this.setRenda(this.getRenda()+(valor-troco));
            this.setFalta(this.getFalta()-(valor-troco));
            return "A Compra foi realizada com sucesso, seu troco é de " + troco;
        }
    }
}
