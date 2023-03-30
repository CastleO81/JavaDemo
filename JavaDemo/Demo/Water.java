import java.util.*;
  
public class Water extends Pokemon{

  String attack;
  private int waterBottles;
  String ability;
  
   public int getWaterBottles(){
  return waterBottles;}

  public void setWaterBottles(int waterBottles){
  this.waterBottles = waterBottles;}

  
 public Water (String name, String type, int hp, String attack){
   super(name,type, hp);
   this.attack = attack;
 } 

 public void surfing (String swimming ){
   System.out.println( name + " uses " + swimming + " to cool off their trainer.");
 } 

 public Water (String name, String type, int hp, String attack, String ability){
   super(name, type, hp);
   this.attack = attack;
   this.ability = ability;
 }
 

  
}