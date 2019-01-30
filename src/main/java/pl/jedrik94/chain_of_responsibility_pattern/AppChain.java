package pl.jedrik94.chain_of_responsibility_pattern;

import pl.jedrik94.chain_of_responsibility_pattern.model.*;

public class AppChain {
    public static void main(String[] args) {
        Creature druid = new Creature("Druid", 9, 2);

        CreatureModifier root = new CreatureModifier(druid);
        root.addModifier(new DoubleAttackModifier(druid));
        root.addModifier(new IncreaseDefenceModifier(druid));
        root.addModifier(new CurseNoMoreBonusesModifier(druid));
        root.addModifier(new DoubleAttackModifier(druid));
        root.handleModifier();

        System.out.println(druid);

        root.addModifier(new DoubleAttackModifier(druid));
        root.handleModifier();

        System.out.println(druid);

    }
}
