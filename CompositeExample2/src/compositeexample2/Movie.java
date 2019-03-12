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
public class Movie extends Component{
    
    private String getPath;

    public Movie(String name) {
        this.name = name;
    }

    public String getGetPath() {
        return getPath;
    }

    public void setGetPath(String getPath) {
        this.getPath = getPath;
    }

    @Override
    public String getName() {
        return "Movie: " + name;
    }

    @Override
    public void print() {
        System.out.println(getName());
    }

}
