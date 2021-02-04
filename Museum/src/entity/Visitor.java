package entity;

public class Visitor {
	private int age;
	private String gender;
	private String name;
	private String date;

	public Visitor() {

	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {

		this.gender = gender;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Visitor(int age, String gender, String name, String date) {
		super();
		this.age = age;
		this.gender = gender;
		this.name = name;
		this.date = date;
	}

}
