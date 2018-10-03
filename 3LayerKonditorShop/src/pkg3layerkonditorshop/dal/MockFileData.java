/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg3layerkonditorshop.dal;

import java.util.List;
import pkg3layerkonditorshop.be.Produkt;

/**
 *
 * @author jeppjleemoritzled
 */
public class MockFileData implements DalManager{

    @Override
    public List<Produkt> getAllProdukts() {
        return FileManager.getInstance().getAllProducts();
    }
    
}
