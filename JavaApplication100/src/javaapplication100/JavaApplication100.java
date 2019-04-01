/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication100;

/**
 *
 * @author jeppjleemoritzled
 */
public class JavaApplication100 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        myMethod(1);
    }
    
    public static void myMethod(int counter){
        System.out.println("Rhello!");
        if (counter<4)
            myMethod(++counter);
    }
    
}
