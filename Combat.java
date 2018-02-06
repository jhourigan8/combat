package combatGame;

class Combat{

boolean playing = true;
int moveVal = 0;

class Game{
	int diff;
   public Game(int diff) {
	   this.diff = diff;
   }
   public void runGame(){
      Weapon startSword = new Weapon("Rustic Blade", "An old iron sword", 8, 0, 5);
      Fighter player = new Fighter("Dopey", startSword, 3, 30, 2);
      Weapon orcAxe = new Weapon("Orc Axe", "xx", 12, 5, 10);
      Fighter orc = new Fighter("Evil Orc", orcAxe, 6, 40, 5);
      
      while(playing == true){
    	  System.out.println("a great orc approaches!");
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
   int str;
   int hp;
   int dex;
   
   Weapon weapon;
   public Fighter(String name, Weapon weapon, int str, int hp, int dex){
   this.name = name;
   this.weapon = weapon;
   this.str = str;
   this.hp = hp;
   this.dex = dex;
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

}