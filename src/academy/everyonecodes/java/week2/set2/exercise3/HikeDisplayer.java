package academy.everyonecodes.java.week2.set2.exercise3;

public class HikeDisplayer {
    public static void display(Hike hike) {
        System.out.println(hike.getDate());
        for (Hiker hiker : hike.getHikers()) {
            System.out.println(hiker.getName());
        }
    }
}
