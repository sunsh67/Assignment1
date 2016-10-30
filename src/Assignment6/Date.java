package Assignment6;

public class Date {

	int month;
	int day;
	int year;

	public Date(int month, int day, int year) {
		try {
			if (day <= 1 && day >= 31) {
				this.day = day;
			}
			if (month >= 1 && month <= 12) {
				this.month = month;
			}
			if (String.valueOf(year).length() == 4) {
				this.year = year;
			}
		} catch (NumberFormatException e) {
			System.out.println("Invalid date formart");
		}
	}

}
