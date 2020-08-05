package xlsxProject;

public class Student {

	private int rollNo;

	private String firstName;

	private String lastName;

	private String subject;

	public Student(int rollNo, String firstName, String lastName, String subject) {
		super();
		this.rollNo = rollNo;
		this.firstName = firstName;
		this.lastName = lastName;
		this.subject = subject;
	}

	public int getRollNo() {
		return rollNo;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getSubject() {
		return subject;
	}

}
