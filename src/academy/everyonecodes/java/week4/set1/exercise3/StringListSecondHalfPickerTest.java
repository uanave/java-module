package academy.everyonecodes.java.week4.set1.exercise3;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import java.util.List;

    public class StringListSecondHalfPickerTest {
        StringListSecondHalfPicker stringListSecondHalfPicker = new StringListSecondHalfPicker();

        @RepeatedTest(15)
        void pickBig(){
            List<String> randomWords = List.of("cat", "cow", "chicken", "dog", "monkey", "elephant", "mouse");

            String result = stringListSecondHalfPicker.pick(randomWords);
            System.out.println(result);
            Assertions.assertTrue(randomWords.contains(result));
        }

        @RepeatedTest(10)
        void pickSmall(){
            List<String> randomWords = List.of("cat", "cow", "chicken", "dog");

            String result = stringListSecondHalfPicker.pick(randomWords);
            System.out.println(result);
            Assertions.assertTrue(randomWords.contains(result));
        }
    }

