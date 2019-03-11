/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singletondependency;

/**
 *
 * @author jeppjleemoritzled
 */
public class DyrViser {
    private Dyr d;

    public DyrViser(Dyr d) {
        this.d = d;
    }
    
    public void printDyr(){
        System.out.println("Navn på dyr: " + d.getName());
    }
}
