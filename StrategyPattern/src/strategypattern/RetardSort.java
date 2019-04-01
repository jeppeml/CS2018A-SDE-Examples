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
public class RetardSort implements SortMethod{

    @Override
    public int[] sort(int[] unsorted) {
        int[] shuffled= shuffle(unsorted);
        while(!isSorted(shuffled))
        {
            shuffled= shuffle(unsorted);
        }
        return shuffled;
    }
    
    public boolean isSorted(int[] array){
        for (int i = 0; i < array.length-1; i++) {
            if(array[i]>array[i+1]){
                return false;
            }
        }
        return true;
    }
    
    public int[] shuffle(int[] unsorted)
    {
        int[] shuffled = new int[unsorted.length];
        for (int i = 0; i < unsorted.length; i++) {
            shuffled[i] = unsorted[i];
        }
        Random r = new Random();
        for (int i = 0; i < shuffled.length*100; i++) {
            int rand1 = r.nextInt(shuffled.length);
            int rand2 = r.nextInt(shuffled.length);
            int temp = shuffled[rand1];
            shuffled[rand1] = shuffled[rand2];
            shuffled[rand2] = temp;
            
            
        }
        return shuffled;
    }
    
}
