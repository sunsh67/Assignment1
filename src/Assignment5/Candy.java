package Assignment5;

public class Candy extends DessertItem{

	private double weight;
	private double pricePerPound;
    public Candy(String name,double weight,double pricePerPound){
        super(name);
    	this.weight=weight;
    	this.pricePerPound=pricePerPound;
    }
	@Override
	public int getCost() {
		// TODO Auto-generated method stub
		return (int)(this.pricePerPound*this.weight);
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		String info=this.weight+" lbs."+" @ "+this.pricePerPound
				+" /lb.\n";
		return info+super.toString();
	}

	
}
