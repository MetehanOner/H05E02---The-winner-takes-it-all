package de.tum.in.ase;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public abstract class Player implements Interactions {
  // TODO: Add missing attributes.
    protected String name;
    protected String specification;
    protected int amountOfArmor;
    protected String weaponType;
    protected int strength;
    protected int intelligence;
    protected int agility;
    protected int spirit;
    protected double health;
    protected int level;
    protected Armor helmet;
    protected Armor chest;
    protected Armor hands;
    protected Armor legs;
    protected Armor boots;

    //must initialized
    protected Weapon weapon;
    protected List<Armor> armor;


  protected Player(String name, String specification, int amountOfArmor, List<Armor> armor, Weapon weapon, String weaponType){
    this.name = name;
    this.specification = specification;
    this.amountOfArmor = amountOfArmor;
    this.weaponType = weaponType;

    if(Objects.equals(weaponType, weapon.type)) {
      this.weapon = weapon;
    }

    this.level = 1;
    this.armor = armor;
    this.health = 200;
    //equipItems();

  }

    protected boolean isDead() {
        return health == 0;
    }

    protected void equipItems(){

    for(int i=0; i < armor.size(); i++){

      if(Objects.equals(armor.get(i).type, "helmet")){

        this.helmet = armor.get(i);
        strength += armor.get(i).strength;
        intelligence += armor.get(i).intelligence;
        agility += armor.get(i).agility;
        spirit += armor.get(i).spirit;
        amountOfArmor -= armor.get(i).getAmountOfArmor();



      } else if (Objects.equals(armor.get(i).type, "chest")) {

        this.chest = armor.get(i);
        strength += armor.get(i).strength;
        intelligence += armor.get(i).intelligence;
        agility += armor.get(i).agility;
        spirit += armor.get(i).spirit;
        amountOfArmor -= armor.get(i).getAmountOfArmor();


      } else if (Objects.equals(armor.get(i).type, "hands")) {

        this.hands = armor.get(i);
        strength += armor.get(i).strength;
        intelligence += armor.get(i).intelligence;
        agility += armor.get(i).agility;
        spirit += armor.get(i).spirit;
        amountOfArmor -= armor.get(i).getAmountOfArmor();


      } else if (Objects.equals(armor.get(i).type, "legs")) {

        this.legs = armor.get(i);
        strength += armor.get(i).strength;
        intelligence += armor.get(i).intelligence;
        agility += armor.get(i).agility;
        spirit += armor.get(i).spirit;
        amountOfArmor -= armor.get(i).getAmountOfArmor();


      } else if (Objects.equals(armor.get(i).type, "boots")) {

        this.boots = armor.get(i);
        strength += armor.get(i).strength;
        intelligence += armor.get(i).intelligence;
        agility += armor.get(i).agility;
        spirit += armor.get(i).spirit;
        amountOfArmor -= armor.get(i).getAmountOfArmor();

      }

    }


    }

}
