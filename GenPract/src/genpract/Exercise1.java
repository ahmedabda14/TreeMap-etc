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

public class Exercise1 {
     public static void main(String[] args) {
         Scanner kb = new Scanner(System.in);
      HashSet <Integer>h1=new HashSet<>();
      System.out.println("enter number of elements to add ");
               int k = kb.nextInt();
               System.out.println("adding: ");
      for(int i=0;i<=k;i++){
               int v = kb.nextInt();
      h1.add(v);
      }
      HashSet <Integer>h2=new HashSet<>();
 System.out.println("enter number of elements to add #2");
               int k2 = kb.nextInt();
               System.out.println("adding: #2 ");
      for(int i=0;i<=k2;i++){
               int v2 = kb.nextInt();
      h2.add(v2);
      }    
   if (h1.equals(h2)){
                System.out.println("Sets are equal");
      }
   else{
      // h2.removeAll(h1);
             // System.out.println(h2);
h2.retainAll(h1);
System.out.println(h2);
   }
   TreeSet<Integer>t1=new TreeSet<>();
   t1.add(23);   t1.add(44);
   t1.add(1000);   t1.add(45);
   t1.add(102);   t1.add(55);


   System.out.print(t1.headSet(100)+" ");
   System.out.print(t1.tailSet(100)+" ");
PriorityQueue<Integer>p1=new PriorityQueue<>();
 p1.add(23);   p1.add(44);
   p1.add(1000);   p1.add(45);
   p1.add(102);   p1.add(55);
   PriorityQueue<Integer>p2=new PriorityQueue<>();
while(!p1.isEmpty()){
    int num = p1.poll();
    if(num%3==0 && num%5==0){
        p2.add(num);
    }
}
     }
}
