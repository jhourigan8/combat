package com.combat;
class Fighter{
   String name;
   int str;
   int hp;
   int money;
   
   Weapon weapon;
   public Fighter(String name, Weapon weapon, int str, int hp, int money){
      this.name = name;
      this.weapon = weapon;
      this.str = str;
      this.hp = hp;
      this.money = money;
   }
}
