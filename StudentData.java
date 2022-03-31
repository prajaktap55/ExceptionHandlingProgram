package Exception;

public class StudentData {
	
	public  StudentData find(String student_Id)throws StudentNotFoundException
	{
		if(student_Id.equals("1000"))
		{
			return new StudentData();
		}	
		else
		{
			throw new StudentNotFoundException("Not Found Student"+student_Id);
		}
	}
	public static void main(String args[])
	{
		StudentData sd=new StudentData();
		try
		{
			sd.find("10002");
		}
		catch(StudentNotFoundException ex)
		{
		System.out.println(ex);
		}
	}
}
//output:-> Exception.StudentNotFoundException: Not Found Student10002

