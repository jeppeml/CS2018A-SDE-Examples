/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prisonapp;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import prisonapp.BE.*;
import prisonapp.dal.*;

/**
 *
 * @author jeppjleemoritzled
 */
public class PrisonModel {
    private ObservableList<Fængsel> fængsler;
    private Fængsel valgtFængsel;
    private ObservableList<Ansat> valgteAnsatte;
    private ObservableList<Indsat> valgteIndsatte;
    
    
    
    public PrisonModel() {
        PrisonDAO pdao = new PrisonDAOMock();
        fængsler = FXCollections.observableArrayList(pdao.getFængsler()); // henter første fængsel
        valgtFængsel = fængsler.get(0);
        valgteAnsatte = FXCollections.observableArrayList(valgtFængsel.getAnsatte());
        valgteIndsatte = FXCollections.observableArrayList(valgtFængsel.getIndsatte());
    }

    public ObservableList<Ansat> getValgteAnsatte() {
        return valgteAnsatte;
    }
    
    public void tilføjAnsat()
    {
        Ansat peter = new Ansat("241200-0666", "Peter Stegger");
        valgteAnsatte.add(peter);
    }
    
    
}
