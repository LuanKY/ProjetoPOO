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
    public List<Pao> paoestoque = new ArrayList<>();
    public List<Bebida> bebidaestoque = new ArrayList<>();
    public List<Salgado> salgadoestoque = new ArrayList<>();
    public List<Doce> doceestoque = new ArrayList<>();
    public List<Pao> paonovo = new ArrayList<>();
    public List<Bebida> bebidanovo = new ArrayList<>();
    public List<Salgado> salgadonovo = new ArrayList<>();
    public List<Doce> docenovo = new ArrayList<>();
    public String[] foraestoque;

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
                bebidaestoque.add(new CoCaCola(quantidade));
                break;
            case "SPRITE":
                bebidaestoque.add(new Sprite(quantidade));
                break;
            case "FANTALARANJA":
                bebidaestoque.add(new FantaLaranja(quantidade));
                break;
            case "SUCODEGOIABA":
                bebidaestoque.add(new SucoDeGoiaba(quantidade));
                break;
            case "SUCODELARANJA":
                bebidaestoque.add(new SucoDeLaranja(quantidade));
                break;
            // PÃES
            case "PAOCARTEIRA":
                paoestoque.add(new PaoCarteira(quantidade));
                break;
            case "PAOCILINDRO":
                paoestoque.add(new PaoCilindro(quantidade));
                break;
            case "PAOJACO":
                paoestoque.add(new PaoJaco(quantidade));
                break;
            case "PAODEFORMA":
                paoestoque.add(new PaoDeForma(quantidade));
                break;
            case "PAOCOCADA":
                paoestoque.add(new PaoCocada(quantidade));
                break;
            // DOCES
            case "BRIGADEIRO":
                doceestoque.add(new Brigadeiro(quantidade));
                break;
            case "BEIJINHO":
                doceestoque.add(new Beijinho(quantidade));
                break;
            case "COCADA":
                doceestoque.add(new Cocada(quantidade));
                break;
            case "SONHODEGOIABADA":
                doceestoque.add(new SonhoDeGoiabada(quantidade));
                break;
            case "TARTILETE":
                doceestoque.add(new Tartilete(quantidade));
                break;
            // SALGADOS
            case "COXINHADEFRANGO":
                salgadoestoque.add(new CoxinhaDeFrango(quantidade));
                break;
            case "EMPADADEFRANGO":
                salgadoestoque.add(new EmpadaDeFrango(quantidade));
                break;
            case "KIBE":
                salgadoestoque.add(new Kibe(quantidade));
                break;
            case "PAODEQUEIJO":
                salgadoestoque.add(new PaoDeQueijo(quantidade));
                break;
            case "PASTELDEQUEIJO":
                salgadoestoque.add(new PastelDeQueijo(quantidade));
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
        if ("COCACOLA".equals(classe) || "SPRITE".equals(classe) || "FANTALARANJA".equals(classe)) {
            for (int i = 0; i < bebidaestoque.size(); i++) {
                String nome = bebidaestoque.get(i).getClasse();
                if (nome.equals(classe)) {
                    switch (nome) {
                    case "COCACOLA":
                        bebidaestoque.get(i).VenderBebida(quantidade, pago);
                        this.setCaixa(this.getCaixa()+bebidaestoque.get(i).getRenda());
                        break;
                    case "SPRITE":
                        bebidaestoque.get(i).VenderBebida(quantidade, pago);
                        this.setCaixa(this.getCaixa()+bebidaestoque.get(i).getRenda());
                        break;
                    case "FANTALARANJA":
                        bebidaestoque.get(i).VenderBebida(quantidade, pago);
                        this.setCaixa(this.getCaixa()+bebidaestoque.get(i).getRenda());
                        break;
                    }
                }
                bebidaestoque.get(i).setRenda(0);
            }
        } else if ("PAOCARTEIRA".equals(classe) || "PAOCILINDRO".equals(classe) || "PAOJACO".equals(classe) || "PAODEFORMA".equals(classe)) {
            for (int i = 0; i < paoestoque.size(); i++) {
                String nome = paoestoque.get(i).getClasse();
                if (nome.equals(classe)) {
                    switch (nome) {
                    case "PAOCARTEIRA":
                        paoestoque.get(i).VenderPao(quantidade, pago);
                        this.setCaixa(this.getCaixa()+paoestoque.get(i).getRenda());
                        break;
                    case "PAOCILINDRO":
                        paoestoque.get(i).VenderPao(quantidade, pago);
                        this.setCaixa(this.getCaixa()+paoestoque.get(i).getRenda());
                        break;
                    case "PAOJACO":
                        paoestoque.get(i).VenderPao(quantidade, pago);
                        this.setCaixa(this.getCaixa()+paoestoque.get(i).getRenda());
                        break;
                    case "PAODEFORMA":
                        paoestoque.get(i).VenderPao(quantidade, pago);
                        this.setCaixa(this.getCaixa()+paoestoque.get(i).getRenda());
                        break;
                    }
                }
                paoestoque.get(i).setRenda(0);
            }
        } else if ("BRIGADEIRO".equals(classe) || "BEIJINHO".equals(classe) || "COCADA".equals(classe) || "SONHODEGOIABADA".equals(classe) || "TARTILETE".equals(classe)) {
            for (int i = 0; i < doceestoque.size(); i++) {
                String nome = doceestoque.get(i).getClasse();
                if (nome.equals(classe)) {
                    switch (nome) {
                    case "BRIGADEIRO":
                        doceestoque.get(i).VenderDoce(quantidade, pago);
                        this.setCaixa(this.getCaixa()+doceestoque.get(i).getRenda());
                        break;
                    case "BEIJINHO":
                        doceestoque.get(i).VenderDoce(quantidade, pago);
                        this.setCaixa(this.getCaixa()+doceestoque.get(i).getRenda());
                        break;
                    case "COCADA":
                        doceestoque.get(i).VenderDoce(quantidade, pago);
                        this.setCaixa(this.getCaixa()+doceestoque.get(i).getRenda());
                        break;
                    case "SONHODEGOIABADA":
                        doceestoque.get(i).VenderDoce(quantidade, pago);
                        this.setCaixa(this.getCaixa()+doceestoque.get(i).getRenda());
                        break;
                    case "TARTILETE":
                        doceestoque.get(i).VenderDoce(quantidade, pago);
                        this.setCaixa(this.getCaixa()+doceestoque.get(i).getRenda());
                        break;
                    }
                }
                doceestoque.get(i).setRenda(0);
            }
        } else if ("COXINHADEFRANGO".equals(classe) || "EMPADADEFRANGO".equals(classe) || "KIBE".equals(classe) || "PAODEQUEIJO".equals(classe) || "PASTELDEQUEIJO".equals(classe)) {
            for (int i = 0; i < salgadoestoque.size(); i++) {
                String nome = salgadoestoque.get(i).getClasse();
                if (nome.equals(classe)) {
                    switch (nome) {
                    case "COXINHADEFRANGO":
                        salgadoestoque.get(i).VenderSalgado(quantidade, pago);
                        this.setCaixa(this.getCaixa()+salgadoestoque.get(i).getRenda());
                        break;
                    case "EMPADADEFRANGO":
                        salgadoestoque.get(i).VenderSalgado(quantidade, pago);
                        this.setCaixa(this.getCaixa()+salgadoestoque.get(i).getRenda());
                        break;
                    case "KIBE":
                        salgadoestoque.get(i).VenderSalgado(quantidade, pago);
                        this.setCaixa(this.getCaixa()+salgadoestoque.get(i).getRenda());
                        break;
                    case "PAODEQUEIJO":
                        salgadoestoque.get(i).VenderSalgado(quantidade, pago);
                        this.setCaixa(this.getCaixa()+salgadoestoque.get(i).getRenda());
                        break;
                    case "PASTELDEQUEIJO":
                        salgadoestoque.get(i).VenderSalgado(quantidade, pago);
                        this.setCaixa(this.getCaixa()+salgadoestoque.get(i).getRenda());
                        break;
                    }
                }
                salgadoestoque.get(i).setRenda(0);
            }
        }
    }
    
    @Override
    public void CadastrarVenda(String classe, int quantidade, float pago, float tamanho) { // Metodo Apenas Para as Classes de Suco
        for (int i = 0; i < bebidaestoque.size(); i++) {
            String nome = bebidaestoque.get(i).getClasse();
            if (nome.equals(classe)) {
                switch (nome) {
                    case "SUCODEGOIABA":
                        bebidaestoque.get(i).setMl(tamanho);
                        bebidaestoque.get(i).VenderBebida(quantidade, pago);
                        this.setCaixa(this.getCaixa()+bebidaestoque.get(i).getRenda());
                        break;
                    case "SUCODELARANJA":
                        bebidaestoque.get(i).setMl(tamanho);
                        bebidaestoque.get(i).VenderBebida(quantidade, pago);
                        this.setCaixa(this.getCaixa()+bebidaestoque.get(i).getRenda());
                        break;
                }
            }
            bebidaestoque.get(i).setRenda(0);
        }
    }
    
    @Override
    public void CadastrarVenda(int quantidade, float pago, boolean goiabada) { // Metodo Apenas Para a Classe Pao Cocada
        for (int i = 0; i < paoestoque.size(); i++) {
            String nome = paoestoque.get(i).getClasse();
            if (nome.equals("PAOCOCADA")) {
                paoestoque.get(i).setGoiabada(goiabada);
                paoestoque.get(i).VenderPao(quantidade, pago);
                this.setCaixa(this.getCaixa()+paoestoque.get(i).getRenda());
                paoestoque.get(i).setRenda(0);
            }
            paoestoque.get(i).setRenda(0);
        }
    }
    
    @Override
    public void CadastrarProduto(int quantidade, String nome, float valor, String tipo) {
        switch (tipo) {
            // BEBIDAS
            case "PAO":
                paonovo.add(new PaoGenerico(quantidade, nome, valor));
                break;
            case "BEBIDA":
                bebidanovo.add(new BebidaGenerica(quantidade, nome, valor));
                break;
            case "SALGADO":
                salgadonovo.add(new SalgadoGenerico(quantidade, nome, valor));
                break;
            case "DOCE":
                docenovo.add(new DoceGenerico(quantidade, nome, valor));
                break;
        }
    }
    
    @Override
    public String ListarProdutosEmEstoque() {
        String produtos = "";
        for (int i = 0; i < bebidaestoque.size(); i++) {
            if(bebidaestoque.get(i).getQuantidade() > 0) {
                produtos += bebidaestoque.get(i).getClasse();
                produtos += ", ";
            }
        }
        for (int i = 0; i < bebidanovo.size(); i++) {
            if(bebidanovo.get(i).getQuantidade() > 0) {
                produtos += bebidanovo.get(i).getClasse();
                produtos += ", ";
            }
        }
        for (int i = 0; i < paoestoque.size(); i++) {
            if(paoestoque.get(i).getQuantidade() > 0) {
                produtos += paoestoque.get(i).getClasse();
                produtos += ", ";
            }
        }
        for (int i = 0; i < paonovo.size(); i++) {
            if(paonovo.get(i).getQuantidade() > 0) {
                produtos += paonovo.get(i).getClasse();
                produtos += ", ";
            }
        }
        for (int i = 0; i < salgadoestoque.size(); i++) {
            if(salgadoestoque.get(i).getQuantidade() > 0) {
                produtos += salgadoestoque.get(i).getClasse();
                produtos += ", ";
            }
        }
        for (int i = 0; i < salgadonovo.size(); i++) {
            if(salgadonovo.get(i).getQuantidade() > 0) {
                produtos += salgadonovo.get(i).getClasse();
                produtos += ", ";
            }
        }
        for (int i = 0; i < doceestoque.size(); i++) {
            if(doceestoque.get(i).getQuantidade() > 0) {
                produtos += doceestoque.get(i).getClasse();
                produtos += ", ";
            }
        }
        for (int i = 0; i < docenovo.size(); i++) {
            if(docenovo.get(i).getQuantidade() > 0) {
                produtos += docenovo.get(i).getClasse();
                produtos += ", ";
            }
        }
        return produtos;
    }
    
    @Override
    public String ListarProdutosCadastrados() {
        String produtos = "COCACOLA, SPRITE, FANTALARANJA, SUCODELARANJA, SUCODEGOIABA,"
                + " \nPAOJACO, PAOCOCADA, PAOCARTEIRA, PAODEFORMA, PAOCILINDRO,"
                + " \nBEIJINHO, BRIGADEIRO, SONHODEGOIABADA, TARTILETE, COCADA,"
                + " \nKIBE, PASTELDEQUEIJO, PAODEQUEIJO, EMPADADEFRANGO, COXINHADEFRANGO, ";
        for (int i = 0; i < bebidanovo.size(); i++) {
            produtos += bebidanovo.get(i).getClasse();
            produtos += ", ";
        }
        for (int i = 0; i < paonovo.size(); i++) {
            produtos += paonovo.get(i).getClasse();
            produtos += ", ";
        }
        for (int i = 0; i < salgadonovo.size(); i++) {
            produtos += salgadonovo.get(i).getClasse();
            produtos += ", ";
        }
        for (int i = 0; i < docenovo.size(); i++) {
            produtos += docenovo.get(i).getClasse();
            produtos += ", ";
        }
        return produtos;
    }
    
    @Override
    public String ListarProdutosForaEstoque() {
        String produtos = "";
        for (int i = 0; i < bebidaestoque.size(); i++) {
            if(bebidaestoque.get(i).getQuantidade() == 0) {
                produtos += bebidaestoque.get(i).getClasse();
                produtos += ", ";
            }
        }
        for (int i = 0; i < bebidanovo.size(); i++) {
            if(bebidanovo.get(i).getQuantidade() == 0) {
                produtos += bebidanovo.get(i).getClasse();
                produtos += ", ";
            }
        }
        for (int i = 0; i < paoestoque.size(); i++) {
            if(paoestoque.get(i).getQuantidade() == 0) {
                produtos += paoestoque.get(i).getClasse();
                produtos += ", ";
            }
        }
        for (int i = 0; i < paonovo.size(); i++) {
            if(paonovo.get(i).getQuantidade() == 0) {
                produtos += paonovo.get(i).getClasse();
                produtos += ", ";
            }
        }
        for (int i = 0; i < salgadoestoque.size(); i++) {
            if(salgadoestoque.get(i).getQuantidade() == 0) {
                produtos += salgadoestoque.get(i).getClasse();
                produtos += ", ";
            }
        }
        for (int i = 0; i < salgadonovo.size(); i++) {
            if(salgadonovo.get(i).getQuantidade() == 0) {
                produtos += salgadonovo.get(i).getClasse();
                produtos += ", ";
            }
        }
        for (int i = 0; i < doceestoque.size(); i++) {
            if(doceestoque.get(i).getQuantidade() == 0) {
                produtos += doceestoque.get(i).getClasse();
                produtos += ", ";
            }
        }
        for (int i = 0; i < docenovo.size(); i++) {
            if(docenovo.get(i).getQuantidade() == 0) {
                produtos += docenovo.get(i).getClasse();
                produtos += ", ";
            }
        }
        return produtos;
    }
    
    @Override
    public void ExcluirProduto() {
    }
    
    @Override
    public void ListarProdutosCategoria() {
    }
    
    @Override
    public void ListarVendas() {
    }
    
    @Override
    public void ListarComprasCliente() {
    }
}
