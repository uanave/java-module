package academy.everyonecodes.java.christmas.Exercise10;

public class Application {
    public static void main(String[] args) {
        PersonVerifier checkPerson = new PersonVerifier();
        boolean hasLegalAge = checkPerson.isAdult();
        boolean wearsHat = checkPerson.isWearingAHat();
        boolean knowsPassword = checkPerson.knowsSecretPassword();
        if (hasLegalAge && wearsHat && knowsPassword) {
            System.out.println("You can enter our club!");
        } else {
            System.out.println("I'm sorry, but you cannot enter our club");
        }

    }
}
