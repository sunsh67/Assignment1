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

	public boolean early(Date date) {
		if (this.year < date.year) {
			return true;
		} else if (this.year == date.year && this.month < date.month) {
			return true;
		} else if (this.year == date.year && this.month == date.month && this.day < date.day) {
			return true;
		}
		return false;
	}

	public boolean late(Date date) {
		if (this.year > date.year) {
			return true;
		} else if (this.year == date.year && this.month > date.month) {
			return true;
		} else if (this.year == date.year && this.month == date.month && this.day >= date.day) {
			return true;
		}
		return false;
	}
}
