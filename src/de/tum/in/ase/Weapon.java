package de.tum.in.ase;

public class Weapon extends Item {
  // TODO: Implement part 2.
    private int damage;

    public Weapon(String weaponType, String specification, int damage, int strength, int intelligence, int agility, int spirit) {
        super(weaponType);

        this.damage = damage;

        super.specification = specification;
        super.strength = strength;
        super.intelligence = intelligence;
        super.agility = agility;
        super.spirit = spirit;

    }

    public int getDamage() {
        return damage;
    }


}
