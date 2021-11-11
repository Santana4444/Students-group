package sample;

import java.util.Arrays;

public class Group {
	private String name;
	private Student[] stud = new Student[10];

	public Group(String name, Student[] stud) {
		this.name = name;
		this.stud = stud;
	}

	public Group() {
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Student[] getStud() {
		return stud;
	}

	public void setStud(Student[] stud) {
		this.stud = stud;
	}

	public void addStudent(Student student) {
		for (int i = 0;; i++) {
			try {
				if (i >= stud.length) {
					throw new GroupOverflowException();
				}

				if (stud[i] == null) {
					stud[i] = student;
					break;
				}

			} catch (GroupOverflowException e) {
				System.err.println(e.getMessage());
				break;
			}
		}
	}

	public void deleteStudent(long id) {
		for (int i = 0; i < stud.length; i++) {
			if (stud[i] != null && stud[i].getId() == id) {
				stud[i] = null;
				System.out.println ("The student with id: " + id + " was del");
			} 
					
		}
	}

	public Student searchByLastName (String lastName) {
		for (Student student : stud) {
			if (student != null && student.getLastName().equalsIgnoreCase(lastName)) {
				return student;
			}
		}
		return null;
	}

	@Override
	public String toString() {
		return "Group name: " + name + ", full information of student:" + Arrays.toString(stud) + "]";
	}

}
