/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package genpract;

import java.util.ArrayList;

/**
 *
 * @author ahmed
 */
class Container<T>{
    T value;
    public T getValue(){
    return value;
}
    public void setValue(){
        this.value=value;
    }
    public void show(){
        System.out.println(value.getClass().getName());
    }
    public void demo(ArrayList<?extends Number>obj){
        
    }
}
public class Linked {
        public static void main(String[] args) {
   Container <Integer>ob = new Container<Integer>();   
   ob.value=2;
        ob.setValue();
        System.out.println(ob.getValue());
        ob.show();
        ob.demo(new ArrayList<Number>(8));
        System.out.println(ob.getValue());
        }
}
