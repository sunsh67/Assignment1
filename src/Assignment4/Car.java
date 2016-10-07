package Assignment4;

public class Car {

	private String numberPlate;
	private String brand;
	private String color;
	
	public Car(String numberPlate,String brand,String color){
		this.numberPlate=numberPlate;
		this.brand=brand;
		this.color=color;
	}
	
	String getNumberPlate() {
		return numberPlate;
	}
	void setNumberPlate(String numberPlate) {
		this.numberPlate = numberPlate;
	}
	String getBrand() {
		return brand;
	}
	void setBrand(String brand) {
		this.brand = brand;
	}
	String getColor() {
		return color;
	}
	void setColor(String color) {
		this.color = color;
	}
	
	
}
