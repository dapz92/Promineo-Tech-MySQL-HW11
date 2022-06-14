package week11;

import java.util.stream.Collectors;

public class PersonStream {
    
	
	public static void main(String[] args) {
        System.out.println(Person.getPeople().stream().map(Person::toString)
        		   .sorted().collect(Collectors.joining(", ")));
    }
}
