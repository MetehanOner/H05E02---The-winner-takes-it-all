package de.tum.in.ase;

import java.util.ArrayList;
import java.util.List;

public class Healer extends Player {

    private List<Ability> abilities;
    public Healer(String name, List<Ability> abilities, List<Armor> armor, Weapon weapon, String weaponType) {
        super(name, "Healer", armor.size(), armor, weapon, weaponType);
        this.abilities = abilities;

        super.strength = 3;
        super.intelligence = 5;
        super.agility = 3;
        super.spirit = 10;
        super.amountOfArmor = 9;

        equipItems();
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
