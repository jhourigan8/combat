package com.combat;
class Fighter{
   String name;
   int str;
   int hp;
   
   Weapon weapon;
   public Fighter(String name, Weapon weapon, int str, int hp){
      this.name = name;
      this.weapon = weapon;
      this.str = str;
      this.hp = hp;
   }
}
