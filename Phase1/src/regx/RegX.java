package regx;

import java.util.*;
import java.util.regex.*;    
public class RegX{  
    public static void main(String args[]){  
        ArrayList<String> emails = new ArrayList<String>();  
        ArrayList<String> mobileno  = new ArrayList<String>(); 
        emails.add("firstname@domain.com");  
        emails.add("virendra@domain.co.in");  
        emails.add("test123prepare@co.edu.com");
        
        
        //Regular Expression   
        String regex = "^(.+)@(.+)com"; 
       String regex1 = "//d[10]";
      
        //Compile regular expression to get the pattern  
        Pattern pattern = Pattern.compile(regex);
        Pattern pattern1 = Pattern.compile(regex1);
        //Iterate emails array list  
        for(String email : emails){  
            //Create instance of matcher   
            Matcher matcher = pattern.matcher(email);  
           
            System.out.println(email +" : "+ matcher.matches()+"\n" );  
        } 
        System.out.println( "Mobile no is vaild = " + pattern.matches("\\d{10}" , "9173936889"));  
        System.out.println( "Password is valid = "+ pattern.matches("^(?=.[0-9])(?=.[a-z])(?=.[A-Z])(?=.[!@#&()–[{}]:;',?/*~$^+=<>]).{8,20}$","brahaspati@1"));
    }  }
