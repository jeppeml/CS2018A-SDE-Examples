/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg3layerkonditorshop.dal;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import pkg3layerkonditorshop.be.*;
/**
 *
 * @author Jeppe
 */
public class FileManager {

    private static FileManager instance;
    
    public static FileManager getInstance(){
        if (instance==null)
            instance = new FileManager();
        return instance;
    }
    
    private FileManager()
    {
    }
    
    public List<Produkt> getAllProducts() 
    {
        try {
            Map<Integer, Produkt> productList = readAllProducts();
            List<Produkt> pList = readFillProductsWithIngredients(productList);
            return pList;
        } 
        catch (IOException ioe) {
            Logger.getLogger(FileManager.class.getName()).log(Level.SEVERE, null, ioe);
            System.err.println("IO exception in FileManager: Returning null!" + ioe);
            return null;
        }
        
    }
    private List<Produkt> readFillProductsWithIngredients(Map<Integer, Produkt> productList) throws IOException
    {
        try (BufferedReader CSVFile = new BufferedReader(new FileReader("mock_files/MOCK_DATA - Ingrediens.csv"))) 
        {
            String dataRow = CSVFile.readLine();
            dataRow = CSVFile.readLine(); // Skip header
            while (dataRow != null) {
                String[] dataArray = dataRow.split(",");
                if(dataArray.length==3)
                {
                    int fk_produkt = Integer.parseInt(dataArray[2]);
                    Produkt produkt = productList.get(fk_produkt);
                    if (produkt!=null)
                    produkt.getIngredienser().add(
                            new Ingrediens(
                                dataArray[0],
                                Double.parseDouble(dataArray[1])
                            )
                    );
                }
                dataRow = CSVFile.readLine(); // Read next line of productList.
            }
        }
        catch(IOException ioe)
        {
            throw ioe;
        }
        return new ArrayList(productList.values());
    }
    private Map<Integer, Produkt> readAllProducts() throws IOException
    {
        HashMap<Integer, Produkt> productList = new HashMap();
        try (BufferedReader CSVFile = new BufferedReader(new FileReader("mock_files/MOCK_DATA - Produkt.csv"))) 
        {
            String dataRow = CSVFile.readLine();
            dataRow = CSVFile.readLine(); // Skip header
            while (dataRow != null) {
                String[] dataArray = dataRow.split(",");
                if(dataArray.length==5)
                productList.put(Integer.parseInt(dataArray[0]), new Produkt(
                            dataArray[1],
                            Double.parseDouble(dataArray[4]),
                            Double.parseDouble(dataArray[2]),
                            Integer.parseInt(dataArray[3])
                        )
                );
                dataRow = CSVFile.readLine(); // Read next line of productList.
            }
        }
        catch(IOException ioe)
        {
            throw ioe;
        }
        return productList;
    }
}