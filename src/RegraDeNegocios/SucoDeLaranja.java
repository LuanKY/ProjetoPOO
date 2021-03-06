package RegraDeNegocios;
public class SucoDeLaranja extends Bebida{

    public SucoDeLaranja(float quantidade) {
        super(quantidade);
        this.setClasse("SUCODELARANJA");
    }
    
    @Override
    public String VenderBebida(int copos, float pago) { //Quantidade em Litros e não em latas
        // Antes da execução do metodo, deve ser setado o tamanho
        this.setCopos(copos);
        float tam = this.getMl();
        if (tam <= 0.2f) {
            this.setPreco(2);
        } else if (tam <= 0.3f) {
            this.setPreco(2.5f);
        } else if (tam <= 0.5f) {
            this.setPreco(3.5f);
        } else {
            return "Só temos os tamanhos P, M e G";
        }
        if (this.getQuantidade() >= this.getMl()*copos) {
            if (pago > (copos*this.getPreco())) {
                float troco = pago-(copos*this.getPreco());
                this.setQuantidade(this.getQuantidade()-this.getMl()*copos);
                this.setRenda(this.getRenda()+(pago-troco));
                return "A Compra foi realizada com sucesso, seu troco é de " + troco;
            } else if (pago == (copos*this.getPreco())) {
                float troco = 0;
                this.setQuantidade(this.getQuantidade()-this.getMl()*copos);
                this.setRenda(this.getRenda()+pago);
                return "A Compra foi realizada com sucesso";
            } else {
                this.setRenda(this.getRenda()+pago);
                this.setFalta(pago - (copos*this.getPreco()));
                return "A Compra não pode ser realizada, faltou R$" + (this.getFalta())*-1;
            }
        } else {
            return "A Compra não pode ser realizada, pois só há " + this.getQuantidade() + " Bebidas no estoque";
        }
    }
    @Override
    public String VenderBebida(float valor) {
        if ((valor)*-1 == this.getFalta()) {
            this.setQuantidade(this.getQuantidade()-this.getMl()*this.getCopos());
            this.setRenda(this.getRenda()+valor);
            this.setFalta(this.getFalta()+valor);
            return "A Compra foi realizada com sucesso";
        } else {
            float troco = valor+this.getFalta();
            this.setQuantidade(this.getQuantidade()-this.getMl()*this.getCopos());
            this.setRenda(this.getRenda()+(valor-troco));
            this.setFalta(this.getFalta()-(valor-troco));
            return "A Compra foi realizada com sucesso, seu troco é de " + troco;
        }
    }
}
