package Assignment4;

public class GasTank {

	private double amount;
	
	public GasTank(){
		this.amount=0;
	}
	
	public double addGas(double gas){
		return this.amount+=gas;
	}
	
	public double useGas(double gas){
		if(this.amount<0){
			return amount=0;
		}else{
		return this.amount-=gas;}
	}
	
	public double getGasLevel(){
		return this.amount;
	}

}
