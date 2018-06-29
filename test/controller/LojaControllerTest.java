/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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

    /**
     * Test of compararLojas method, of class LojaController.
     */
    @Test
    public void testCompararLojas() {
        assertArrayEquals(new String[]{"NorthCar","NAVIGATOR","1180"}, lojaController.compararLojas("Premium", 6, new String[]
                {"01Set2009 (sab)", "02Set2009 (dom)"}));
    }
    
}
