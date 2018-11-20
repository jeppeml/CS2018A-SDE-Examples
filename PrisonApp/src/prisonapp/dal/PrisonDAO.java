/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prisonapp.dal;

import java.util.List;
import prisonapp.BE.*;

/**
 *
 * @author jeppjleemoritzled
 */
public interface PrisonDAO {

    List<Ansat> getAnsatte();

    List<Fængsel> getFængsler();

    List<Indsat> getIndsatte();
    
}
