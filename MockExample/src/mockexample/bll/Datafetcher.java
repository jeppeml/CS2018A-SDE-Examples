/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mockexample.bll;

import java.util.List;
import mockexample.be.Person;

/**
 *
 * @author jeppjleemoritzled
 */
public interface Datafetcher {
    public List<Person> getAllPersons();
}
