package ders3Odev;

public class Main {

	public static void main(String[] args) {

		Student umit = new Student();
		umit.setStudentNo(778083);
		umit.setUserNumber(220520);
		umit.lessons = "Java";
		
		

		Instructor engin = new Instructor();
		engin.setInstructorNo(11223344); 

		UserManager userManager = new StudentManager();
		userManager.add(umit);
		
		StudentManager studentManager = new StudentManager();
		studentManager.remove(umit);
		
       
	}

}
