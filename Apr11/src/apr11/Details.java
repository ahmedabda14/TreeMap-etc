/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package apr11;

import java.util.*;
import java.util.HashMap;
import java.util.Map;
 

/**
 *
 * @author ahmed
 */
public class Details {
        public static void main(String[] args) {
     HashMap<Integer,String>hmap=new HashMap <Integer, String>();
   hmap.put(12, "char");
      hmap.put(2, "rahul");
   hmap.put(7, "singh");
   hmap.put(49, "aneet");
   hmap.put(3, "anuj");
Set set = hmap.entrySet();
Iterator iterator = set.iterator();
while(iterator.hasNext()){
    Map.Entry mentry = (Map.Entry)iterator.next();
    System.out.print("key is "+mentry.getKey()+" & value is: ");
    System.out.println(mentry.getValue());
}
String var = hmap.get(2);
System.out.println("Value at index 2 is: "+var);
hmap.remove(3);
hmap.putIfAbsent(103, "guarav");
System.out.println("HashMap values after removal and adding");
Set set2 = hmap.entrySet();
Iterator iterator2 = set2.iterator();
while(iterator2.hasNext()){
    Map.Entry mentry2 = (Map.Entry )iterator.next();
    System.out.println("key is: "+mentry2.getKey()+" & value is: ");
        System.out.println(mentry2.getValue());

}
        }
}
