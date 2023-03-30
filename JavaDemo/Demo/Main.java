import java.util.*;
  
class Main {
  public static void main(String[] args) {

    Scanner choose = new Scanner(System.in);
    System.out.println("Pick your starting pokemon: bulbasaur, charmander, or squirtle");
    String starter =  choose.nextLine();
    System.out.println("You choose " + starter + "!");
    System.out.println("What would you like to name your new pokemon?");
    String namePoke = choose.nextLine();
    System.out.println("You named " + starter  + " " + namePoke +"!");
    
    System.out.println();
    
    Trainer personal = new Trainer();
    
    System.out.println("Let me show you what some of them can do!");
    String show = personal.pokeball();
    System.out.println(show);
    Fire charms = new Fire("Burns", "Fire", 99, "flamethrower");
    charms.heats("flames");
   
     Leaf frogs = new Leaf("Bubba", "Leaf", 101, "light");
    frogs.absorb(50);
   
    Water dude = new Water ("Beach", "Water", 100, "hydrant");
    dude.surfing("water hydrant");
    dude.name = "Beach";
    dude.setWaterBottles(9);

    System.out.println();

    System.out.println("After many months of training " + namePoke + " , look what happened!?");
    
    int lvl = 10;
    
    switch (lvl){
      case 0: 
        System.out.println( namePoke + " is just getting started");
        break;
      case 5:
        System.out.println( namePoke + "is halfway to evolving");
        break;
      case 10:
        System.out.println( namePoke + " has evolved");
        break;
      default:
        System.out.println(namePoke + " is still training");
    }
    
  System.out.println("Below are three attack options that " + namePoke + " can learn. Which do you choose? ");
      
PokemonList pokemonList1 = new PokemonList();
    pokemonList1.worldOfPokemon();

String newAttack = choose.nextLine();
    System.out.println(namePoke + " has learned " + newAttack + "!");
    choose.close();
  }
}