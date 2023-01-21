package day7;

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        Random random=new Random();
        int r=random.nextInt(21)+90;
        Player player1=new Player(r);
        Player player2=new Player(r);
        Player player3=new Player(r);

        Player.info();
        Player player4=new Player(r);
        Player player5=new Player(r);
        Player player6=new Player(r);

        Player.info();

        Player player7=new Player(r);

        Player.info();

        for(int i=0; i < r; i++)
        player3.run();

        Player.info();


    }
}
