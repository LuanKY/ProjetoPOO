package RegraDeNegocios;
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
        SucoDeLaranja b = new SucoDeLaranja(10);
        b.setTamanho('g');
        System.out.println(b.VenderBebida(2, 7));
        b.setTamanho('p');
        System.out.println(b.VenderBebida(2, 5));
        b.setTamanho('M');
        System.out.println(b.VenderBebida(2, 6));
        System.out.println(b.getQuantidade()); */
        
        Estoque e = new Estoque();
        System.out.println(e.AdicionarProdutoAoEstoque("SPRITE", 10));
        System.out.println(e.getBebida().VenderBebida(2, 7));
        System.out.println(e.getBebida());
    }
}
