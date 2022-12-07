package de.tum.in.ase;

import java.util.ArrayList;
import java.util.List;

public class Warrior extends Player {

    private List<Ability> abilities;
    public Warrior(String name, List<Ability> abilities, List<Armor> armor, Weapon weapon, String weaponType) {
        super(name, "Warrior", armor.size(), armor, weapon, weaponType);
        this.abilities = abilities;

        super.strength = 20;
        super.intelligence = 2;
        super.agility = 8;
        super.spirit = 2;
        super.amountOfArmor = 15;

        super.equipItems();
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

    // TODO: Implement part 4.

  // TODO: Implement part 5.

  // TODO: Implement part 6.
}
