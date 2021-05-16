package ders3Odev;

public class InstructorManager extends UserManager {

	public void addLessons(Instructor instructor) {

		System.out.println(instructor.lectures + " dersi eklendi");

	}
	
	public void removeLessons(Instructor instructor) {

		System.out.println(instructor.lectures + " dersi kaldirildi");

	}
}
