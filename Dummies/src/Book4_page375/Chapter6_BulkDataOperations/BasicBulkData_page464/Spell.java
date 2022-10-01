package Book4_page375.Chapter6_BulkDataOperations.BasicBulkData_page464;

import java.util.ArrayList;

public class Spell {
    public String name;
    public SpellType type;
    public String description;

    public enum SpellType {SPELL, CHARM, CURSE}

    public Spell(String spellName, SpellType spellType,
                 String spellDescription) {
        name = spellName;
        type = spellType;
        description = spellDescription;
    }

    public String toString() {
        return name;
    }

    public static class Spells {
        public static void main(String[] args) {

            ArrayList<Spell> spells = new ArrayList<>();
            spells.add(new Spell("Aparecium", SpellType.SPELL, "Makes invisible ink appear."));
            spells.add(new Spell("Avis", SpellType.SPELL, "Launches birds from your wand."));
            spells.add(new Spell("Engorgio", SpellType.CHARM, "Enlarges something."));
            spells.add(new Spell("Fidelius", SpellType.CHARM, "Hides a secret within someone."));
            spells.add(new Spell("Finite Incatatum", SpellType.SPELL, "Stops all current spells."));
            spells.add(new Spell("Locomotor Mortis", SpellType.CURSE, "Locks an opponent's legs."));

            for (Spell spell : spells)
                System.out.println(spell.name);
            spells.stream().forEach(s -> System.out.println(s));

            for (Spell spell : spells) {
                if (spell.type == SpellType.SPELL)
                    System.out.println(spell.name);
            }
            spells.stream()
                    .filter(s -> s.type == SpellType.SPELL)
                    .forEach(s -> System.out.println(s));

            spells.parallelStream()
                    .filter(s -> s.type == SpellType.SPELL)
                    .filter(s -> s.name.toLowerCase().startsWith("a"))
                    .forEach(s -> System.out.println(s));
        }
    }
}
