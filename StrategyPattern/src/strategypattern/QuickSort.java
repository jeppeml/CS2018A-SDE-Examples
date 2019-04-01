/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategypattern;

import java.util.Arrays;

/**
 *
 * @author jeppjleemoritzled
 */
public class QuickSort implements SortMethod{

    @Override
    public int[] sort(int[] unsorted) {
        Arrays.sort(unsorted);
        return unsorted;
    }
    
}
