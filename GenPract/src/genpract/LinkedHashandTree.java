/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package genpract;
import java.util.*;
/**
 *
 * @author ahmed
 */
class book{
    int id;
    String name,author,publisher;
    int quantity;

    public book(int id, String name, String author, String publisher, int quantity) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.publisher = publisher;
        this.quantity = quantity;
    }
    
}
public class LinkedHashandTree {
            public static void main(String[] args) {
   LinkedHashSet<String>linkedset= new LinkedHashSet<>(); 
   linkedset.add("Toyota");
      linkedset.add("Hyundai");
   linkedset.add("Kia");
   linkedset.add("Subaru");
   linkedset.add(null);
System.out.println(linkedset);
//from hashset to array
System.out.println();
String[]s=new String[linkedset.size()];
linkedset.toArray(s);


System.out.println();
LinkedHashSet<book>bb= new LinkedHashSet<>();
bb.add(new book(222,"mo"," robs","hood",90));
bb.add(new book(333,"po"," bs","ho",110));
bb.add(new book(111,"no"," obs","hoe",900));

for(book e:bb)
System.out.println(e.id+" "+e.name+" "+e.author+" "+e.publisher+" "+e.quantity);

//Tree

Set<String>T1 = new TreeSet<>();
T1.add("london");
T1.add("paris");
T1.add("madrid");
System.out.println(T1);
for(String v:T1){
    System.out.print(v+" ");
}
NavigableSet<String>T2=new TreeSet<>();
T2.add("Vanier");
T2.add("is");
T2.add("great");
System.out.println(T2.contains("engineer"));
String val ="Vanier";
System.out.println(T2.higher(val));

            }
}
