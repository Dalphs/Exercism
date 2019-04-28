import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

class DnDCharacter {
    private int strength = 0;
    private int dexterity = 0;
    private int constitution = 0;
    private int intelligence = 0;
    private int wisdom = 0;
    private int charisma = 0;
    private int hitpoints = 0;

    public DnDCharacter() {
        strength = getValue();
        dexterity = getValue();
        constitution = getValue();
        intelligence = getValue();
        wisdom = getValue();
        charisma = getValue();
        hitpoints = modifier(constitution)+ 10    ;

    }

    public int getValue(){
        int value = 0;
        ArrayList<Integer> dices = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            dices.add((int) (Math.random() * 6 + 1));
        }
        removeSmallest(dices);
        for (Integer i: dices) {
            value += i;
        }
        return value;
    }

    public ArrayList<Integer> removeSmallest(ArrayList<Integer> dices){
        Collections.sort(dices);
        dices.remove(dices.size() - 1);
        return dices;
    }

    int ability() {
        return getValue();
    }

    int modifier(int input) {
        if(input < 10)
            return (int) Math.floor((input - 10) / 2.0);
        return (input - 10) / 2  ;
    }

    int getStrength() {
        return strength;
    }

    int getDexterity() {
        return dexterity;    }

    int getConstitution() {
        return constitution;
    }

    int getIntelligence() {
        return intelligence;    }

    int getWisdom() {
        return wisdom;    }

    int getCharisma() {
        return charisma;
    }

    int getHitpoints() {
        return hitpoints;    }

}
