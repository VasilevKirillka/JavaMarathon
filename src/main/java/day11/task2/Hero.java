package day11.task2;

public abstract class Hero implements PhysAttack {
    static final int MIN_HEALTH=0;
    static final int MAX_HEALTH=100;
    int health;
    int physAttack;
    double physDef;
    double magicDef;

    public Hero() {
        health = 100;
    }

public  void physAttack(Hero h){
        double attackScore = physAttack*(1-h.physDef);
        if(h.health-attackScore < MIN_HEALTH){
            h.health=MIN_HEALTH;
        } else {
        h.health-=attackScore;}

}
}
