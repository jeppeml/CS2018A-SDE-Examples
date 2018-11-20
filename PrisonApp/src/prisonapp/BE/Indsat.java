/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prisonapp.BE;

/**
 *
 * @author jeppjleemoritzled
 */
public class Indsat extends Person{
    private String oplysninger = "";
    private String hemmeligeOplysninger = "";
    
    public Indsat(String cpr, String navn)
    {
        super(cpr,navn);
    }

    public String getOplysninger() {
        return oplysninger;
    }

    public void setOplysninger(String oplysninger) {
        this.oplysninger = oplysninger;
    }

    public String getHemmeligeOplysninger() {
        return hemmeligeOplysninger;
    }

    public void setHemmeligeOplysninger(String hemmeligeOplysninger) {
        this.hemmeligeOplysninger = hemmeligeOplysninger;
    }
    
    
    
    
}
