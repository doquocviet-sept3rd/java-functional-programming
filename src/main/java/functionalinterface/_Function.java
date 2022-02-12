package functionalinterface;

import java.util.function.BiFunction;
import java.util.function.Function;

public class _Function {
    public static void main(String[] args) {

        // Function takes 1 argument and produces result
        int increment = incrementByOne(1);
        System.out.println(increment);

        Integer increment2 = incrementByOneFunction.apply(1);
        System.out.println(increment2);

        int multiply = multipleBy10Function.apply(increment2);
        System.out.println(multiply);

        Function<Integer, Integer> addBy1AndThenMultiplyBy10
                = incrementByOneFunction.andThen(multipleBy10Function);
        Integer apply = addBy1AndThenMultiplyBy10.apply(4);
        System.out.println(apply);

        // BiFunction takes 1 argument and produces result
        int i = incrementByOneAndMultiply(4, 100);
        System.out.println(i);

        Integer apply1 = incrementByOneAndMultiplyBiFunction.apply(4, 100);
        System.out.println(apply1);

    }

    static Function<Integer, Integer> incrementByOneFunction
            = number -> number + 1;

    static Function<Integer, Integer> multipleBy10Function
            = number -> number * 10;

    static int incrementByOne(int number) {
        return number + 1;
    }

    // BiFunction
    static BiFunction<Integer, Integer, Integer> incrementByOneAndMultiplyBiFunction
            = (numToIncrementByOne, numberToMultiplyBy)
            -> (numToIncrementByOne + 1) * numberToMultiplyBy;

    static int incrementByOneAndMultiply(int number, int numToMultiplyBy) {
        return (number + 1) * numToMultiplyBy;
    }
}
