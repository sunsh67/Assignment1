package Assignment5;

public class DessertShoppe {

	protected final static double TAXRATE=0.02;
	protected final static String STORE=" M & M Dessert Shoppe";
	protected final static int MAX_ITEM_NAME_SIZE=25;
	protected final static int COST_WIDTH=6;
	
	
	protected static double cents2dollarsAndCents(int cents){
		return (double)cents/100;
	}

}