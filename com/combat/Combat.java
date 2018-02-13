package com.combat;
public class Combat{
  
   public static void main(String args[]){
      Game game = new Game(1);
      try{
      game.readWeapons();
      }catch(Exception e){}
      game.runGame();
   }
}