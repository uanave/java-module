package academy.everyonecodes.java.evaluation1.exercise2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class PictureNameExtractorTest {
    PictureNameExtractor pictureNameExtractor = new PictureNameExtractor();

    @ParameterizedTest
    @CsvSource({
            "sunshine, 01222013SunshinePic.jpg",
            "snowflake, 24122019SnowflakePic.jpg",
            "dereks birthday, 01082003Dereks-BirthdayPic.jpg",
            "nice cat, 24122019nice-catpic.jpg"
    })
    void extract(String expected, String name) {
        String result = pictureNameExtractor.extract(name);

        Assertions.assertEquals(expected, result);
    }

}