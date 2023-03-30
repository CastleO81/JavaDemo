import java.util.*;
  
public abstract class Pokemon{

String name;
String type;
int hp;
  
  public Pokemon (String name, String type, int hp){
    this.name = name;
    this.type = type;
    this.hp   = hp;
    }
  
public void worldOfPokemon(){
  
List<String> pokemonLists = new ArrayList<>();{
  
  pokemonLists.add("bulbasaur");
  pokemonLists.add("squirtle");
  pokemonLists.add("charmander");
  pokemonLists.add("charmeleon");
  pokemonLists.add("wartortle");
  pokemonLists.add("ivysaur");
  pokemonLists.add("Blastoise");
  pokemonLists.add("Charizard");
  pokemonLists.add("Venasaur");
  
  for (String pokemonList3 : pokemonLists){
    System.out.println(pokemonList3);
    
  }}
  
}
}  
  