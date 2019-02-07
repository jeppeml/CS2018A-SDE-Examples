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
        Ansat ansat1 = new Ansat("3938452-3345", "Jørgen Jørgensen");
        Ansat ansat2 = new Ansat("2344525-3456", "Peter Petersen");
        Ansat ansat3 = new Ansat("7736846-3245", "Jens Jensen");
        
        ansatte.add(ansat);
        ansatte.add(ansat1);
        ansatte.add(ansat2);
        ansatte.add(ansat3);
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
