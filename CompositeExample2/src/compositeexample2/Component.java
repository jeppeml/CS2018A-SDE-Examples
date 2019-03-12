/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compositeexample2;

/**
 *
 * @author jeppjleemoritzled
 */
public abstract class Component {
    protected String name;
    protected Component parent;

    public Component getParent() {
        return parent;
    }
    
    public abstract String getName();
    public void setName(String name){
        this.name = name;
    }
    
    public void setParent(Component parent){
        this.parent = parent;
    }
    
    public abstract void print();

    
}
