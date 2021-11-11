package sample;

import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Student student1 = new Student("Potter", "Garry", 12, Gender.MALE, "The Gryffindor", 2356);
		Student student2 = new Student("Granger", "Hermione", 12, Gender.FEMALE, "The Gryffindor", 4589);
		
		Group group = new Group();
		
		group.addStudent(student1);


	

		System.out.println(group);
		
	}

}
