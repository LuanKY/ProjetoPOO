package RegraDeNegocios;
public class PaoCocada extends Pao{

    public PaoCocada(int quantidade) {
        super(quantidade);
    }

    @Override
    public String VenderPao(int quantidade, float pago) {
        // Antes da execução do metodo, deve ser setado se vai ter goiabada ou não
        boolean goiabada = this.getGoiabada();
        if (goiabada == true) {
            this.setPreco(0.6f);
        } else {
            this.setPreco(0.5f);
        }
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
            } else {
                this.setRenda(this.getRenda()+pago);
                this.setFalta(pago - (quantidade*this.getPreco()));
                return "A Compra não pode ser realizada, faltou R$" + (this.getFalta())*-1;
            }
        } else {
            return "A Compra não pode ser realizada, pois só há " + this.getQuantidade() + " Pães no estoque";
        }
    }
}
