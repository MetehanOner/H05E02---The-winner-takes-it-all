package de.tum.in.ase;

import java.util.ArrayList;
import java.util.List;

public class Mage extends Player{

    private List<Ability> abilities;
    protected Mage(String name, List<Ability> abilities, List<Armor> armor, Weapon weapon, String weaponType) {
        super(name, "MAGE", armor.size(), armor, weapon, weaponType);
        this.abilities = abilities;
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
