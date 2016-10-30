package Assignment6;

public class Date {

	int month;
	int day;
	int year;

	public Date(int month, int day, int year) {
		if (this.isDateEligible(month, day, year)) {
			this.month = month;
			this.day = day;
			this.year = year;
		} else {
			System.out.println("Invalid Date");
		}

	}

	private boolean isDateEligible(int month, int day, int year) {
		if (month < 1 || month > 12) {
			return false;
		} else if (day < 1 || day > 31) {
			return false;
		} else if (String.valueOf(year).length() != 4) {
			return false;
		} else {
			return true;
		}
	}

}
