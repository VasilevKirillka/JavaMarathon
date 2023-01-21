package day11.task2;

public class Task2 {
    public static void main(String[] args) {
        Warrior warrior=new Warrior();
        Paladin paladin=new Paladin();
        Magician magician=new Magician();
        Shaman shaman=new Shaman();

        warrior.physAttack(paladin);
        System.out.println(paladin);
        System.out.println();

        paladin.physAttack(magician);
        System.out.println(magician);
        System.out.println();

        shaman.healTeammate(magician);
        System.out.println(magician);
        System.out.println();

        magician.magicalAttack(paladin);
        System.out.println(paladin);
        System.out.println();

        shaman.physAttack(warrior);
        System.out.println(warrior);
        System.out.println();

        paladin.healHimself();
        System.out.println(paladin);
        System.out.println();

        for (int i=0;i<5; i++){
            warrior.physAttack(magician);
            System.out.println(magician);
        }

    }
}
