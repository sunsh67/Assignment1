package Assignment4;

import java.util.Scanner;

public class Driver {

	private String name;
	private String driverLicence;
	private GasTank gasTank=null;
	private Car car=null;
	
	public Driver(String name,String driverLicence){
		this.name=name;
		this.driverLicence=driverLicence;
	}
	
	public void drive(double miles){
		double gas=miles;
		gasTank.useGas(gas);
	}
	public double addGas(double gas){
		return gasTank.addGas(gas);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
       Driver david=new Driver("david","123456");
       david.car=new Car("WA98102","Toyato","Sliver");
       david.gasTank=new GasTank();
       System.out.println("The Driver is "+david.getName()+" and his Driver's License number is "+david.getDriverLicence());
       System.out.println("His/her car is a "+david.car.getColor()+" "+david.car.getBrand()+" and the platenumber is "+david.car.getNumberPlate());
       double gas=0;
       if(david.gasTank.getGasLevel()==0){
       System.out.println("Now, the amount of gas in gas tank is 0, please add some gas:");
       gas=scanner.nextDouble();
       david.addGas(gas);
       System.out.println("So,the gas is added to: "+david.gasTank.getGasLevel());
       }
       System.out.println("please enter miles to drive:");
       double miles=scanner.nextDouble();
       if(miles>david.gasTank.getGasLevel()){
    	   System.out.println("Sorry, the gas left is only for"+david.gasTank.getGasLevel()+"miles");
       }else{
    	   david.drive(miles);
    	   System.out.println(david.getName()+"has drived for "+miles+" miles, now the gas left is "+david.gasTank.getGasLevel());
       }
       scanner.close();
       
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
