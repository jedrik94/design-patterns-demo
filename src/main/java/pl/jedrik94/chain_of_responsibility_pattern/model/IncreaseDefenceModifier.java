package pl.jedrik94.chain_of_responsibility_pattern.model;

public class IncreaseDefenceModifier extends CreatureModifier {
    public IncreaseDefenceModifier(Creature creature) {
        super(creature);
    }

    @Override
    public void handleModifier() {
        creature.setDefence(creature.getDefence() + 3);
        super.handleModifier();
    }
}
