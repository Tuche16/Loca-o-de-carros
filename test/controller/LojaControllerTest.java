package controller;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Pedro
 */
public class LojaControllerTest {
    
    private LojaController lojaController;
    
    public LojaControllerTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        lojaController = new LojaController();
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testCompararLojas() {
        
        assertArrayEquals(new String[]{"NorthCar","NAVIGATOR","1180"}, lojaController.compararLojas("Premium", 6, new String[]
                {"01Set2009 (sab)", "02Set2009 (dom)"})); //carro disponível para terceira loja
        assertArrayEquals(new String[]{"Não há carros disponíveis","Não há carros disponíveis","Não há carros disponíveis"}, lojaController.compararLojas("Premium", 6, new String[]
                {"01Set2009 (sab)", "02Set2009 (dom)"})); //mesma entrada e carro indisponível para a terceira loja
        
        
    }
    
}
