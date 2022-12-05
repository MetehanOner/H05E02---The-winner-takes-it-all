package de.tum.in.ase;

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

    protected Player(){

    }

    protected boolean isDead(){
        return health == 0;
    }

    protected void equipItems(){

    }

  // TODO: Implement part 3.
}
