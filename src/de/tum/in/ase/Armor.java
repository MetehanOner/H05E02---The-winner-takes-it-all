package de.tum.in.ase;

public class Armor extends Item {
  // TODO: Implement part 2.
    private int amountOfArmor;

    public Armor(String armorType, String specification, int amountOfArmor, int strength, int intelligence, int agility, int spirit){
        super(armorType);
        this.amountOfArmor = amountOfArmor;

        super.specification = specification;
        super.strength = strength;
        super.intelligence = intelligence;
        super.agility = agility;
        super.spirit = spirit;

    }

    public int getAmountOfArmor() {
        return amountOfArmor;
    }
}
