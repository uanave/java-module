package academy.everyonecodes.java.week1.set2.exercise3;

import java.util.List;
import java.util.ArrayList;

public class SayBiggestSmallest {
    public static boolean isBigger(int first, int second) {
        return first > second;
    }

    public static boolean isSmaller(int first, int second) {
        return first < second;
    }

    public static int getBiggest(List<Integer> numbers) {
        int biggest = numbers.get(0);
        for (int number : numbers) {
            if (isBigger(number, biggest)) {
                biggest = number;
            }
        }
        return biggest;
    }

    public static int getSmallest(List<Integer> numbers) {
        int smallest = numbers.get(0);
        for (int number : numbers) {
            if (isSmaller(number, smallest)) {
                smallest = number;
            }
        }
        return smallest;
    }

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(-1);
        numbers.add(4);
        numbers.add(3);
        numbers.add(0);
        numbers.add(5);
        numbers.add(2);
        int biggest = getBiggest(numbers);
        int smallest = getSmallest(numbers);
        System.out.println("The biggest number is " + biggest + " and the smallest is " + smallest);
    }

}

