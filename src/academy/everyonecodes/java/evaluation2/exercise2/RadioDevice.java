package academy.everyonecodes.java.evaluation2.exercise2;

import java.util.List;
import java.util.Optional;

public class RadioDevice {

    private List<RadioAntenna> antennas = List.of(new Antenna3G(), new Antenna5G());

    public Optional<String> receive(RadioMessage message) {
        Optional<RadioAntenna> matchingFrequency = antennas.stream()
                .filter(antenna -> antenna.getFrequency() == message.getFrequency())
                .findFirst();
        if (matchingFrequency.isPresent()) {
            return Optional.of(message.getContent());
        }
        return Optional.empty();
    }
}
