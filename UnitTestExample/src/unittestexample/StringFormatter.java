/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unittestexample;

/**
 *
 * @author jeppjleemoritzled
 */
public class StringFormatter {
    public String doUpperCase(String someString){
        String newString = "";
        for (int i = 0; i < someString.length(); i++) {
            char c = someString.charAt(i);
            if(c != ' ' && c>96 && c<123)
            {
                int ic = (int)c;
                ic = ic-32;
                c = (char)ic;
                newString += c;
            }
            else
            {
                newString += ' ';
            }
        }
        return newString;
    }
}
