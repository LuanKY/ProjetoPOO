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
        
        /*
        System.out.println(e.AdicionarProdutoAoEstoque("SUCODELARANJA", 10));
        e.CadastrarVenda("SUCODELARANJA", 2, 7, 0.5f);
        System.out.println(e.getBebida().getQuantidade());
        System.out.println(e.getCaixa());*/
        
        Estoque e = new Estoque();
        // TESTE ESTOQUE
        e.AdicionarProdutoAoEstoque("PAOJACO", 20);
        e.AdicionarProdutoAoEstoque("PAODEFORMA", 20);
        e.AdicionarProdutoAoEstoque("SUCODEGOIABA", 20);
        e.AdicionarProdutoAoEstoque("SUCODELARANJA", 20);
        e.AdicionarProdutoAoEstoque("PAOCOCADA", 20);
        e.AdicionarProdutoAoEstoque("FANTALARANJA", 20);
        e.CadastrarVenda("FANTALARANJA", 10, 25);
        System.out.println(e.getCaixa());
        e.CadastrarVenda("PAOJACO", 10, 2.5f);
        System.out.println(e.getCaixa());
        e.CadastrarVenda("PAOJACO", 10, 2.5f);
        System.out.println(e.getCaixa());
        e.CadastrarVenda("PAODEFORMA", 10, 50);
        System.out.println(e.getCaixa());
        e.CadastrarVenda("SUCODEGOIABA", 2, 7, 0.5f);
        System.out.println(e.getCaixa());
        e.CadastrarVenda("SUCODELARANJA", 3, 7.5f, 0.3f);
        System.out.println(e.getCaixa());
        e.CadastrarVenda(10, 6, true);
        System.out.println(e.getCaixa());
        e.CadastrarVenda(10, 5, false);
        System.out.println(e.getCaixa());
        
        e.CadastrarProduto(10, "FANTAUVA", 3, "BEBIDA");
        e.CadastrarProduto(13, "GROZELIA", 4, "BEBIDA");
        e.CadastrarProduto(32, "CAFE", 2, "BEBIDA");
        e.CadastrarProduto(12, "NESCAU", 1.5F, "BEBIDA");
        System.out.println(e.ListarVendas());
        
        CoCaCola c1 = new CoCaCola(10);
        System.out.println(c1.VenderBebida(3, 11));
        System.out.println(c1.getQuantidade());
        System.out.println(c1.VenderBebida(3, 10.5f));
        System.out.println(c1.getQuantidade());
        System.out.println(c1.VenderBebida(3, 10));
        System.out.println(c1.getQuantidade());
        System.out.println(c1.VenderBebida(0.5f));
        System.out.println(c1.getQuantidade());
        System.out.println(c1.VenderBebida(3, 11));
        /*e.bebidanovo.get(0).setQuantidade(0);
        e.bebidanovo.get(1).setQuantidade(0);
        System.out.println(e.ListarProdutosEmEstoque());
        System.out.println(e.ListarProdutosForaEstoque());
        System.out.println(e.ListarProdutosCategoria("BEBIDA"));
        e.ExcluirProduto("CAFE", "BEBIDA");
        e.ExcluirProduto("NESCAU", "BEBIDA");
        System.out.println(e.ListarProdutosCategoria("BEBIDA"));*/
        
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
