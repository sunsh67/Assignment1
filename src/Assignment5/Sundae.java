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
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		String name=this.name+" with\n"+this.topping;
		String s="";
		for(int i=1;i<DessertShoppe.MAX_ITEM_NAME_SIZE-this.topping.length();i++) s+=" ";
		return name+s;
	}
}
