/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mockexample.be;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

/**
 *
 * @author jeppjleemoritzled
 */
public class Person {

    public Person() {
    }
    
    private final StringProperty cpr = new SimpleStringProperty();
    private final StringProperty name = new SimpleStringProperty();

    public String getName() {
        return name.get();
    }

    public void setName(String value) {
        name.set(value);
    }

    public StringProperty nameProperty() {
        return name;
    }

   
    
    public String getCpr() {
        return cpr.get();
    }

    public void setCpr(String value) {
        cpr.set(value);
    }

    public StringProperty cprProperty() {
        return cpr;
    }

    @Override
    public String toString() {
        return cpr.get() + ": " + name.get();
    }
    
}
