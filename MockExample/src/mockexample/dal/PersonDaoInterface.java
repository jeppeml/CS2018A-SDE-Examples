/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mockexample.dal;

import java.util.List;
import mockexample.be.Person;

/**
 *
 * @author jeppjleemoritzled
 */
public interface PersonDaoInterface {
    public List<Person> getAllPersons();
}
