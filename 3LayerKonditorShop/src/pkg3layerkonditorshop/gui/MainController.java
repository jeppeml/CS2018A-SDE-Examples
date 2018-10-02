/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg3layerkonditorshop.gui;

import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import pkg3layerkonditorshop.be.Produkt;
import pkg3layerkonditorshop.bll.BllManager;

/**
 *
 * @author jeppjleemoritzled
 */
public class MainController implements Initializable {
    
    
    @FXML
    private TextField txtAntal;
    @FXML
    private ListView<Produkt> lstVarer;
    
    BllManager bll = new BllManager();
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
       List<Produkt> prods = bll.getAllProdukts();
       lstVarer.getItems().addAll(prods);
    }    

    @FXML
    private void pressBuyButton(ActionEvent event) {
    }
    
}
