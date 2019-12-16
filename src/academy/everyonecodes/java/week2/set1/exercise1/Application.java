package academy.everyonecodes.java.week2.set1.exercise1;

public class Application {
    public static void main(String[] args) {
        Student eirini = new Student("Eirini", "Sanaz");
        Student andrea = new Student("Andrea", "Oana");

        andrea.setPeerProgramer("David");
        eirini.setPeerProgramer("Olena");

        String andreaPeer = andrea.getPeerName();
        String eiriniPeer = eirini.getPeerName();
        System.out.println(andreaPeer);
        System.out.println(eiriniPeer);
    }
}
