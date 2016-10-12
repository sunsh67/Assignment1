package Assignment5;

import java.util.ArrayList;
import java.util.List;

public class Checkout {

	List<DessertItem> list=null;
	protected DessertShoppe mm=new DessertShoppe("M & M Dessert Shoppe", 0.02, 0, 0);
	
	
	public Checkout(){
		list=new ArrayList<DessertItem>();
	}
	
	public int numberOfItems(){
		return list.size();
	}
	
	public void enterItem(DessertItem item){
		list.add(item);
	}
	
	public void clear(){
		list.clear();
	}
	
	public int totalCost(){
		int totalCost=0;
		for(int i=0;i<list.size();i++){
			totalCost+=list.get(i).getCost();
		}
		return totalCost;
		
	}
	
	public int totalTax(){
		return (int)(this.totalCost()*mm.getTaxRate());
	}
	
	public String toString(){
		String output="";
		for( DessertItem des:list)
		output+= des.getName()+"   "+mm.cents2dollarsAndCents(des.getCost())+"\n";
		return output+"Tax"+"   "+mm.cents2dollarsAndCents(this.totalTax())+"\n"+"Total Cost"+"   "+mm.cents2dollarsAndCents(this.totalCost());
		
	}
}
