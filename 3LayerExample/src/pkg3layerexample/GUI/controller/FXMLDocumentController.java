/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg3layerexample.GUI.controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import pkg3layerexample.bll.TextConverter;

/**
 *
 * @author jeppjleemoritzled
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Button button;
    @FXML
    private Label lblOutput;
    @FXML
    private TextField txtInput;
    
    private TextConverter textConverter;
    
    @FXML
    private void handleButtonAction(ActionEvent event) {
        System.out.println("You clicked me!");
        String input = txtInput.getText();
        lblOutput.setText(textConverter.lavUpDown(input));
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        textConverter = new TextConverter();
    }    
    
}
