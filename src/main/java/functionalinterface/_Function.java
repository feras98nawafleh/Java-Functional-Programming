package functionalinterface;

import java.util.function.Function;

public class _Function {

    public static void main(String[] args) {
        int number = incrementByOne.apply(11);
        System.out.println(number);
    }

    static Function<Integer, Integer> incrementByOne = number -> number + 1;

    static int increment(int number) {
        return number + 1;
    }
}