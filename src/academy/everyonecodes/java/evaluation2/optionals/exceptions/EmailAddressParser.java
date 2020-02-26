package academy.everyonecodes.java.evaluation2.optionals.exceptions;

import java.util.List;
import java.util.Optional;

public class EmailAddressParser {
    public Optional<EmailAddress> parse(String string) throws InvalidEmailException {
        List<String> emailAddress = List.of(string.split("@"));
        if (emailAddress.size() != 2) {
            throw new InvalidEmailException("Invalid email!");
        }
        if (!emailAddress.get(0).isBlank() && !emailAddress.get(1).isBlank()) {
            EmailAddress validAddress = new EmailAddress(emailAddress.get(0), emailAddress.get(1));
            return Optional.of(validAddress);
        } else {
            throw new InvalidEmailException("Invalid email!");
        }
    }
}
