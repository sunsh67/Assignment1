package Assignment6;

public class Cat extends Pet implements Boardable {

	private String hairLength;
	private Date start, end;

	public Cat(String name, String ownerName, String color, String hairLength) {
		super(name, ownerName, color);
		this.hairLength = hairLength;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void setBoardStart(int month, int day, int year) {
		// TODO Auto-generated method stub
		start = new Date(month, day, year);

	}

	@Override
	public void setBoardEnd(int month, int day, int year) {
		// TODO Auto-generated method stub
		end = new Date(month, day, year);

	}

	@Override
	public boolean boarding(int month, int day, int year) {
		// TODO Auto-generated method stub
		Date boarding = new Date(month, day, year);
		if (boarding.year >= start.year && boarding.month >= start.month && boarding.day >= start.day) {
			if (boarding.year <= end.year && boarding.month <= end.month && boarding.day <= end.day) {
				return true;
			}
		}
		// System.out.println("This pet is not bearding at "+month+"/"+day+"/"+year);
		return false;
	}

	@Override
	public String toString() {
		String hairLength = this.getHairLength();
		return "CAT:\n" + super.toString() + "Hair: " + hairLength;
	}

	public String getHairLength() {
		return hairLength;
	}

}
