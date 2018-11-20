/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prisonapp;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import prisonapp.BE.*;

/**
 *
 * @author jeppjleemoritzled
 */
public class AppController implements Initializable {

    @FXML
    private ComboBox<Fængsel> dropdownFængsler;
    @FXML
    private ListView<Indsat> listIndsatte;
    @FXML
    private ListView<Ansat> listAnsatte;
    @FXML
    private TextArea txtOplysninger;
    @FXML
    private TextArea txtHemmelig;
    @FXML
    private Label lblIndsat;
    @FXML
    private Label lblFri;
    
    ArrayList<Fængsel> fængsler = new ArrayList();
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        createData();
    }    

    private void createData()
    {
        Fængsel fængsel = new Fængsel();
        
        Indsat a = new Indsat("230450-1765", "Piotre Stegre");
        Indsat b = new Indsat("170988-4321", "Pierre Steegher");
        
        fængsel.addIndsat(a);
        fængsel.addIndsat(b);
        
        Ansat ansat = new Ansat("210145-2342", "Petergine Steganosis");
        fængsel.addAnsat(ansat);
        
        listIndsatte.getItems().addAll(fængsel.getIndsatte());
        listAnsatte.getItems().addAll(fængsel.getAnsatte());
    }
    
    @FXML
    private void clickFængsler(ActionEvent event) {
    }
    
}
