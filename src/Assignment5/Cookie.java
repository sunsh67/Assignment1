package Assignment5;

public class Cookie extends DessertItem{

	private int number;
	private int pricePerDozen;
	public Cookie(String name,int number,int pricePerDozen){
		super(name);
		this.number=number;
		this.pricePerDozen=pricePerDozen;	}
	@Override
	public int getCost() {
		// TODO Auto-generated method stub
		return (int)((this.number*this.pricePerDozen)/12);
	}

}
