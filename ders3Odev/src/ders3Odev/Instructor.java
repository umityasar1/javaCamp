package ders3Odev;

public class Instructor extends User {
//verdi�i kurslar
	int instructorNo;
	String lectures;
	public int getInstructorNo() {
		return instructorNo;
	}
	public void setInstructorNo(int instructorNo) {
		this.instructorNo = instructorNo;
	}
	public String getLectures() {
		return lectures;
	}
	public void setLectures(String lectures) {
		this.lectures = lectures;
	}
	
	
}
