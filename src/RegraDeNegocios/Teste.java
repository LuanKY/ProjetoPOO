package RegraDeNegocios;

import java.util.Iterator;

public class Teste {
    public static void main(String[] args) {
        /* Teste PAO
        PaoCarteira pca = new PaoCarteira(5);
        PaoCilindro pci = new PaoCilindro(10);
        PaoCocada pco = new PaoCocada(10);
        PaoJaco pj = new PaoJaco(10);
        PaoDeForma pf = new PaoDeForma(2);
        System.out.println(pca.VenderPao(5, 5));
        System.out.println(pci.VenderPao(7, 2.5f));
        System.out.println(pf.VenderPao(2, 15));
        pco.setGoiabada(true);
        System.out.println(pco.VenderPao(5, 3));
        pco.setGoiabada(false);
        System.out.println(pco.VenderPao(5, 2.5f));
        System.out.println(pj.VenderPao(10, 1));
        System.out.println(pj.VenderPao(5));
        float rendatotal = (pca.getRenda()+pci.getRenda()+pco.getRenda()+pj.getRenda()+pf.getRenda());
        System.out.println(rendatotal); */
      
        /* Teste BEBIDA
        SucoDeGoiaba b = new SucoDeGoiaba(10);
        b.setMl(0.5f);
        System.out.println(b.VenderBebida(2, 7));
        b.setMl(0.2f);
        System.out.println(b.VenderBebida(2, 5));
        b.setMl(0.3f);
        System.out.println(b.VenderBebida(2, 6));
        System.out.println(b.getQuantidade()); */
        
        /*Estoque e = new Estoque();
        System.out.println(e.AdicionarProdutoAoEstoque("SUCODELARANJA", 10));
        e.CadastrarVenda("SUCODELARANJA", 2, 7, 0.5f);
        System.out.println(e.getBebida().getQuantidade());
        System.out.println(e.getCaixa());*/
        
        Estoque e = new Estoque();
        e.CadastrarProduto(10, "PAODECHOCOLATE", 0.40f, "PAO");
        e.CadastrarProduto(20, "PAODEPUBA", 0.50f, "PAO");
        System.out.println(e.paocad.get(0).VenderPao(10, 3));
        System.out.println(e.paocad.get(0).VenderPao(1));
        
        // Codigo que mostra os objetos cadastrados
        Iterator it = e.paocad.iterator();
        while (it.hasNext()) {
            Pao a;
            a = (Pao) it.next();
            System.out.println(a.getClasse());
        }
    }
}
