package Assignment4;

public class driveMyCar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Driver david=new Driver("david","123456");
	       david.car=new Car("WA98102","Toyato","Sliver");
	       david.gasTank=new GasTank();
	       david.getDriverInformation(david);
	       david.getCarInformation(david);
	       david.addGas(david);
	       while(david.gasTank.getGasLevel()>0)
	       {
	       david.drive(david);}	}

}
