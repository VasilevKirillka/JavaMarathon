package day12.task3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Task3 {
    public static void main(String[] args) {

       MusicBand band1= new MusicBand("Дебилы", 2012);
        MusicBand band2=new MusicBand("Идиоты", 1999);
        MusicBand band3=new MusicBand("Дураки", 1980);
        MusicBand band4=new MusicBand("Молодцы", 1989);
        MusicBand band5=new MusicBand("Придурки", 2009);
        MusicBand band6=new MusicBand("Удоды", 2005);
        MusicBand band7=new MusicBand("Лошки", 2001);
        MusicBand band8=new MusicBand("Козлы", 2001);
        MusicBand band9=new MusicBand("Панки", 1970);
        MusicBand band10=new MusicBand("Гейчики", 2002);

        List<MusicBand> musicBands = new ArrayList<>();


        musicBands.add(band1);
        musicBands.add(band2);
        musicBands.add(band3);
        musicBands.add(band4);
        musicBands.add(band5);
        musicBands.add(band6);
        musicBands.add(band7);
        musicBands.add(band8);
        musicBands.add(band9);
        musicBands.add(band10);

        System.out.println(musicBands);

        Collections.shuffle(musicBands); // перемешать элементы списка

        System.out.println(musicBands);

//        List <MusicBand> groupsAfter2000=new ArrayList<>();
//        for (MusicBand band: musicBands){
//            if (band.getYear()> 2000){groupsAfter2000.add(band);}
//        }
        System.out.println(groupsAfter2000(musicBands));
    }
    public static List<MusicBand> groupsAfter2000(List<MusicBand> bands){
     List <MusicBand> bandAfter2000=new ArrayList<>();
        for (MusicBand band: bands){
            if (band.getYear()> 2000){bandAfter2000.add(band);}
        }
        return bandAfter2000;

    }
}
