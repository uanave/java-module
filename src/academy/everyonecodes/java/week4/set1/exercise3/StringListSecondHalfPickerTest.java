package academy.everyonecodes.java.week4.set1.exercise3;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

    public class StringListSecondHalfPickerTest {
        StringListSecondHalfPicker stringListSecondHalfPicker = new StringListSecondHalfPicker();

        @Test
        void pickBig(){
            List<String> randomWords = List.of("cat", "cow", "chicken", "dog", "monkey", "elephant", "mouse");

            String result = stringListSecondHalfPicker.pick(randomWords);
            System.out.println(result);
            Assertions.assertTrue(randomWords.contains(result));
        }

        @Test
        void pickSmall(){
            List<String> randomWords = List.of("cat", "cow", "chicken", "dog");

            String result = stringListSecondHalfPicker.pick(randomWords);
            System.out.println(result);
            Assertions.assertTrue(randomWords.contains(result));
        }
    }

