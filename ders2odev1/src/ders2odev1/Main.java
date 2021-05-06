package ders2odev1;

public class Main {

	public static void main(String[] args) {

		Instructer instructer = new Instructer(1, "Umit", "Yasar", "Onun adi  Umit");

		Student student = new Student(1, "Umit", "Yasar", "Onun adi  Umit") ; 
			
			
		StudentManager studentManager = new StudentManager() ;
		
		studentManager.add(student);
		
			
		Student[] students = {new Student(1, "Umit", "Yasar", "Onun adi  Umit"), new Student(3, "Cagri", "Bahar", "Mersin" )} ;
		
		
		studentManager.showAllInfo(students);
 	}

}
