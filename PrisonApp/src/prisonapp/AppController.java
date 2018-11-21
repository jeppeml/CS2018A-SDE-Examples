/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prisonapp;

import java.net.URL;
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
    
    PrisonModel model = new PrisonModel();
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        listAnsatte.setItems(model.getValgteAnsatte());
    }    

    
    @FXML
    private void clickFængsler(ActionEvent event) {
        
    }

    @FXML
    private void clickIndsæt(ActionEvent event) {
        
        model.tilføjAnsat();
    }
    
}
