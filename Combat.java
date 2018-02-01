class Combat{

boolean playing = true;
int moveVal = 0;

class Game{
   public Game();
   public void runGame(){
      Weapon startSword = new Weapon("Rustic Blade", "An old iron sword", 8, 0, 5);
      Fighter player = new Fighter("Dopey", startSword);
      while(playing == true){
         if(moveVal >= 0){
            //player move
         }else{
            //opponent move
         }
      }
      
   }
}

class Fighter{
   String name;
   int strength;
   int health;
   int dexterity;
   
   Weapon weapon;
   public Fighter(String name, Weapon weapon){
   this.name = name;
   this.weapon = weapon;
   }
}

class Weapon extends Item{
   public Weapon(String name, String description, int damage, int value, int useTime){
   this.name = name;
   this.description = description;
   this.damage = damage;
   this.value = value;
   this.useTime = useTime;
   }
   int damage;
   int value;
   int useTime;
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