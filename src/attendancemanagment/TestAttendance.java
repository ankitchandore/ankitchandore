package attendancemanagment;

public class TestAttendance {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Admin admin=new Admin();
		Teacher teacher=new Teacher("100","hema","p123","h@gmail.com");
		
		admin.addNewTeacher(teacher);
		
		Teacher teacher1=new Teacher("200","hema kumari","p1234","he@gmail.com");
		
		admin.addNewTeacher(teacher1);
		
		Teacher[] tlist=admin.getTeacherList();
		
		for(int i=0;i<Admin.tcount;i++)
		{
			System.out.println(tlist[i]);
		}
		/*for(Teacher t : tlist)
		{
			System.out.println(t);
		}*/
	}

}


