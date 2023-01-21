package day12.task5;

import java.util.ArrayList;
import java.util.List;

public class Task5 {
    public static void main(String[] args) {
        List<MusicArtist> members1 =new ArrayList<>();
        members1.add(new MusicArtist("Сильвесрт Сталлоне", 75));
        members1.add(new MusicArtist("Арни Шварц", 74));
        members1.add(new MusicArtist("Дольф Лунгрен",65));
        members1.add(new MusicArtist("Жан Клод Ван Дам",55));
        members1.add(new MusicArtist("Брюс Уиллис",60));

        MusicBand band1= new MusicBand("Старики разбойники", 2012, members1);

        List<MusicArtist> members2 =new ArrayList<>();
        members2.add(new MusicArtist("Джейсор Лысый",54));
        members2.add(new MusicArtist("Чак Норрис",79));
        members2.add(new MusicArtist("Негр Качок",50));


        MusicBand band2= new MusicBand("Старики разбойники часть 2", 2016, members2);

        band1.printMembers();
        band2.printMembers();

        MusicBand.transferMembers(band1, band2);
        band1.printMembers();
        band2.printMembers();

    }
}
