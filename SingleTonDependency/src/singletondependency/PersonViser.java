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
public class PersonViser {
    public void printPerson(){
        System.out.println("Navn: " + Person.getInstance().getName());
    }
}
