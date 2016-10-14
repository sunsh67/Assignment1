package Assignment5;

import java.util.ArrayList;
import java.util.Formatter;
import java.util.List;

public class Checkout {

	protected List<DessertItem> list;
	protected int size;
	private Formatter f = new Formatter(System.out);

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

	public void printReceipt() {
		f.format("      %s\n", DessertShoppe.STORE);
		f.format("--------------------------------\n");
		for (DessertItem des : list)
			f.format("%-20s %1s %5.2f\n", des,"\t",DessertShoppe.cents2dollarsAndCents(des.getCost()));
	   f.format("%-20s %1s %5.2f\n", "Tax ","\t",DessertShoppe.cents2dollarsAndCents(this.totalTax()));
	   f.format("%-20s %1s %5.2f\n", "Total Cost ","\t",DessertShoppe.cents2dollarsAndCents(this.totalCost()+this.totalTax()));
}
}
