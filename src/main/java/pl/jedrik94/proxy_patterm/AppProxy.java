package pl.jedrik94.proxy_patterm;

import pl.jedrik94.proxy_patterm.model.Creature;

public class AppProxy {
    public static void main(String[] args) {
        Creature creature = new Creature(5);

        System.out.println("Creature agility lvl is: " + creature.getAgility());

        creature.setAgility(5 + 1);
    }
}
