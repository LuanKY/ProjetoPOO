package RegraDeNegocios;
public class SucoDeGoiaba extends Bebida{
    public SucoDeGoiaba(int quantidade, char tamanho){
        super(quantidade,tamanho);
    }
    
    @Override
    public String VenderBebida(int quantidade, char tamanho, float pago) {
        this.setPreco(3.0f);
        if (this.getQuantidade() >= quantidade) {
            if (pago > (quantidade*this.getPreco())) {
                float troco = pago-(quantidade*this.getPreco());
                this.setQuantidade(this.getQuantidade()-quantidade);
                this.setRenda(this.getRenda()+(pago-troco));
                return "A Compra foi realizada com sucesso, seu troco é de " + troco;
            } else if (pago == (quantidade*this.getPreco())) {
                float troco = 0;
                this.setQuantidade(this.getQuantidade()-quantidade);
                this.setRenda(this.getRenda()+pago);
                return "A Compra foi realizada com sucesso";
            }  else {
                this.setRenda(this.getRenda()+pago);
                this.setFalta(pago - (quantidade*this.getPreco()));
                return "A Compra não pode ser realizada, faltou R$" + (this.getFalta())*-1;
            }
        } else {
            return "A Compra não pode ser realizada, pois só há " + this.getQuantidade() + " Bebidas no estoque";
        }
    }
}