package de.demo.streams.collectors;

public class Person {

	private String firstName;
	private String lastName;
	private String city;
	private int age;
	private String state;
	
	public Person(String firstName, String lastName, String city, String state, int age) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.city = city;		
		this.state = state;
		this.age = age;

	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	@Override
	public String toString() {
		return "Person [firstName=" + firstName + ", lastName=" + lastName + ", city=" + city + ", age=" + age
				+ ", state=" + state + "]";
	}

	
	
}
