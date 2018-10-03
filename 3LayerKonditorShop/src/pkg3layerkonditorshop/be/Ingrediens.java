/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg3layerkonditorshop.be;

/**
 *
 * @author jeppjleemoritzled
 */
public class Ingrediens {
    
    private String navn;

    private double mængde;

    public Ingrediens(String navn, double mængde) {
        this.navn = navn;
        this.mængde = mængde;
    }

    public double getMængde() {
        return mængde;
    }

    public void setMængde(double mængde) {
        this.mængde = mængde;
    }

    public String getNavn() {
        return navn;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }

}
