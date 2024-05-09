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
class book11{
    int id; 
    String name, author,publisher;
    int quantity;

    public book11(int id, String name, String author, String publisher, int quantity) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.publisher = publisher;
        this.quantity = quantity;
    }
    
}
public class MapExample {
            public static void main(String[] args) {
    Map<Integer, book11> map = new LinkedHashMap<Integer,book11>();
    book11 b1 = new book11(101, "C"," Kan",  "BPB",8);
        book11 b2 = new book11(101, "Data comm"," Farouz",  "Mc raw Hill",4);
    book11 b3 = new book11(101, "Op system"," Galvin",  "Wiley",6);
map.put(2,b2);
map.put(1,b1);
map.put(3,b3);
for(Map.Entry<Integer,book11>entry:map.entrySet()){
    int key = entry.getKey();
    book11 b = entry.getValue();
    System.out.print(key+" Details:");
        System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);

    
}

    
    
            }
}
