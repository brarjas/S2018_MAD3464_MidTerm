/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package c0736342_midterm_mad3464;


public class LambtonStringUtils {
    
    static public  String reverseString(String s){
        
        String reverses1 = "";
         for (int i=s.length()-1; i>=0; i--)
         {
             reverses1 = reverses1 + s.charAt(i);
            
         }
        return reverses1;
    }
   
   
    static public int binaryTodecimalconvert(String b){
        
        int decimal;
        decimal = Integer.parseInt(b,2);
        
        
        return decimal;
        
        }
    
    }
    
    
    
    
    
    
    
    
    
    
}
