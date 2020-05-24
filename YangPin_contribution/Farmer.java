
public class Farmer {
	private int age;
	private String firstName;
	private String lastName;
	public Crop plant;
	public Animal specy;
	public Item water;
	
	public Farmer(int age, String firstName, String lastName) {
		this.age = age;
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	public int getAge() {
		return  age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Override
	public String toString() {
		return String.format("%s %s, %d years old", firstName, lastName, age);
	}
	
//	public void water(Crop plant, Item water) {
//		plant.cropWater(water);
//	}

	
	
	
}












