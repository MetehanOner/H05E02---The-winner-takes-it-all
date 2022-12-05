package de.tum.in.ase;

import java.util.List;

public class Mage extends Player{

    protected List<Ability> abilities;
    protected Mage(String name, String specification, int amountOfArmor, List<Armor> armor, Weapon weapon, String weaponType) {
        super(name, specification, amountOfArmor, armor, weapon, weaponType);

        equipItems();
    }

    @Override
    public void attack(Player target) {

    }

    @Override
    public void useAbility(Player target) {

    }
    // TODO: Implement part 4.

  // TODO: Implement part 5.

  // TODO: Implement part 6.
}
