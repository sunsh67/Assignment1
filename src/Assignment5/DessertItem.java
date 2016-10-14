package Assignment5;

public abstract class DessertItem {

	protected String name;
	public DessertItem() {
	};
	public DessertItem(String name){
		this.name=name;
	}
	public final String getName(){
		return this.name;
	}
	public abstract int getCost();
	public String toString(){
		String name=this.getName();
		if(name.length()>DessertShoppe.MAX_ITEM_NAME_SIZE)
			name=name.substring(0, DessertShoppe.MAX_ITEM_NAME_SIZE)+"\n"+name.substring(DessertShoppe.MAX_ITEM_NAME_SIZE,name.length()-1);
		return name;
	};
}
