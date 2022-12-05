package de.tum.in.ase;

import java.util.ArrayList;
import java.util.List;

public class Healer extends Player {

    private List<Ability> abilities;
    protected Healer(String name, String specification, int amountOfArmor, List<Armor> armor, Weapon weapon, String weaponType) {
        super(name, specification, amountOfArmor, armor, weapon, weaponType);
        abilities = new ArrayList<>();
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
