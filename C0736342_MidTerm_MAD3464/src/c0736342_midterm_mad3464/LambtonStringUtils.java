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
   
   
    static public int binaryTodecimalconvert(String s){
        
        int decimal;
        decimal = Integer.parseInt(s,2);
        
        
        return decimal;
        
        }
    
    static public String initials(String s){ 
        char [] cArray = s.toCharArray();
        
        for (int i =0; i<cArray.length; i++)
            
            
        {
            
        }
    }
      
      
      static public char mostFrequent(String s){
    
       

        int count[] = new int[200];
      
        
        int l = s.length();
        for (int i=0; i<l; i++)
            count[s.charAt(i)]++;
      
        int max = -1;  
        char output = ' ';   
      
       
        for (int i = 0; i < l; i++) {
            if (max < count[s.charAt(i)]) {
                max = count[s.charAt(i)];
                output = s.charAt(i);
            }
        }
      
        return output;
    }
      static public String replaceSubString(String s1, String s2, String s3){
          
         
          
              

      
            int startStr=0;
           int endStr =0;
      

     
          startStr = s1.indexOf(s2,0);
         System.out.println(startStr);
                        

         endStr = startStr + (s2.length() - 1);
         System.out.println(endStr);
         
        
      
     
          return " ";
 
          
          

      
      
          
    }

    
    
    
    
    
    
    
    
    
    
}
