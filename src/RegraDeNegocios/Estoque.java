package RegraDeNegocios;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Estoque implements MetodosEstoque{
    private float caixa;
    private Bebida bebida;
    private Pao pao;
    private Doce doce;
    private Salgado salgado;
    public List<Pao> paocad = new ArrayList<>();
    public List<Bebida> bebidacad = new ArrayList<>();
    public List<Salgado> salgadocad = new ArrayList<>();
    public List<Doce> docecad = new ArrayList<>();

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
                break;
            case "SPRITE":
                this.bebida = new Sprite(quantidade);
                break;
            case "FANTALARANJA":
                this.bebida = new FantaLaranja(quantidade);
                break;
            case "SUCODEGOIABA":
                this.bebida = new SucoDeGoiaba(quantidade);
                break;
            case "SUCODELARANJA":
                this.bebida = new SucoDeLaranja(quantidade);
                break;
            // PÃES
            case "PAOCARTEIRA":
                this.pao = new PaoCarteira(quantidade);
                break;
            case "PAOCILINDRO":
                this.pao = new PaoCilindro(quantidade);
                break;
            case "PAOJACO":
                this.pao = new PaoJaco(quantidade);
                break;
            case "PAODEFORMA":
                this.pao = new PaoDeForma(quantidade);
                break;
            case "PAOCOCADA":
                this.pao = new PaoCocada(quantidade);
                break;
            // DOCES
            case "BRIGADEIRO":
                this.doce = new Brigadeiro(quantidade);
                break;
            case "BEIJINHO":
                this.doce = new Beijinho(quantidade);
                break;
            case "COCADA":
                this.doce = new Cocada(quantidade);
                break;
            case "SONHODEGOIABADA":
                this.doce = new SonhoDeGoiabada(quantidade);
                break;
            case "TARTILETE":
                this.doce = new Tartilete(quantidade);
                break;
            // SALGADOS
            case "COXINHADEFRANGO":
                this.salgado = new CoxinhaDeFrango(quantidade);
                break;
            case "EMPADADEFRANGO":
                this.salgado = new EmpadaDeFrango(quantidade);
                break;
            case "KIBE":
                this.salgado = new Kibe(quantidade);
                break;
            case "PAODEQUEIJO":
                this.salgado = new PaoDeQueijo(quantidade);
                break;
            case "PASTELDEQUEIJO":
                this.salgado = new PastelDeQueijo(quantidade);
                break;
        }
        
        try {        
            FileWriter arq = new FileWriter("estoque.dat",true);
            PrintWriter pArq = new PrintWriter(arq);
            
            pArq.println("Nome: " + classe);
            pArq.println("Quantidade: " + quantidade);
            
            pArq.flush();
            pArq.close();
            arq.close();
            
        } catch (IOException ex) {
            Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return quantidade + " unidade(s) de " + classe + " foram adicionado(s) ao Estoque";
    }
    
    @Override
    public void CadastrarVenda(String classe, int quantidade, float pago) {
        switch (classe) {
            // BEBIDAS
            case "COCACOLA":
                this.bebida.VenderBebida(quantidade, pago);
                this.setCaixa(this.getCaixa()+this.bebida.getRenda());
                break;
            case "SPRITE":
                this.bebida.VenderBebida(quantidade, pago);
                this.setCaixa(this.getCaixa()+this.bebida.getRenda());
                break;
            case "FANTALARANJA":
                this.bebida.VenderBebida(quantidade, pago);
                this.setCaixa(this.getCaixa()+this.bebida.getRenda());
                break;
            // PÃES
            case "PAOCARTEIRA":
                this.pao.VenderPao(quantidade, pago);
                this.setCaixa(this.getCaixa()+this.pao.getRenda());
                break;
            case "PAOCILINDRO":
                this.pao.VenderPao(quantidade, pago);
                this.setCaixa(this.getCaixa()+this.pao.getRenda());
                break;
            case "PAOJACO":
                this.pao.VenderPao(quantidade, pago);
                this.setCaixa(this.getCaixa()+this.pao.getRenda());
                break;
            case "PAODEFORMA":
                this.pao.VenderPao(quantidade, pago);
                this.setCaixa(this.getCaixa()+this.pao.getRenda());
                break;
            // DOCES
            case "BRIGADEIRO":
                this.doce.VenderDoce(quantidade, pago);
                this.setCaixa(this.getCaixa()+this.doce.getRenda());
                break;
            case "BEIJINHO":
                this.doce.VenderDoce(quantidade, pago);
                this.setCaixa(this.getCaixa()+this.doce.getRenda());
                break;
            case "COCADA":
                this.doce.VenderDoce(quantidade, pago);
                this.setCaixa(this.getCaixa()+this.doce.getRenda());
                break;
            case "SONHODEGOIABADA":
                this.doce.VenderDoce(quantidade, pago);
                this.setCaixa(this.getCaixa()+this.doce.getRenda());
                break;
            case "TARTILETE":
                this.doce.VenderDoce(quantidade, pago);
                this.setCaixa(this.getCaixa()+this.doce.getRenda());
                break;
            // SALGADOS
            case "COXINHADEFRANGO":
                this.salgado.VenderSalgado(quantidade, pago);
                this.setCaixa(this.getCaixa()+this.salgado.getRenda());
                break;
            case "EMPADADEFRANGO":
                this.salgado.VenderSalgado(quantidade, pago);
                this.setCaixa(this.getCaixa()+this.salgado.getRenda());
                break;
            case "KIBE":
                this.salgado.VenderSalgado(quantidade, pago);
                this.setCaixa(this.getCaixa()+this.salgado.getRenda());
                break;
            case "PAODEQUEIJO":
                this.salgado.VenderSalgado(quantidade, pago);
                this.setCaixa(this.getCaixa()+this.salgado.getRenda());
                break;
            case "PASTELDEQUEIJO":
                this.salgado.VenderSalgado(quantidade, pago);
                this.setCaixa(this.getCaixa()+this.salgado.getRenda());
                break;
        }
        this.bebida.setRenda(0);
        this.doce.setRenda(0);
        this.pao.setRenda(0);
        this.salgado.setRenda(0);
    }
    
    @Override
    public void CadastrarVenda(String classe, int quantidade, float pago, float tamanho) { // Metodo Apenas Para as Classes de Suco
        switch (classe) {
            case "SUCODEGOIABA":
                this.bebida.setMl(tamanho);
                this.bebida.VenderBebida(quantidade, pago);
                this.setCaixa(this.getCaixa()+this.bebida.getRenda());
                break;
            case "SUCODELARANJA":
                this.bebida.setMl(tamanho);
                this.bebida.VenderBebida(quantidade, pago);
                this.setCaixa(this.getCaixa()+this.bebida.getRenda());
                break;
        }
        this.bebida.setRenda(0);
    }
    
    @Override
    public void CadastrarVenda(int quantidade, float pago, boolean goiabada) { // Metodo Apenas Para a Classe Pao Cocada
        this.pao.setGoiabada(goiabada);
        this.pao.VenderPao(quantidade, pago);
        this.setCaixa(this.getCaixa()+this.pao.getRenda());
        this.pao.setRenda(0);
    }
    
    @Override
    public void CadastrarProduto(int quantidade, String nome, float valor, String tipo) {
        switch (tipo) {
            // BEBIDAS
            case "PAO":
                paocad.add(new PaoGenerico(quantidade, nome, valor));
                break;
            case "BEBIDA":
                bebidacad.add(new BebidaGenerica(quantidade, nome, valor));
                break;
            case "SALGADO":
                salgadocad.add(new SalgadoGenerico(quantidade, nome, valor));
                break;
            case "DOCE":
                docecad.add(new DoceGenerico(quantidade, nome, valor));
                break;
        }
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
    public void ListarVendas() {
    }
    
    @Override
    public void ListarComprasCliente() {
    }
}
