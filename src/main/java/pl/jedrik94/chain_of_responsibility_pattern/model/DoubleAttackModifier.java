package pl.jedrik94.chain_of_responsibility_pattern.model;

public class DoubleAttackModifier extends CreatureModifier {
    public DoubleAttackModifier(Creature creature) {
        super(creature);
    }

    @Override
    public void handleModifier() {
        creature.setAttack(creature.getAttack() * 2);
        super.handleModifier();
    }
}
