import java.util.*;
  
public class Leaf extends Pokemon{

  String attack;
  int heals;
  
 public Leaf (String name, String type, int hp, String attack){
   super(name,type, hp);
   this.attack = attack;
 } 

 public void absorb (int heals ){
   System.out.println( name + " uses absorb to regenerate " + heals + " hp.");
   try{
     System.out.println(hp+heals/0);
   } catch(Exception e){
     System.out.println("Check variables and arithmetic");
}
  
 }
  
}