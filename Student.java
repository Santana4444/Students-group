package sample;

public class Student extends Human {

	private String group;
	private long id;
	
	public Student(String lastName, String firstName, int age, Gender gender, String group, long id) {
		super(lastName, firstName, age, gender);
		this.group = group;
		this.id = id;
	}

	public Student() {
	}

	public String getGroup() {
		return group;
	}

	public void setGroup(String group) {
		this.group = group;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Student group:" + group + ", id: " + id +
				". Personal Information: lastName - " + getLastName() +
				", firstName - " + getFirstName() +
				", age - " + getAge() + " year old, gender - " + getGender() + ".";
	}

}
