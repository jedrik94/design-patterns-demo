package pl.jedrik94.chain_of_responsibility_pattern.model;

public class CurseNoMoreBonusesModifier extends CreatureModifier {
    public CurseNoMoreBonusesModifier(Creature creature) {
        super(creature);
    }

    @Override
    public void handleModifier() {
        System.out.println("Modifier chain has been broken. No more bonuses my dear " + creature.getName() + ".");
    }
}
