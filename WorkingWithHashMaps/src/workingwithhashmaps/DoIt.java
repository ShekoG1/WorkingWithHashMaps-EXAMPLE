/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package workingwithhashmaps;

/**
 *
 * @author SHEKHAR
 */
import java.util.*;
import java.util.Map.*;

public class DoIt {
    
    HashMap <String, Integer> people = new HashMap<>();
    
    
    public void doIt(){
     people.put("Tom",1);
     people.put("Dik",8);
     people.put("Anne",4);
     people.put("Harry",10);
     
     int maxval = (Collections.max(people.values()));
     System.out.println("Highest Value: "+maxval); 
     System.out.println("The HashMap set:"+"\n"+people.keySet()+"\n"+people.values());
     
     for(Entry<String, Integer> entry : people.entrySet()){
     if(entry.getValue()==maxval){
     System.out.println("Largest Value with it's Key:"+"\n"+entry.getKey()+" "+maxval);
     }
     }
    }

 
}
