import java.util.*;
  
public class Trainer{

String name;
String gym;
int numOfPokemon;
  
  public Trainer(){
    this.name = "Wayne";
    this.gym = "Silver Street";
    this.numOfPokemon =  6 ;
    System.out.println("Hello there! My name is " + name + " and I am a fellow pokemon trainer. I belong to the " + gym + " gym and train " + numOfPokemon + " pokemon there.");
    }

public String pokeball(){
  return "Trainer throws pokeball!";
}
}  
  