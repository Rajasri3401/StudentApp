class Student
{
	String name;
	int rollnum;
	String course;
	String email;
	long mobile;
	String address;
	char gender;
	int yearofjoining;
	
	public void printStudent()
	{
		System.out.println("Student Name:" + name);
		System.out.println("Student RollNum:" + rollnum);
		System.out.println("Student Course:" + course);
		System.out.println("Student Email:" + email);
		System.out.println("Student Mobile:" + mobile);
		System.out.println("Student Address:" + address);
		System.out.println("Student Gender:" + gender);
		System.out.println("Student Joining Year:" + yearofjoining);
	}
}	
	


class StudentManager
{
	public static void main(String args[])
	{
		Student ram = new Student();
		ram.name = "Ramu";
		ram.rollnum = 1;
	    ram.course = "Java";
	    ram.email = "ram@gmail.com";
		ram.mobile = 9898989898l;
		ram.address ="Hyderabad";
		ram.gender = 'M';
		ram.yearofjoining=2022;
		
		
		ram.printStudent();
	}
}