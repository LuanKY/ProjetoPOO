package RegraDeNegocios;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class CoCaColaTest {
    private CoCaCola c;
    
    public CoCaColaTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        c = new CoCaCola(10);
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testVenderBebida() {
        assertEquals("A Compra foi realizada com sucesso, seu troco é de 0.5", c.VenderBebida(3, 11));
        assertEquals("A Compra foi realizada com sucesso", c.VenderBebida(3, 10.5f));
        assertEquals("A Compra não pode ser realizada, faltou R$0.5", c.VenderBebida(3, 10));
        assertEquals("A Compra foi realizada com sucesso", c.VenderBebida(0.5f));
        assertEquals("A Compra não pode ser realizada, pois só há 1.0 CoCaCola no estoque", c.VenderBebida(3, 11));
    }
    
}
