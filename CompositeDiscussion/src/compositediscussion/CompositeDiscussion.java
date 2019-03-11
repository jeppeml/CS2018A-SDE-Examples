/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compositediscussion;

/**
 *
 * @author jeppjleemoritzled
 */
public class CompositeDiscussion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Post post = new Post("Hej, min første besked");
        Post sub = new Post("Underbesked til første besked");
        post.addPost(sub);
        Post subsub = new Post("under under besked 1");
        Post subsubsub = new Post("under under under besked 42");
        subsub.addPost(subsubsub);
        sub.addPost(subsub);
        sub.addPost(new Post("under under besked 2"));
        subsub.print();
    }
    
}
