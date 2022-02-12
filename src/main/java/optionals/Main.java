package optionals;

import java.util.Optional;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
//        Supplier<IllegalStateException> exception = () -> new IllegalStateException("exception");
        Optional.ofNullable(null)
//                .orElseGet(() -> "default value");
//                .orElseThrow(exception);
//                .ifPresent(email -> System.out.println("sending email to " + email));
                .ifPresentOrElse(
                        email -> System.out.println("sending email to " + email),
                        () -> System.out.println("Cannot send email"));
//        System.out.println(value);
    }
}
