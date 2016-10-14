package Assignment5;

public class Cookie extends DessertItem{

	private int number;
	private double pricePerDozen;
	public Cookie(String name,int number,double pricePerDozen){
		super(name);
		this.number=number;
		this.pricePerDozen=pricePerDozen;	}
	@Override
	public int getCost() {
		// TODO Auto-generated method stub
		return (int)((this.number*this.pricePerDozen)/12);
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		String info= this.number+" @ "+this.pricePerDozen+" /dz.\n";
		return info+super.toString();
	}

}
