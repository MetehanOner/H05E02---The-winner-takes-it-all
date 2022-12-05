package de.tum.in.ase;

public class Ability {
  // TODO: Implement part 1.
  private String name;
  private String specification;
  private int damage;
  private int heal;
  private int armor;

  public Ability(String name, String specification, int amount){
      this.name = name;
      this.specification = specification;

      switch (specification.toUpperCase()) {
          case "MAGE", "WARRIOR" -> {
              this.damage = amount;
              this.heal = -1;
              this.armor = -1;
          }
          case "TANK" -> {
              this.damage = -1;
              this.heal = -1;
              this.armor = amount;
          }
          case "HEALER" -> {
              this.damage = -1;
              this.heal = amount;
              this.armor = -1;
          }
          default -> {
              this.damage = -1;
              this.heal = -1;
              this.armor = -1;
          }
      }



  }

  public String getName() {
      return name;
  }

  public int getArmor() {
      return armor;
  }

  public int getDamage() {
        return damage;
  }

  public int getHeal() {
        return heal;
  }

  public String getSpecification() {
        return specification;
  }
}
