package week11;

import java.util.List;

public class PersonSort {
	
	public static void lambdaSorter() {
		List<Person> pList = Person.getPeople();
		pList.sort((p1, p2) -> Person.compare(p1, p2));
		System.out.println("Sorting with Lambda: " + pList);
	}
	
	public static void methodSorter() {
		List<Person> pList = Person.getPeople();
		pList.sort(Person::compare);
		System.out.println("Sorting with Method Reference: " + pList);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		lambdaSorter();
		methodSorter();
	}

}
