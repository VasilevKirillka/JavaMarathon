package day12.task5;

import java.util.List;

public class MusicBand {
    private String name;
    private int year;
    private List<MusicArtist> members;

    public MusicBand(String name, int year, List<MusicArtist> members) {
        this.name = name;
        this.year = year;
        this.members=members;
    }

    public int getYear() {
        return year;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public List<MusicArtist> getMembers() {
        return members;
    }

    public void setMembers(List<MusicArtist> members) {
        this.members = members;
    }

    public static void transferMembers(MusicBand a, MusicBand b){
        for(MusicArtist member : a.getMembers()){
            b.getMembers().add(member);
        }
        a.getMembers().clear();
    }

    public void printMembers(){
        System.out.println(this.members);
    } // выводит на экран участников группы

    @Override
    public String toString() {
        return "Название группы " + name +
                ", год основания " + year + "\t";
    }
}
