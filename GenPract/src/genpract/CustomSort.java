/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package genpract;
import java.util.*;

class FriendsMarks{
    String name,nickName;
    int marks;

    public FriendsMarks(String name, String nickName, int marks) {
        this.name = name;
        this.nickName = nickName;
        this.marks = marks;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public String getNickName() {
        return nickName;
    }

    public int getMarks() {
        return marks;
    }

    @Override
    public String toString() {
        return "FriendsMarks{" + "name=" + name + ", nickName=" + nickName + ", marks=" + marks + '}';
    }
    
}
class nameCompare implements Comparator<FriendsMarks>{
    @Override
    public int compare(FriendsMarks f1,FriendsMarks f2){
       return f1.getName().compareTo(f2.getName());
    }
}
class nickName implements Comparator<FriendsMarks>{

    @Override
    public int compare(FriendsMarks o1, FriendsMarks o2) {
return o1.getNickName().compareTo(o2.getNickName());
    }
    
}
class marksCompare implements Comparator <FriendsMarks>{

    @Override
    public int compare(FriendsMarks o1, FriendsMarks o2) {
return Integer.compare(o1.getMarks(), o2.getMarks());
    }
    
}
public class CustomSort {
 public static void main(String[] args) {
LinkedHashSet<FriendsMarks>ff=new LinkedHashSet<>();
ff.add(new FriendsMarks("mohamed","mo",90));
ff.add(new FriendsMarks("gros","porc",99));
ff.add(new FriendsMarks("ma","lin",45));
ff.add(new FriendsMarks("po","pe",67));
ff.add(new FriendsMarks("me","dd",98));

TreeSet <FriendsMarks>tree1=new TreeSet<>(new marksCompare());
tree1.addAll(ff);
for(FriendsMarks tree:tree1){
    System.out.println(tree);
}
 }
}
