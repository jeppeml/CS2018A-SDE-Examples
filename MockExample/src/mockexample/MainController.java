/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mockexample;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import mockexample.be.Person;
import mockexample.bll.BllManagerMock;
import mockexample.bll.Datafetcher;

/**
 *
 * @author jeppjleemoritzled
 */
public class MainController implements Initializable {
    
    @FXML
    private Label label;
    @FXML
    private Button button;
    @FXML
    private ListView<Person> lstPersons;
    
    ObservableList<Person> persons = FXCollections.observableArrayList();
    Datafetcher df = new BllManagerMock();
    
    
    @FXML
    private void handleButtonAction(ActionEvent event) {
        System.out.println("You clicked me!");
        label.setText("Hello World!");
        persons.clear();
        persons.addAll(df.getAllPersons());
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        lstPersons.setItems(persons);
    }    
    
}
