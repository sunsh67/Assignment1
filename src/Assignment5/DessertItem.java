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
		String s="";
		for(int i=1;i<DessertShoppe.MAX_ITEM_NAME_SIZE-name.length();i++) s+=" ";
		return name+s;
	};
}
