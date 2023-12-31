package de.tum.in.ase;

import java.util.ArrayList;
import java.util.List;

public class Tank extends Player {

    private Armor shield;
    private List<Ability> abilities;

    public Tank(String name, List<Ability> abilities, List<Armor> armor, Weapon weapon, String weaponType, Armor shield) {
        super(name, "Tank", armor.size(), armor, weapon, weaponType);
        this.abilities = abilities;

        super.strength = 15;
        super.intelligence = 4;
        super.agility = 6;
        super.spirit = 2;
        super.amountOfArmor = 30;

        super.equipItems();
        equipShield();
    }

    private void equipShield() {



    }

    @Override
    public void attack(Player target) {

    }

    @Override
    public void useAbility(Player target) {

    }

    public List<Ability> getAbilities() {
        return abilities;
    }

    public Armor getShield() {
        return shield;
    }

    // TODO: Implement part 4.

  // TODO: Implement part 5.

  // TODO: Implement part 6.
}
