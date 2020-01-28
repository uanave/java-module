package academy.everyonecodes.java.week6.set2.exercise3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class TemplateChooserTest {
    TemplateChooser templateChooser = new TemplateChooser();

    @ParameterizedTest
    @CsvSource({
            "female, 'Mrs. Eugenia Buccellato'",
            "privileged, 'Mrs. Eugenia Hokopoko'",
            "female, 'Ms. Oana Vasile'",
            "male, 'Mr. Thomas Ortsik'",
            "default, 'John Doe'",
            "privileged, 'Tom Hokopoko",
            "default, ''"
    })
    void choose(String expected, String name) {
        String result = templateChooser.choose(name);

        Assertions.assertEquals(expected, result);
    }

}