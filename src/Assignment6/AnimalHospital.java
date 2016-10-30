package Assignment6;

import java.util.ArrayList;
import java.util.List;

public class AnimalHospital {

	private List<Pet> pets=new ArrayList<>();
	
	
	void printPetInfoByName(String name){
		for(Pet p:pets){
			if(p.getName()==name){
				System.out.println(p.toString());
			}
		}
		
	}
	void printPetInfoByOwner(String OwnerName){
		for(Pet p:pets){
			if(p.getOwnerName()==OwnerName){
				System.out.println(p.toString());
			}
		}
		
	}
	void printPetsBoarding(int month,int day,int year){
		
		for(Pet p:pets){
			if(p.getClass().toString().endsWith("Cat")){
				if(((Cat)p).boarding(month, day, year)){
					System.out.println(p.toString());
				}
			}
			if(p.getClass().toString().endsWith("Dog")){
				if(((Dog)p).boarding(month, day, year)){
					System.out.println(p.toString());
				}
			}
		}
	}
}
