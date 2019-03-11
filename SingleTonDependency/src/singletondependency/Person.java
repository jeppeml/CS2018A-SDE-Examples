/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singletondependency;

/**
 *
 * @author jeppjleemoritzled
 */
public class Person {
    
    private static Person p=null;

    private Person() {
    }
    
    public static Person getInstance(){
        if(p==null)
            p=new Person();
        
        return p;
    }
    
    
    private String name;

    /**
     * Get the value of name
     *
     * @return the value of name
     */
    public String getName() {
        return name;
    }

    /**
     * Set the value of name
     *
     * @param name new value of name
     */
    public void setName(String name) {
        this.name = name;
    }

}
