package day11.task2;

public class Warrior extends Hero {
    public Warrior(){
        physDef=0.8;
        physAttack=30;
    }

    @Override
    public String toString() {
        return "Здоровье Воина " + health;
    }
}
