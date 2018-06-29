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
        assertArrayEquals(new String[]{"SouthCar","COMPACTO","630"}, lojaController.compararLojas("Normal", 1, new String[]
                {"16Mar2009 (seg)", "17Mar2009 (ter)", "18Mar2009 (qua)"})); //carro alocado para primeira loja
        
        assertArrayEquals(new String[]{"WestCar","FERRARI","1590"}, lojaController.compararLojas("Normal", 1, new String[]
                {"16Mar2009 (seg)", "17Mar2009 (ter)", "18Mar2009 (qua)"})); //carro alocado para segunda loja
        
        assertArrayEquals(new String[]{"NorthCar","NAVIGATOR","1180"}, lojaController.compararLojas("Premium", 6, new String[]
                {"01Set2009 (sab)", "02Set2009 (dom)"})); //carro alocado para terceira loja
               
        //todos carros foram alocados
        assertArrayEquals(new String[]{"Não há carros disponíveis","Não há carros disponíveis","Não há carros disponíveis"}, 
                lojaController.compararLojas("Normal", 1, new String[]{"16Mar2009 (seg)", "17Mar2009 (ter)", "18Mar2009 (qua)"}));

    }
    
}
