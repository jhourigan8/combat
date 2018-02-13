package com.combat;
class Weapon extends Item{
   public Weapon(String name, int damage, int value){
      this.damage = damage;
      this.value = value;
   }
   int damage;
   int value;

   public String toString(){
      return this.name;
   }

}