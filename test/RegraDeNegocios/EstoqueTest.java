package RegraDeNegocios;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class EstoqueTest {
    private Estoque e;
    
    public EstoqueTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        e = new Estoque();
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testAdicionarProdutoAoEstoque() {
        assertEquals("10 unidade(s) de PAOJACO foram adicionado(s) ao Estoque",e.AdicionarProdutoAoEstoque("PAOJACO", 10));
    }

    @Test
    public void testListarProdutosEmEstoque() {
        e.AdicionarProdutoAoEstoque("PAOJACO", 10);
        assertEquals("PAOJACO, ",e.ListarProdutosEmEstoque());
    }

    @Test
    public void testListarProdutosCadastrados() {
        e.CadastrarProduto(10, "PAODECHOCOLATE", 2, "PAO");
        assertEquals("COCACOLA, SPRITE, FANTALARANJA, SUCODELARANJA, SUCODEGOIABA,"
                + " \nPAOJACO, PAOCOCADA, PAOCARTEIRA, PAODEFORMA, PAOCILINDRO,"
                + " \nBEIJINHO, BRIGADEIRO, SONHODEGOIABADA, TARTILETE, COCADA,"
                + " \nKIBE, PASTELDEQUEIJO, PAODEQUEIJO, EMPADADEFRANGO, COXINHADEFRANGO, PAODECHOCOLATE, ",e.ListarProdutosCadastrados());
    }

    @Test
    public void testListarProdutosForaEstoque() {
        e.AdicionarProdutoAoEstoque("PAOJACO", 0);
        e.AdicionarProdutoAoEstoque("COCACOLA", 0);
        assertEquals("COCACOLA, PAOJACO, ",e.ListarProdutosForaEstoque());
    }

    @Test
    public void testListarProdutosCategoria() {
        assertEquals("COCACOLA, SPRITE, FANTALARANJA, SUCODELARANJA, SUCODEGOIABA, ",e.ListarProdutosCategoria("BEBIDA"));
        assertEquals("PAOJACO, PAOCOCADA, PAOCARTEIRA, PAODEFORMA, PAOCILINDRO, ",e.ListarProdutosCategoria("PAO"));
        assertEquals("KIBE, PASTELDEQUEIJO, PAODEQUEIJO, EMPADADEFRANGO, COXINHADEFRANGO, ",e.ListarProdutosCategoria("SALGADO"));
        assertEquals("BEIJINHO, BRIGADEIRO, SONHODEGOIABADA, TARTILETE, COCADA, ",e.ListarProdutosCategoria("DOCE"));
    }

    @Test
    public void testListarVendas() {
        e.AdicionarProdutoAoEstoque("PAOJACO", 10);
        e.CadastrarVenda("PAOJACO", 10, 2.5f);
        assertEquals(e.vendas,e.ListarVendas());
    }
    
}
