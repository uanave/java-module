package academy.everyonecodes.java.evaluation2.optionals.sets;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ViewCounterTest {
    ViewCounter counter = new ViewCounter();

    @Test
    void test() {
        counter.addViewerIPAddress("172.16.254.1");
        counter.addViewerIPAddress("172.16.254.1");
        counter.addViewerIPAddress("172.16.254.0");
        counter.addViewerIPAddress("172.16.254.0");
        counter.addViewerIPAddress("172.16.254.7");

        int result = counter.countUniqueViews();
        int expected = 3;
        Assertions.assertEquals(expected, result);
    }
}