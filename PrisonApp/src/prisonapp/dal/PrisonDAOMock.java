/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prisonapp.dal;

import java.util.ArrayList;
import java.util.List;
import prisonapp.BE.*;

/**
 *
 * @author jeppjleemoritzled
 */
public class PrisonDAOMock implements PrisonDAO {
    @Override
    public List<Ansat> getAnsatte()
    {
        List<Ansat> ansatte = new ArrayList();
        Ansat ansat = new Ansat("210145-2342", "Petergine Steganosis");
        ansatte.add(ansat);
        return ansatte;
    }
    
    @Override
    public List<Indsat> getIndsatte()
    {
        List<Indsat> indsatte = new ArrayList();
        Indsat a = new Indsat("230450-1765", "Piotre Stegre");
        Indsat b = new Indsat("170988-4321", "Pierre Steegher");
        indsatte.add(a);
        indsatte.add(b);
        return indsatte;
    }
    
    @Override
    public List<Fængsel> getFængsler()
    {
        List<Fængsel> fængsler = new ArrayList();
        
        Fængsel fængsel = new Fængsel();
        List<Ansat> ansatte = getAnsatte();
        for (Ansat a : ansatte) {
            fængsel.addAnsat(a);
        }
        
        List<Indsat> indsatte = getIndsatte();
        for (Indsat indsat : indsatte) {
            fængsel.addIndsat(indsat);
        }
        
        fængsler.add(fængsel);
        return fængsler;
    }
}
