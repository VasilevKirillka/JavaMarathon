package day11.task2;

public class Magician extends Hero implements MagicAttack{

int magicAttack=20;
 public Magician(){
     physDef =0;
     magicDef = 0.8;
     physAttack =5;

 }


    public void magicalAttack(Hero h) {
        double attackScore =magicAttack*(1- h.magicDef);
        if(h.health-attackScore < MIN_HEALTH){
            h.health=MIN_HEALTH;
        } else {
            h.health-=attackScore;}

    }

    @Override
    public String toString() {
        return "Здоворье Мага " + health;
    }
}
