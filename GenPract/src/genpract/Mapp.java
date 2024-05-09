/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package genpract;
import java.util.*;
/**
 *
 * @author ahmed
 */
class Gen<T>{
T obj;
     
     void add(T obj){
         this.obj=obj;
     }
     T get(){
    return obj;
}
}
 class Mapp {
public static <E>void print(E[] Elements){
    for(E Element : Elements){
        System.out.println(Element);
    }
    System.out.println();
}
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
Map<String,String>map= new HashMap<String,String>();
        map.put("Subaru","BRZ");
        map.put("toyota", "supra");
                map.put("bmw", "M4");
        map.put("Ferrari", "LAFerrari");
Set<Map.Entry<String,String>>set=map.entrySet();
Iterator<Map.Entry<String,String>>itr=set.iterator();
while(itr.hasNext()){
    Map.Entry e=itr.next();
    System.out.println(e.getValue());
}



Integer intarr[]={1,2,3,4,5,6,7,8};
String strarray[]={"sd","dasfs","Safa"};
print(intarr);
print(strarray);


Gen<Integer>p=new Gen<Integer>();
p.add(2);
System.out.println(p.get());
    }
    
}
