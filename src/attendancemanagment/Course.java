package attendancemanagment;

public class Course {
	String id;
	String name; 
	Teacher teacher;//composation relationship or has a relationship
	Student[] enrolledStudents;

	Teacher[] teachers;

	Student[] getEnrolledStudents()
	{
		
	return enrolledStudents;	
	}


	}


