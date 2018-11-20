/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prisonapp.BE;

import java.util.ArrayList;

/**
 *
 * @author jeppjleemoritzled
 */
public class Fængsel {
    private ArrayList<Ansat> ansatte = new ArrayList();
    private ArrayList<Indsat> indsatte = new ArrayList();

    public void addAnsat(Ansat a){
        ansatte.add(a);
    }
    
    public void addIndsat(Indsat i){
        indsatte.add(i);
    }
    
    public ArrayList<Ansat> getAnsatte() {
        return ansatte;
    }

    public ArrayList<Indsat> getIndsatte() {
        return indsatte;
    }
    
    
    
}
