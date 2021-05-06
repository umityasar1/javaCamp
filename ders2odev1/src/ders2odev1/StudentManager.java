package ders2odev1;

public class StudentManager {

	public void add(Student student) {

		System.out.println("Ogrenci Eklendi " + student.firstName);

	}

	public void remove(Student student) {

		System.out.println("Ogrenci Silindi " + student.firstName);
	}

	public void showInfo(Student student) {

		System.out.println(student.id + " " + student.firstName + " " + student.lastName + " " + student.details);

	}

	public void showAllInfo(Student[] students) {

		for (Student student : students) {

			System.out.println(student.id + " " + student.firstName + " " + student.lastName + " " + student.details);

		}

	}

}
