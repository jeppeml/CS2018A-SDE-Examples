/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prisonapp.BE;

/**
 *
 * @author jeppjleemoritzled
 */
public abstract class Person {
    private String cpr;
    private String navn;

    public Person(String cpr, String navn) {
        this.cpr = cpr;
        this.navn = navn;
    }
    
    public String getCpr() {
        return cpr;
    }

    public String getNavn() {
        return navn;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }
    
    
}
