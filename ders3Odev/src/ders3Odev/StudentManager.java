package ders3Odev;

public class StudentManager extends UserManager {

	public void addLessons(Student student) {

		System.out.println(student.lessons + " dersi eklendi");

	}

	public void removeLessons(Student student) {

		System.out.println(student.lessons + " dersi kaldirildi");

	}

	public void remove(Student student) {

		System.out.println(student.studentNo + " numarali ogrenci kaldirildi");

	}
	
	
}
