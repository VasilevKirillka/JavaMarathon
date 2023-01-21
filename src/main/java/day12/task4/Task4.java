package day12.task4;

import java.util.ArrayList;
import java.util.List;

public class Task4 {
    public static void main(String[] args) {
        List<String> members1 =new ArrayList<>();
        members1.add("Сильвесрт Сталлоне");
        members1.add("Арни Шварц");
        members1.add("Дольф Лунгрен");
        members1.add("Жан Клод Ван Дам");
        members1.add("Брюс Уиллис");

        MusicBand band1= new MusicBand("Старики разбойники", 2012, members1);

        List<String> members2 =new ArrayList<>();
        members2.add("Джейсор Лысый");
        members2.add("Чак Норрис");
        members2.add("Негр Качок");


        MusicBand band2= new MusicBand("Старики разбойники часть 2", 2016, members2);

        band1.printMembers();
        band2.printMembers();

        MusicBand.transferMembers(band1, band2);
        band1.printMembers();
        band2.printMembers();
    }
}
