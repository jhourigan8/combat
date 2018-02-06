package com.combat;

import java.util.*;
import java.io.FileReader;
import java.io.BufferedReader;

class Game{
	int diff;
   public Game(int diff) {
	   this.diff = diff;
   }
   
   public void playerMove(Fighter player, Fighter orc){
      System.out.println("attack - attacks using weapon");
      System.out.println("block - blocks with shield");
      Scanner scan = new Scanner(System.in);
      boolean validMove = false;
      while(validMove == false){
         switch(scan.next()){
            case "attack":
               int damageDealt = player.weapon.damage + player.str;
               orc.hp = orc.hp - damageDealt;
               System.out.println(player.name + " dealt " + damageDealt + " damage to " + orc.name);
               validMove = true;
               break;
            case "block":
               System.out.println("atkL");
               break;
            default:
               System.out.println("Enter a valid command.");
         }     
      }  
   } 
   
   public void enemyMove(Fighter orc, Fighter player){
      int damageDealt = orc.str + orc.weapon.damage;
      player.hp -= damageDealt;
      System.out.println(orc.name + " dealt " + damageDealt + " damage to " + player.name);
      
   }
   
   
//    public Weapon[] readWeapons(){
//       FileReader reader = new FileReader("items.txt");
//       BufferedReader bReader = new BufferedReader(reader); 
//       String line = null; 
//       while((line = bReader.readLine()) != null){
//          System.out.println(line);
//       }
//    }
   
   public void runGame(){
      Weapon startSword = new Weapon("Rustic Blade", 8, 0);
      Fighter player = new Fighter("Dopey", startSword, 3, 30);
      Weapon orcAxe = new Weapon("Orc Axe", 12, 5);
      Fighter orc = new Fighter("Evil Orc", orcAxe, 6, 40);

      //fight
      //repeats until winner
      while (true){
         //player chooses action
         this.playerMove(player, orc);
          
         if(orc.hp <= 0){
            System.out.println("You are victorious!");
            break;
            }
        
         //wnwmy acts
         this.enemyMove(orc, player);
         
         if(player.hp <= 0){
            System.out.println("You have been defeated.");
            break;
         }
      } 
   }
}
   /* 
   swing jab parry block dodge
   */
