package day11.task2;

public class Shaman extends Hero implements MagicAttack, Healer{
    int magicAttack=15;
    static final int HEAL_AMOUNT =50; // лечение самого себя
    static final int HEAl_TEAM =30;

    public Shaman(){
        physDef=0.2;
        magicDef=0.2;
        physAttack=10;
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
        if(health + HEAL_AMOUNT >MAX_HEALTH){
            health=MAX_HEALTH;
        } else {
            health+=HEAL_AMOUNT;}
    }

    @Override
    public void magicalAttack(Hero h) {
        double attackScore =magicAttack*(1- h.magicDef);
        if(h.health-attackScore < MIN_HEALTH){
            h.health=MIN_HEALTH;
        } else {
            h.health-=attackScore;}
    }

    @Override
    public String toString() {
        return "Здоровье Шамана= " + health;
    }
}
