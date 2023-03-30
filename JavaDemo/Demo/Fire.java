import java.util.*;
  
public class Fire extends Pokemon{

  String attack;
  
 public Fire (String name, String type, int hp, String attack){
   super(name,type, hp);
   this.attack = attack;
 } 

 public void heats (String flamer ){
   System.out.println( name + " uses " + flamer + " to warm up their trainer!");

 } 
}