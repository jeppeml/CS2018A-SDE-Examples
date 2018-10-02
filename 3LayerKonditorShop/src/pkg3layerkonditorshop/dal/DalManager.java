/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg3layerkonditorshop.dal;

import java.util.ArrayList;
import java.util.List;
import pkg3layerkonditorshop.be.Produkt;

/**
 *
 * @author jeppjleemoritzled
 */
public class DalManager {
    public List<Produkt> getAllProdukts()
    {
        ArrayList<Produkt> pList = new ArrayList();
        
        Produkt flødeKage = new Produkt();
        flødeKage.setKostPris(3.6);
        flødeKage.setSalgsPris(24.0);
        flødeKage.setPopularitet(5);
        flødeKage.setNavn("Flødekage formet som Stegger");
        
        Produkt marcipanGlistrup = new Produkt();
        marcipanGlistrup.setKostPris(4.5);
        marcipanGlistrup.setSalgsPris(17.0);
        marcipanGlistrup.setPopularitet(3);
        marcipanGlistrup.setNavn("Marcinpangris á la Glistrup");
        
        Produkt jordbærKage = new Produkt("Jordbærkage",55.0,24.0,5);
        
        pList.add(marcipanGlistrup);
        pList.add(flødeKage);
        pList.add(jordbærKage);
        return pList;
    }
}
