package Assignment6;

import java.util.ArrayList;
import java.util.List;

public class AnimalHospital {

	private List<Pet> pets = new ArrayList<>();

	public AnimalHospital() {
		initializeForTest();
	}

	private void initializeForTest() {
		Pet p1 = new Cat("Tom", "Gary", "brown", "short");
		Pet p2 = new Dog("Zoey", "Tracy", "yellow", "large");
		p1.setSex(Pet.NEUTERED);
		p2.setSex(Pet.MALE);
		((Cat) p1).setBoardStart(3, 14, 2001);
		((Cat) p1).setBoardEnd(3, 15, 2001);
		((Dog) p2).setBoardStart(3, 14, 2001);
		((Dog) p2).setBoardEnd(3, 25, 2001);
		pets.add(p1);
		pets.add(p2);

	}

	protected void printPetInfoByName(String name) {
		for (Pet p : pets) {
			if (p.getName() == name) {
				System.out.println(p.toString());
			}
		}

	}

	protected void printPetInfoByOwner(String OwnerName) {
		for (Pet p : pets) {
			if (p.getOwnerName() == OwnerName) {
				System.out.println(p.toString());
			}
		}

	}

	protected void printPetsBoarding(int month, int day, int year) {

		for (Pet p : pets) {
			if (p.getClass().toString().endsWith("Cat")) {
				if (((Cat) p).boarding(month, day, year)) {
					System.out.println(p.toString());
				}
			}
			if (p.getClass().toString().endsWith("Dog")) {
				if (((Dog) p).boarding(month, day, year)) {
					System.out.println(p.toString());
				}
			}
		}
	}
}
