package Assignment5;

public class DessertShoppe {

	private double taxRate;
	private String store;
	private int sizeOfname;
	private int widthOfDisplay;
	public DessertShoppe(String store,double taxRate,int sizeOfname,int widthOfDisplay){
		this.sizeOfname=sizeOfname;
		this.store=store;
		this.taxRate=taxRate;
		this.widthOfDisplay=widthOfDisplay;
	}
	
	public double cents2dollarsAndCents(int cents){
		return (double)cents/100;
	}

	public String toString(){
		return "    "+this.getStore()+"\n"+"____________________________";
		
	}
	public double getTaxRate() {
		return taxRate;
	}

	public void setTaxRate(double taxRate) {
		this.taxRate = taxRate;
	}

	public String getStore() {
		return store;
	}

	public void setStore(String store) {
		this.store = store;
	}

	public int getSizeOfname() {
		return sizeOfname;
	}


	public int getWidthOfDisplay() {
		return widthOfDisplay;
	}

	public void setWidthOfDisplay(int widthOfDisplay) {
		this.widthOfDisplay = widthOfDisplay;
	}
	
}
