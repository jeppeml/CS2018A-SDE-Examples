/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategypattern;

import java.util.Random;

/**
 *
 * @author jeppjleemoritzled
 */
public class StrategyPattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Sorter sorter = new Sorter();
        int[] someArray = new int[10];
        Random r = new Random();
        
        for (int i = 0; i < someArray.length; i++) {
            someArray[i] = r.nextInt(100);
        }
        
        System.out.println("Array unsorted:");
        for (int i = 0; i < someArray.length; i++) {
            System.out.print(someArray[i] + ", ");
        }
        
        //sorter.setMethod(new QuickSort());
        int[] sorted = sorter.sort(someArray);
        
        System.out.println("Array sorted:");
        for (int i = 0; i < sorted.length; i++) {
            System.out.print(sorted[i] + ", ");
        }
               
    }
    
}
