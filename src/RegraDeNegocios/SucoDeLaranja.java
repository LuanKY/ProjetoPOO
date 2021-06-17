package RegraDeNegocios;
public class SucoDeLaranja extends Bebida{
    private char tamanho;

    public SucoDeLaranja(float quantidade) {
        super(quantidade);
    }
    
    public char getTamanho() {
        return tamanho;
    }

    public void setTamanho(char tamanho) {
        this.tamanho = tamanho;
    }
    
    public String VenderBebida(int copos, float pago, char tamanho) { //Quantidade em Litros e não em latas
        this.setCopos(copos);
        String tam = String.valueOf(tamanho).toUpperCase();
        switch (tam) {
            case "P":
                this.setPreco(2);
                this.setMl(0.200f);
                break;
            case "M":
                this.setPreco(2.5f);
                this.setMl(0.300f);
                break;
            case "G":
                this.setPreco(3.5f);
                this.setMl(0.500f);
                break;
            default:
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
    // METODO QUE EU FALEI
    @Override
    public String VenderBebida(int quantidade, float pago) {
        return "";
    }
}
