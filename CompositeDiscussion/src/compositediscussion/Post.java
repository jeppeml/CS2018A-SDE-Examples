/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compositediscussion;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jeppjleemoritzled
 */
public class Post {
    
    private String message;
    private List<Post> subPosts = new ArrayList();

    public void addPost(Post p){
        subPosts.add(p);
    }
    
    public Post(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
    
    public void print(){
        System.out.print("-> " + getMessage());
        for (Post subPost : subPosts) {
            
            subPost.print();
        }
        System.out.println("");
    }
    

    
}
