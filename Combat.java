class Combat{

class Game{
   public Game();
   public void runGame(){
      Weapon startSword = new Weapon("Rustic Blade", "An old iron sword", 8, 0);
      Fighter player = new Fighter("Dopey", startSword);
   }
}

class Fighter{
   String name;
   Weapon weapon;
   public Fighter(String name, Weapon weapon){
   this.name = name;
   this.weapon = weapon;
   }
}

class Weapon extends Item{
   public Weapon(String name, String description, int damage, int value){
   this.name = name;
   this.description = description;
   this.damage = damage;
   this.value = value;
   }
   int damage;
   int value;
}

class Item{
   String name;
   String description;
   int weight;
}

public static void main(String args[]){
   Game game = new Game();
   game.runGame();
}