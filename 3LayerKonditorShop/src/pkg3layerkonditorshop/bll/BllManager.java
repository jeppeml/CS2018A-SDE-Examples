/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg3layerkonditorshop.bll;

import java.util.List;
import pkg3layerkonditorshop.be.Produkt;
import pkg3layerkonditorshop.dal.*;

/**
 *
 * @author jeppjleemoritzled
 */
public class BllManager {
    DalManager dalManager = new MockFileData();
    
    double avance = 350;
    
    public List<Produkt> getAllProdukts()
    {
        List<Produkt> pList = dalManager.getAllProdukts();
        
        for (Produkt produkt : pList) {
            produkt.setSalgsPris(
                    beregnSalgsPris(produkt.getKostPris()));
        }
        return pList;
    }
    
    private double beregnSalgsPris(double kostPris)
    {
        return Math.round((kostPris/100*avance)*100)/100.0;
    }
}
