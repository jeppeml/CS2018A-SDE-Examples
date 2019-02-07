/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mockexample.bll;

import mockexample.dal.PersonDAOMock;
import java.util.List;
import mockexample.be.Person;
import mockexample.dal.*;

/**
 *
 * @author jeppjleemoritzled
 */
public class BllManagerMock implements Datafetcher{
    PersonDaoInterface personDao = new PersonDAOMock();
    @Override
    public List<Person> getAllPersons() {
        return personDao.getAllPersons();
    }
    
}
