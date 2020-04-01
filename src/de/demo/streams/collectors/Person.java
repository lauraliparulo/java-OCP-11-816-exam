package de.demo.streams.collectors;

public class Person {

	public String firstName;
	private String lastName;
	private String city;
	public int age;
	private String state;
	
	public Person(String firstName,  int age) {
//		super();
		this.firstName = firstName;
		this.age = age;

	}
	
	public Person(String firstName, String lastName, String city, String state, int age) {
		this(firstName,age);
		this.lastName = lastName;
		this.city = city;		
		this.state = state;

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
