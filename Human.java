package sample;

public class Human {
	
	private String lastName;
	private String firstName;
	private int age;
	private Gender gender;
	
	public Human(String lastName, String firstName, int age, Gender gender) {
		this.lastName = lastName;
		this.firstName = firstName;
		this.age = age;
		this.gender = gender;
	}

	public Human() {
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "Personal Information: lastName -" + lastName + 
				", firstName -" + firstName +
				", age -" + age + "year old, gender -" + gender + ".";
		}
	}
