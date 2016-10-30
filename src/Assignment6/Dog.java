package Assignment6;

public class Dog extends Pet implements Boardable{

	private String size;
	private Date start,end;
	public Dog(String name, String ownerName, String color,String size) {
		super(name, ownerName, color);
		this.size=size;
		// TODO Auto-generated constructor stub
	}

	public String getSize() {
		return size;
	}

	@Override
	public String toString() {
	    String size = this.getSize();
		return "DOG:\n" + super.toString() + "Hair: " + size;
	}

	@Override
	public void setBoardStart(int month, int day, int year) {
		// TODO Auto-generated method stub
		 start=new Date(month,day,year);

	}

	@Override
	public void setBoardEnd(int month, int day, int year) {
		// TODO Auto-generated method stub
		 end=new Date(month,day,year);

	}

	@Override
	public boolean boarding(int month, int day, int year) {
		// TODO Auto-generated method stub
		Date boarding = new Date(month, day, year);
		if(boarding.year>=start.year&&boarding.month>=start.month&&boarding.day>=start.day){
			if(boarding.year<=end.year&&boarding.month<=end.month&&boarding.day<=end.day){
				return true;
			}
		}
		//System.out.println("This pet is not bearding at "+month+"/"+day+"/"+year);
		return false;
	}

}
