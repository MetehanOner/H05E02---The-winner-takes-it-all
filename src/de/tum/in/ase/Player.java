package de.tum.in.ase;

import java.util.ArrayList;
import java.util.List;

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
    this.weapon = weapon;
    this.armor = armor;


  }

    protected boolean isDead(){
        return health == 0;
    }

    protected void equipItems(){

    }

  // TODO: Implement part 3.
}
