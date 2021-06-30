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
        e.CadastrarProduto(10, "FANTAUVA", 0.40f, "BEBIDA");
        e.CadastrarProduto(20, "FANTAMORANGO", 0.50f, "BEBIDA");
        //e.AdicionarProdutoAoEstoque("FANTALARANJA", 10);
        e.AdicionarProdutoAoEstoque("COCACOLA", 20);
        //e.CadastrarVenda("FANTALARANJA", 10, 25);
        e.CadastrarVenda("COCACOLA", 10, 35);
        //System.out.println(e.bebidaestoque.get(2).getQuantidade());
        //System.out.println(e.bebidaestoque.get(3).getQuantidade());
        //System.out.println(e.getCaixa());
        
        // Codigo que mostra os objetos cadastrados
        /*Iterator it = e.bebidaestoque.iterator();
        while (it.hasNext()) {
        Bebida a;
        a = (Bebida) it.next();
        System.out.println(a.getClasse());
        }*/
        //e.AdicionarProdutoAoEstoque("COCACOLA", 10);
        //System.out.println(e.bebidaestoque.get(0).VenderBebida(2, 7));
    }
}
