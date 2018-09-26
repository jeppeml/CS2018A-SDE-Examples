/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxstart.GUI.View;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;

/**
 * FXML Controller class
 *
 * @author jeppjleemoritzled
 */
public class SjovController implements Initializable {

    @FXML
    private Button minknap;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void clickButton(MouseEvent event) {
        minknap.setText("Det virkede :))");
        
        minknap.layoutXProperty().set(Math.random()*300);
        minknap.layoutYProperty().set(Math.random()*300);
    }
    
}
