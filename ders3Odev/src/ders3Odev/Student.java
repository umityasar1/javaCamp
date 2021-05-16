package ders3Odev;

public class Student extends User{
// aldýðý kurslar
	int studentNo;
	String lessons;
	public int getStudentNo() {
		return studentNo;
	}
	public void setStudentNo(int studentNo) {
		this.studentNo = studentNo;
	}
	public String getLessons() {
		return lessons;
	}
	public void setLessons(String lessons) {
		this.lessons = lessons;
	}
	
	
}
