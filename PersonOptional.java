package week11;

import java.util.NoSuchElementException;
import java.util.Optional;

public class PersonOptional {

    public static void main(String[] args) {
        PersonalOptionalMethod();
    }


    public static void PersonalOptionalMethod() {
        Person person = personMethod(Optional
        		.of(new Person("Jennifer", 29, "Female", "White")));
        System.out.println(person + " isn't available.");

        try {
            personMethod(Optional.empty());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }


    private static Person personMethod (Optional<Person> personOptional) {
        return personOptional.orElseThrow(
            () -> new NoSuchElementException("This person doesn't exist!"));
    }

}
