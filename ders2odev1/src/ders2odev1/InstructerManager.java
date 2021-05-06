package ders2odev1;

public class InstructerManager {

	public void add(Instructer instructer) {

		System.out.println("Egitmen Eklendi " + instructer.firstName);

	}

	public void remove(Instructer instructer) {

		System.out.println("Egitmen Silindi " + instructer.firstName);
	}

	public void showInfo(Instructer instructer) {

		System.out.println(
				instructer.id + " " + instructer.firstName + " " + instructer.lastName + " " + instructer.details);

	}

	public void showAllInfo(Instructer[] instructers) {

		for (Instructer instructer : instructers) {

			System.out.println(
					instructer.id + " " + instructer.firstName + " " + instructer.lastName + " " + instructer.details);

		}

	}

}
