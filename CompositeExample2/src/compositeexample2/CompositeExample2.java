/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compositeexample2;

/**
 *
 * @author jeppjleemoritzled
 */
public class CompositeExample2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Genre gRoot = new Genre("Root");
        gRoot.addChild(
                new Genre("Action").addChild(
                        new Genre("Romance")).addChild(
                            new Movie("My little pony")));
        gRoot.addChild(
                new Genre("Romance").addChild(
                new Genre("Comedy").addChild(
                        new Movie("Mortal Kombat"))));
        
        gRoot.addChild(
                new Genre("Romance").addChild(new Movie ("Godfather II")), 
                new Genre("Action"), 
                new Genre("Comedy"));
        gRoot.print();
        
    }
    
}
