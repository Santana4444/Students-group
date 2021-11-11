package sample;

import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Student student1 = new Student("Potter", "Garry", 12, Gender.MALE, "The Gryffindor", 919801);
		Student student2 = new Student("Granger", "Hermione", 11, Gender.FEMALE, "The Gryffindor",919802 );
		Student student3 = new Student("Weasley", "Ron", 12, Gender.MALE, "The Gryffindor", 919803);
		Student student4 = new Student("Longbottom", "Neville", 12, Gender.MALE, "The Gryffindor", 919804);
		Student student5 = new Student("Brown", "Lavender", 11, Gender.FEMALE, "The Gryffindor", 919805);
		Student student6 = new Student("Thomas", "Dean", 12, Gender.MALE, "The Gryffindor", 919806);
		Student student7 = new Student("Malfoy", "Draco", 12, Gender.MALE, "The Slytherin", 919807);
		Student student8 = new Student("Bulstrode", "Millicent", 12, Gender.FEMALE, "The Slytherin", 919808);
		Student student9 = new Student("Goyle", "Gregory", 13, Gender.MALE, "The Slytherin", 919809);
		Student student10 = new Student("Patil", "Padma", 12, Gender.FEMALE, "The Ravenclaw", 919810);
		Student student11 = new Student("Abbott", "Hannah", 12, Gender.FEMALE, "The Hufflepuff", 919811);
		
		
		Group group = new Group();
		group.setName("Dumbledore's Army");
		group.addStudent(student1);
		group.addStudent(student2);
		group.addStudent(student3);
		group.addStudent(student4);
		group.addStudent(student5);
		group.addStudent(student6);
		group.addStudent(student7);
		group.addStudent(student8);
		group.addStudent(student9);
		group.addStudent(student10);
		group.addStudent(student11);
		
		System.out.println(group);
		
		group.deleteStudent(919807);
		
		
		Student student = group.searchByLastName("Patil");
		System.out.println ("Found student: "+ student);

		
		
	}

}
