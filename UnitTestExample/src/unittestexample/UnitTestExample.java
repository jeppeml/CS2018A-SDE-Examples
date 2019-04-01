/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unittestexample;

/**
 *
 * @author jeppjleemoritzled
 */
public class UnitTestExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        StringFormatter sf = new StringFormatter();
        String s = "this is my text kdfn sdf sef seg seg seg";
        System.out.println("s before: " + s);
        s = sf.doUpperCase(s);
        System.out.println("s after: " + s);
    }
    
}
