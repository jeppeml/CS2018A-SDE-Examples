/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mockexample;

import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Platform;
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
    private void handleButtonAction(ActionEvent event)  {
        Thread t = new Thread(()->{
            try {
                Thread.sleep(10_000);
                Platform.runLater(()->{
                    persons.clear();
                    persons.addAll(df.getAllPersons());
                });
                
            }
            catch (InterruptedException ex) {
                Logger.getLogger(MainController.class.getName()).log(Level.SEVERE, null, ex);
            }
            System.out.println("Færdig arbejde");
        });
        t.start();
        
        label.setText("Hello World!");
        
        
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        lstPersons.setItems(persons);
        Person p = new Person();
        label.textProperty().bindBidirectional(p.nameProperty());
    }    
    
}
