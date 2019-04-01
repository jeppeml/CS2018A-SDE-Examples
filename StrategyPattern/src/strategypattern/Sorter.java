/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategypattern;

/**
 *
 * @author jeppjleemoritzled
 */
public class Sorter {
    private SortMethod method = new RetardSort();
    public Sorter() {
        
    }

    public void setMethod(SortMethod method) {
        this.method = method;
    }
    
    public int[] sort(int[] unsorted){
        return method.sort(unsorted);
    }
    
    
    
}
