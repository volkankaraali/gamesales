package Entities;

public class Player {

	private int id;
	private String firstName;
	private String lastName;
	private String identityNo;
	private int yearOfBirthDay;
	
	public Player() {
		
	}

	public Player(int id, String firstName, String lastName, String identityNo, int yearOfBirthDay) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.identityNo = identityNo;
		this.yearOfBirthDay = yearOfBirthDay;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public String getIdentityNo() {
		return identityNo;
	}

	public void setIdentityNo(String identityNo) {
		this.identityNo = identityNo;
	}

	public int getYearOfBirthDay() {
		return yearOfBirthDay;
	}

	public void setYearOfBirthDay(int yearOfBirthDay) {
		this.yearOfBirthDay = yearOfBirthDay;
	}

	
}
