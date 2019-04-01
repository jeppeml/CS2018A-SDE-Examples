/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unittestexample;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author jeppjleemoritzled
 */
public class StringFormatterTest {
    
    public StringFormatterTest() {
    }

    /**
     * Test of doUpperCase method, of class StringFormatter.
     */
    @Test
    public void testDoUpperCaseLatin() {
        String someString = "this is my text kdfn sdf sef seg seg seg";
        StringFormatter instance = new StringFormatter();
        String expResult = "THIS IS MY TEXT KDFN SDF SEF SEG SEG SEG";
        String result = instance.doUpperCase(someString);
        assertEquals(expResult, result);
    }
    
    @Test
    public void testDoUpperCaseForeign() {
        String someString = "æøå éè";
        StringFormatter instance = new StringFormatter();
        String expResult = "ÆØÅ ÉÈ";
        String result = instance.doUpperCase(someString);
        assertEquals(expResult, result);
    }
    
}
