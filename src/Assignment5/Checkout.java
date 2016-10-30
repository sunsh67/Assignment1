package Assignment5;

import java.util.ArrayList;
import java.util.Formatter;
import java.util.List;

public class Checkout {

	protected List<DessertItem> list;
	protected int size;

	public Checkout() {
		size = 100;
		list = new ArrayList<DessertItem>(size);
	}

	public int numberOfItems() {
		return list.size();
	}

	public void enterItem(DessertItem item) {
		list.add(item);
	}

	public void clear() {
		list.clear();
	}

	public int totalCost() {
		int totalCost = 0;
		for (int i = 0; i < list.size(); i++) {
			totalCost += list.get(i).getCost();
		}
		return totalCost;

	}

	public int totalTax() {
		return (int) (this.totalCost() * DessertShoppe.TAXRATE);
	}


	public String toString(){
		String receipt="";
		receipt+="      "+DessertShoppe.STORE+"\n"+"--------------------------------\n";
		for(DessertItem des:list){
			receipt+=des.toString()+DessertShoppe.cents2dollarsAndCents(des.getCost())+"\n";
		}
		receipt+="Tax                     "+DessertShoppe.cents2dollarsAndCents(this.totalTax())+"\n";
		receipt+="Total Cost             "+DessertShoppe.cents2dollarsAndCents(this.totalCost()+this.totalTax());
		
        return receipt;
	}
}
