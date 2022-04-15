package attendancemanagment;

public class Teacher {
	String id;
	private String name;
	private String password;
	private String emailId;
	
	
	
	public Teacher(String id, String name, String password, String emailId) {
		super();
		this.id = id;
		this.name = name;
		this.password = password;
		this.emailId = emailId;
	}
	public void addLectures()
	{
		
	}
	public void markAttendance()
	{
		
	}
	public void viewAttendance()
	{
		
	}
	public void prepareAttendanceReport()
	{
		
	}
	public void viewAttendanceReport()
	{
		
	}
	@Override
	public String toString() {
		return "Teacher [id=" + id + ", name=" + name + ", password=" + password + ", emailId=" + emailId + "]";
	}
	

}
