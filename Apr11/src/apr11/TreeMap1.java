/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package apr11;
import java.util.*;
import java.util.Map;

/**
 *
 * @author ahmed
 */
public class TreeMap1 {
                public static void main(String[] args) {
        TreeMap<Integer, String> map = new TreeMap<Integer,String>();
 map.put(100, "char");
      map.put(102, "rahul");
   map.put(101, "singh");
   map.put(103, "aneet");
   map.put(105, "anuj");
                for(Map.Entry m:map.entrySet()){
                    System.out.println(m.getKey()+" "+m.getValue());
                }
                }
    
}
