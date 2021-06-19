package RegraDeNegocios;
public class Estoque implements MetodosEstoque{
    private float caixa;
    private Bebida bebida;
    private Pao pao;
    private Doce doce;
    private Salgado salgado;

    public Bebida getBebida() {
        return bebida;
    }

    public void setBebida(Bebida bebida) {
        this.bebida = bebida;
    }

    public Pao getPao() {
        return pao;
    }

    public void setPao(Pao pao) {
        this.pao = pao;
    }

    public Doce getDoce() {
        return doce;
    }

    public void setDoce(Doce doce) {
        this.doce = doce;
    }

    public Salgado getSalgado() {
        return salgado;
    }

    public void setSalgado(Salgado salgado) {
        this.salgado = salgado;
    }

    
    public float getCaixa() {
        return caixa;
    }

    public void setCaixa(float caixa) {
        this.caixa = caixa;
    }
    
    @Override
    public String AdicionarProdutoAoEstoque(String classe, int quantidade) {
        // Na parte grafica vai pegar nome do produto e jogar nesse metodo
        switch (classe) {
            // BEBIDAS
            case "COCACOLA":
                this.bebida = new CoCaCola(quantidade);
            case "SPRITE":
                this.bebida = new Sprite(quantidade);
            case "FANTALARANJA":
                this.bebida = new FantaLaranja(quantidade);
            case "SUCODEGOIABA":
                this.bebida = new SucoDeGoiaba(quantidade);
            case "SUCODELARANJA":
                this.bebida = new SucoDeLaranja(quantidade);
            // PÃES
            case "PAOCARTEIRA":
                this.pao = new PaoCarteira(quantidade);
            case "PAOCILINDRO":
                this.pao = new PaoCilindro(quantidade);
            case "PAOJACO":
                this.pao = new PaoJaco(quantidade);
            case "PAODEFORMA":
                this.pao = new PaoDeForma(quantidade);
            case "PAOCOCADA":
                this.pao = new PaoCocada(quantidade);
            // DOCES
            case "BRIGADEIRO":
                this.doce = new Brigadeiro(quantidade);
            case "BEIJINHO":
                this.doce = new Beijinho(quantidade);
            case "COCADA":
                this.doce = new Cocada(quantidade);
            case "SONHODEGOIABADA":
                this.doce = new SonhoDeGoiabada(quantidade);
            case "TARTILETE":
                this.doce = new Tartilete(quantidade);
            // SALGADOS
            case "COXINHADEFRANGO":
                this.salgado = new CoxinhaDeFrango(quantidade);
            case "EMPADADEFRANGO":
                this.salgado = new EmpadaDeFrango(quantidade);
            case "KIBE":
                this.salgado = new Kibe(quantidade);
            case "PAODEQUEIJO":
                this.salgado = new PaoDeQueijo(quantidade);
            case "PASTELDEQUEIJO":
                this.salgado = new PastelDeQueijo(quantidade);
        }
        return quantidade + " Unidade de " + classe + " foram adicionado ao Estoque";
    }
    
    @Override
    public void CadastrarProduto() {
    }
    
    @Override
    public void ExcluirProduto() {
}
    @Override
    public void ListarProdutosCadastrados() {
    }
    
    @Override
    public void ListarProdutosEmEstoque() {
    }
    
    @Override
    public void ListarProdutosCategoria() {
    }
    
    @Override
    public void ListarProdutosForaEstoque() {
    }
    
    @Override
    public void CadastrarVenda() {
    }
    
    @Override
    public void ListarVendas() {
    }
    
    @Override
    public void ListarComprasCliente() {
    }
}
