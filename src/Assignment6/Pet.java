package Assignment6;


public class Pet {
	private String name;
	private String ownerName;
	private String color;
	public static final int MALE = 1, FEMALE = 2, SPAYED = 3, NEUTERED = 4;
	private String sex;

	public Pet(String name, String ownerName, String color) {
		this.name = name;
		this.ownerName = ownerName;
		this.color = color;
	}

	public String getName() {
		return name;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(int sexid) {
		try {
			switch (sexid) {
			case MALE:
				sex = "MALE";
				break;
			case FEMALE:
				sex = "FEMALE";
				break;
			case SPAYED:
				sex = "SPAYED";
				break;
			case NEUTERED:
				sex = "NEUTERED";
				break;
			}
		} catch (Exception e) {
			throw new IllegalArgumentException("Value not allowed!");
		}
	}

	public String getOwnerName() {
		return ownerName;
	}

	public String getColor() {
		return color;
	}

	@Override
	public String toString() {
		String name=this.getName();
		String owner=this.getOwnerName();
		String color=this.getColor();
		String sex=this.getSex();
		return name+" owned by "+owner+"\nColor: "+color+"\nSex: "+sex+"\n";
	}

}
