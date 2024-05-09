/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package apr11;
import java.util.Map;
import java.util.HashMap;
/**
 *
 * @author ahmed
 */
public class Map {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
HashMap<Integer,String>map=new HashMap <>();
map.put(1, "mango");
map.put(2, "apple");
map.put(3, "banana");
map.put(4, "grapes");
System.out.println("Iterating Hashmap...");
for(Map.Entry m: map.entrySet()){
    System.out.println(m.getKey()+" "+m.getValue());
}
    }
    
}
