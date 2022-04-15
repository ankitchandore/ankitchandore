package attendancemanagment;

public class Admin {

	String id;
	private String name;
	private String password;
	private String emailId;
	final static int SIZE=5;
	static int tcount=0;
	
	Teacher[] teachers=new Teacher[SIZE];
	
	Student[] students=new Student[SIZE];
	
	Admin[] admin=new Admin[SIZE];
	
	public void addNewTeacher(Teacher teacher)
	{
		teachers[tcount]=teacher;
		tcount++;
		
	}
	public Teacher[] getTeacherList()
	{
		return teachers;
	}
	
	public void modifyTeacher()
	{
		
	}
	public void removeTeacher()
	{
		
	}
	public void addNewStudent()
	{
		
	}
	public void modifyStudent()
	{
		
	}
	public void removeStudent()
	{
		
	}
	public void addNewAdmin()
	{
		
	}
	public void modifyAdmin()
	{
		
	}
	public void removeAdmin()
	{
		
	}
	public void enrollStudentForCourse()
	{
		
	}
	public void unrollStudentForCourse()
	{
		
	}
	
}

