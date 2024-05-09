/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package apr11;

/**
 *
 * @author ahmed
 */
interface Addable{
    int add(int a, int b);
}
interface Sayable{
    public String say(String name);
}
interface Drawable{
    public void draw();
}

public class LambdaEx {
    public static void main(String[] args) {
        int width=10;
        Drawable d2=()->{
            System.out.println("drawing "+width);
            
        };
        d2.draw();
        
        Sayable s1=(name)->{
            return "Hello, "+name;
        };
        System.out.println(s1.say("Sonoo"));
        Sayable s2 =name->{
            return "Hello, "+name;
        };
        System.out.println(s2.say("sonoo"));
        
       Addable ad1= (a,b)->(a+b);
       System.out.println(ad1.add(10,20));
       
       Addable ad2 = (int a, int b)->(a+b);
       System.out.println(ad2.add(100, 200));
                        }
}
