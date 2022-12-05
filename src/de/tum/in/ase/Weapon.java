package de.tum.in.ase;

public class Weapon extends Item {
  // TODO: Implement part 2.
    private int damage;

    public Weapon(String weaponType, String specification, int damage, int strength, int intelligence, int agility, int spirit) {
        super(weaponType);

        super.specification = specification;

        this.damage = damage;

        super.strength = strength;
        super.intelligence = intelligence;
        super.agility = agility;
        super.spirit = spirit;

    }

    public int getDamage() {
        return damage;
    }
}
