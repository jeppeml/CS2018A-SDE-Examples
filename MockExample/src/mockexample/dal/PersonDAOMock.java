/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mockexample.dal;

import java.util.ArrayList;
import java.util.List;
import mockexample.be.Person;

/**
 *
 * @author jeppjleemoritzled
 */
public class PersonDAOMock implements PersonDaoInterface{

    @Override
    public List<Person> getAllPersons() {
        List<Person> persons = new ArrayList();
        Person per = new Person();
        per.setName("Per");
        per.setCpr("120379-5645");
        
        Person birge = new Person();
        birge.setName("Birge");
        birge.setCpr("050389-1755");
        
        persons.add(per);
        persons.add(birge);
        return persons;
    }
    
}
