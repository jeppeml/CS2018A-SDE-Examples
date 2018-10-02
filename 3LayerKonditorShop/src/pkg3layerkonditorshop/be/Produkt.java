/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg3layerkonditorshop.be;

import java.util.List;

/**
 *
 * @author jeppjleemoritzled
 */
public class Produkt {

    private double salgsPris;
    private double kostPris;
    private int popularitet;
    private String navn;
    private List<Ingrediens> ingredienser;

    public Produkt() {
    }

    public Produkt(String navn, double salgsPris, double kostPris, int popularitet) {
        this.salgsPris = salgsPris;
        this.kostPris = kostPris;
        this.popularitet = popularitet;
        this.navn = navn;
    }

    public List<Ingrediens> getIngredienser() {
        
        return ingredienser;
    }

    public void setIngredienser(List<Ingrediens> ingredienser) {
        this.ingredienser = ingredienser;
    }

    public String getNavn() {
        return navn;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }

    public int getPopularitet() {
        return popularitet;
    }

    public void setPopularitet(int popularitet) {
        this.popularitet = popularitet;
    }

    public double getKostPris() {
        return kostPris;
    }

    public void setKostPris(double kostPris) {
        this.kostPris = kostPris;
    }

    public double getSalgsPris() {
        return salgsPris;
    }

    public void setSalgsPris(double salgsPris) {
        this.salgsPris = salgsPris;
    }

    @Override
    public String toString() {
        return navn + " pris: " + salgsPris + "$";
    }

    
}
