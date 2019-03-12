/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compositeexample2;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jeppjleemoritzled
 */
public class Genre extends Component{
    private List<Component> children;

    public Genre(String name) {
        this.name = name;
        children = new ArrayList();
    }
    /*public Genre addChild(Component c){
        c.setParent(this);
        children.add(c);
        return this;
    }*/
    
    public Genre addChild(Component... c){
        for (Component component : c) {
            component.setParent(this);
            children.add(component);
        }
        
        return this;
    }
    public void removeChild(Component c){
        children.remove(c);
        c.setParent(null);
    }

    @Override
    public String getName() {
        return "Genre: " + name;
    }

    @Override
    public void print() {
        System.out.println(getName());
        for (Component component : children) {
            component.print();
        }
    }
    
}
