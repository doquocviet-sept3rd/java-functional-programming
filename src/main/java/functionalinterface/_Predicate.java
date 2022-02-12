package functionalinterface;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class _Predicate {
    public static void main(String[] args) {

        System.out.println("Without predicate");
        System.out.println(isPhoneNumberValid("07000000000"));
        System.out.println(isPhoneNumberValid("09929000000"));

        System.out.println("With predicate");
        boolean test = isPhoneNumberValidPredicate.test("07000000000");
        boolean test1 = isPhoneNumberValidPredicate.test("09929000000");
        System.out.println(test);
        System.out.println(test1);

        boolean test2 = isPhoneNumberValidPredicate.and(containsNumber3).test("07939000000");
        System.out.println(
                "Is phone number valid and contain number 3 = " +
                test2);

        boolean test3 = isPhoneNumberValidPredicate.or(containsNumber3).test("07939000000");
        System.out.println(
                "Is phone number valid or contain number 3 = " +
                test3);

//        BiPredicate<String, String> the sample, similar
    }


    static boolean isPhoneNumberValid(String phoneNumber) {
        return phoneNumber.startsWith("07")
                && phoneNumber.length() == 11;
    }

    static Predicate<String> containsNumber3 =
            phoneNumber ->
                    phoneNumber.contains("3");

    static Predicate<String> isPhoneNumberValidPredicate
            = phoneNumber ->
            phoneNumber.startsWith("07")
                    && phoneNumber.length() == 11;
}
