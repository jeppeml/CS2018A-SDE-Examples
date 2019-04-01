/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iteratorexample;

import java.util.Iterator;

/**
 *
 * @author jeppjleemoritzled
 */
public class IteratorExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BarbedWireCollection bwc = new BarbedWireCollection();
        Iterator iter = bwc.iterator();
        
        for (Object wire : bwc) {
            System.out.println(wire);
        }
        
        while(iter.hasNext())
        {
            System.out.println(iter.next());
        }
    }
    
}
