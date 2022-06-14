package week11;
import java.util.ArrayList;
import java.util.List;

public class Person {
	private String name;
	private int age;
	private String gender;
	private String race;
	
	public static List<Person> people = new ArrayList<>(List.of(
			new Person("Joe", 26, "Male", "White"),
			new Person("Mary", 19, "Female", "White"),
			new Person("Jose", 57, "Male", "Hispanic"),
			new Person("Geoffrey", 38, "Male", "Black")
			));
	
	public Person(String name, int age, String gender, String race) {
		this.setName(name);
		this.setGender(gender);
		this.age = age;
		this.race = race;
	}

	public String getRace() {
		return race;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String toString() {
		return getName() + " " + "Person";
	}
	
	public static int compare(Person p1, Person p2) {
		return p1.getName().compareTo(p2.getName());
	}
	
	public static List<Person> getPeople(){
		return people;
	}
	
	
}
