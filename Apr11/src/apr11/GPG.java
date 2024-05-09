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
class Student{
    int rollno;
    String name,address;

    public Student(int rollno, String name, String address) {
        this.rollno = rollno;
        this.name = name;
        this.address = address;
    }

    @Override
    public String toString() {
        return this.rollno+" "+this.name+" "+this.address;
    }
    
}
class sortbyroll implements Comparator <Student>{

    @Override
    public int compare(Student o1, Student o2) {
return o1.rollno-o2.rollno;
    }
    
}
public class GPG {
    static void Example2ndConstructor(){
        TreeMap<Student, Integer> map= new TreeMap<Student,Integer>(new sortbyroll());
        map.put(new Student(111,"bbb","london"),2);
                map.put(new Student(131,"aaa","paris"),3);
        map.put(new Student(121,"ccc","jap"),1);
        System.out.println("TreeMap: "+map);

    }
                    public static void main(String[] args) {
                        System.out.println("TreeMap using"+"TreeMap(Comparator)"+
                                "Constructor: \n");
                        Example2ndConstructor();
                    }
}
