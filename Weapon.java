package com.combat;
class Weapon extends Item{
   public Weapon(String name, int type, int value, int damage){
      this.damage = damage;
      this.value = value;
      this.name = name;
      this.type = type;
   }
   int damage;
   int value;
   String name;
   int type; //0 is small 1 is med 2 is big
   public String toString(){
      return this.name;
   }
}