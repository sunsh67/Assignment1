package Assignment5;

public class Sundae extends IceCream {

   private String topping;
   private int priceOfTopping;
	public Sundae(String name, int costOfIcecream,String topping,int priceOfTopping) {
		super(name, costOfIcecream);
		this.topping=topping;
		this.priceOfTopping=priceOfTopping;
		// TODO Auto-generated constructor stub
	}

	@Override
	public int getCost() {
		// TODO Auto-generated method stub
		return super.getCost()+this.priceOfTopping;
	}

}
