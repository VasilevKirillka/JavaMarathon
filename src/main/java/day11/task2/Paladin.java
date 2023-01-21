package day11.task2;

public class Paladin extends Hero implements Healer{
    static final int MAX_HEALTH=100;
    static final int HEAL_AMOUNT =25; // лечение самого себя у Паладина
    static final int HEAl_TEAM =20; // лечение союзников
    public Paladin(){
        physDef =0.5;
        magicDef=0.2;
        physAttack=15;
    }

    @Override
    public void healHimself() {
        if(health + HEAL_AMOUNT >MAX_HEALTH){
            health=MAX_HEALTH;
        } else {
        health+=HEAL_AMOUNT;}

    }

    @Override
    public void healTeammate(Hero h) {
        if(h.health + HEAl_TEAM >MAX_HEALTH){
            health=MAX_HEALTH;
        } else {
            health+=HEAl_TEAM;}
    }

    @Override
    public String toString() {
        return "Здоровье Паладина " +
                health;
    }
}
