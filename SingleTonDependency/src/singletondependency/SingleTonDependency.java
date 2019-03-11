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
public class SingleTonDependency {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Shared singleton
        PersonViser pv = new PersonViser();
        Person.getInstance().setName("Piotr Stegonovskij");
        pv.printPerson();
        
        // Shared by dependency injection
        Dyr d = new Dyr();
        d.setName("Peter Pedal Stegger");
        DyrViser dv = new DyrViser(d);
        dv.printDyr();
    }
    
}
