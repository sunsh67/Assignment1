package Assignment4;

import java.util.Scanner;

public class Driver {

	private String name;
	private String driverLicence;
	protected GasTank gasTank=null;
	protected Car car=null;
	private Scanner scanner=new Scanner(System.in);
	
	public Driver(String name,String driverLicence){
		this.name=name;
		this.driverLicence=driverLicence;
	}
	
	public void drive(Driver driver){
		System.out.println("please enter miles to drive:");
	    double miles=scanner.nextDouble();
	       if(miles>driver.gasTank.getGasLevel()){
	    	   System.out.println("Sorry, the gas left is only for"+driver.gasTank.getGasLevel()+" miles");
	       }else{
	    	   driver.gasTank.useGas(miles);
	    	   System.out.println(driver.getName()+"has drived for "+miles+" miles, now the gas left is "+driver.gasTank.getGasLevel()+"L");
	       }
		
	}
	public void addGas(Driver driver){
		 double gas=0;
		 if(driver.gasTank.getGasLevel()==0){
		       System.out.println("Now, the amount of gas in gas tank is 0, please add some gas:");
		       gas=scanner.nextDouble();
		       driver.gasTank.addGas(gas);
		       System.out.println("So,the gas is added to: "+driver.gasTank.getGasLevel()+"L");
		       }
	}
    public void getDriverInformation(Driver driver){
    	System.out.println("The Driver is "+driver.getName()+" and his Driver's License number is "+driver.getDriverLicence());
    }
    public void getCarInformation(Driver driver){
    	System.out.println("His/her car is a "+driver.car.getColor()+" "+driver.car.getBrand()+" and the platenumber is "+driver.car.getNumberPlate());
    }
	
	String getName() {
		return name;
	}
	void setName(String name) {
		this.name = name;
	}
	String getDriverLicence() {
		return driverLicence;
	}
	void setDriverLicence(String driverLicence) {
		this.driverLicence = driverLicence;
	}

}
