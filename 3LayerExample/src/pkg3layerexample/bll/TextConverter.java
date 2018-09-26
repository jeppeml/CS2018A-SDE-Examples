/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg3layerexample.bll;

/**
 *
 * @author jeppjleemoritzled
 */
public class TextConverter {
    // Forretningslogik
    public String lavUpperCase(String hest){
        return hest.toUpperCase();
    }
    
    public String lavUpDown(String gris){
        String res = "";
        for (int i = 0; i < gris.length(); i++) {
            String s = "" + gris.charAt(i);
            if(i%2==0)
            {
                s = s.toUpperCase();
            }
            else
            {
                s = s.toLowerCase();
            }
            res = res + s;
        }
        return res;
    }
}
