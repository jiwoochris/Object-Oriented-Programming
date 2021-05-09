package myPackage;

public class Ex9_10_Person {
	private String name;
	public Ex9_10_Person()
	 {
	 name = "No name yet";
	 }
	public Ex9_10_Person(String initialName)
	 {
	 name = initialName;
	 }
	public void setName(String newName)
	 {
	 name = newName;
	 }
	public String getName()
	 {
	return name;
	 }
	public void writeOutput()
	 {
	 System.out.println("Name: " + name);
	 }
	public boolean hasSameName(Ex9_10_Person otherPerson)
	 {
	return this.name.equalsIgnoreCase(otherPerson.name);
	 }
}


////////////////////////////////////////////////////////////////////////////////////////


package myPackage;

public class Ex9_10_Student extends Ex9_10_Person{
	private int studentNumber;
	public Ex9_10_Student()
	 {
	super();
	 studentNumber = 0;//Indicating no number yet
	 }
	public Ex9_10_Student(String initialName, int initialStudentNumber)
	 {
	super(initialName);
	 studentNumber = initialStudentNumber;
	 }
	public void reset(String newName, int newStudentNumber)
	 {
	setName(newName);
	 studentNumber = newStudentNumber;
	 }
	public int getStudentNumber()
	 {
	return studentNumber;
	 }
	public void setStudentNumber(int newStudentNumber)
	 {
	 studentNumber = newStudentNumber;
	 }
	public void writeOutput()
	 {
	 System.out.println("Name: " + getName());
	 System.out.println("Student Number: " + studentNumber);
	 }
	public boolean equals(Ex9_10_Student otherStudent)
	 {
	return this.hasSameName(otherStudent) &&
	 (this.studentNumber == otherStudent.studentNumber);
	 }
	}



////////////////////////////////////////////////////////////////////////////////////


package myPackage;

public class Ex9_10_Undergraduate extends Ex9_10_Student{
	private int level; //1 for freshman, 2 for sophomore
	//3 for junior, or 4 for senior.
	public Ex9_10_Undergraduate()
	 {
	super();
	 level = 1;
	 }
	public Ex9_10_Undergraduate(String initialName,
	int initialStudentNumber, int initialLevel)
	 {
	super(initialName, initialStudentNumber);
	 setLevel(initialLevel); //checks 1 <= initialLevel <= 4
	 }
	public void reset(String newName, int newStudentNumber,
	int newLevel)
	 {
	reset(newName, newStudentNumber); //Student's reset
	 setLevel(newLevel); //Checks 1 <= newLevel <= 4
	 }
	public int getLevel()
	 {
	return level;
	 }
	public void setLevel(int newLevel)
	 {
	if ((1 <= newLevel) && (newLevel <= 4))
	 level = newLevel;
	else
	 {
	 System.out.println("Illegal level!");
	 System.exit(0);
	 }
	 }
	public void writeOutput()
	 {
	super.writeOutput();
	 System.out.println("StudentLevel: " + level);
	 }
	public boolean equals(Ex9_10_Undergraduate otherUndergraduate)
	 {
	return this.equals((Ex9_10_Student) otherUndergraduate) &&
	 (this.level == otherUndergraduate.level);
	 }
}



////////////////////////////////////////////////////////////////////////////


package myPackage;

public class Ex9_10_Staff extends Ex9_10_Person{
	private int payGrade;
	
	public Ex9_10_Staff()
	{
		super();
		payGrade = 0;
	}
	
	public Ex9_10_Staff(String initialName, int initialPayGrade)
	{
		super(initialName);
		payGrade = initialPayGrade;
	}
	
	public int getPayGrade()
	{
		return payGrade;
	}
	
	public void setPayGrade(int newPayGrade)
	{
		if(newPayGrade<1 || newPayGrade>20)
			{
				System.out.println("Wrong Pay Grade");
				System.exit(0);
			}
		else
			payGrade = newPayGrade;
	}
	
	public void writeOutput()
	{
		super.writeOutput();
		System.out.println("Pay Grade: " + getPayGrade());
	}
	
	public boolean equals(Ex9_10_Staff otherStaff)
	 {
		return this.hasSameName(otherStaff) && (this.payGrade == otherStaff.payGrade);
	 }
}



////////////////////////////////////////////////////////////////////////////////////////////////////


package myPackage;

public class Ex9_10_Employee extends Ex9_10_Staff{
	private int employeeId;
	private String department;
	
	public Ex9_10_Employee()
	{
		super();
		employeeId = 0;
		department = "No Department Yet.";
	}
	
	public Ex9_10_Employee(String initialName, int initialPayGrade, int initialEmployeeId, String initialDepartment)
	{
		super(initialName, initialPayGrade);
		employeeId = initialEmployeeId;
		department = initialDepartment;
	}
	
	public int getEmployeeId()
	{
		return employeeId;
	}
	
	public String getDepartment()
	{
		return department;
	}
	
	public void setEmployeeId(int newEmployeeId)
	{
		employeeId = newEmployeeId;
	}
	
	public void setDepartment(String newDepartment)
	{
		department = newDepartment;
	}
	
	public void writeOutput()
	{
		super.writeOutput();
		System.out.println("Emplyee Id: " + getEmployeeId());
		System.out.println("Department: " + getDepartment());
	}
	
	public boolean equals(Ex9_10_Employee otherEmployee)
	 {
		return this.equals((Ex9_10_Staff)otherEmployee) && this.employeeId == otherEmployee.employeeId && this.department == otherEmployee.department;
	 }
}



//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


package myPackage;

public class Ex9_10_Faculty extends Ex9_10_Staff{
	private String title;
	
	public Ex9_10_Faculty()
	{
		super();
		title = "No title yet.";
	}
	
	public Ex9_10_Faculty(String initialName, int initialPayGrade, String initialTitle)
	{
		super(initialName, initialPayGrade);
		title = initialTitle;
	}
	
	public String getTitle()
	{
		return title;
	}
	
	public void setTitle(String newTitle)
	{
		title = newTitle;
	}
	
	public void writeOutput()
	{
		super.writeOutput();
		System.out.println("Title: " + getTitle());
	}
	
	public boolean equals(Ex9_10_Faculty otherFaculty)
	 {
		return this.equals((Ex9_10_Staff)otherFaculty) && this.title == otherFaculty.title;
	 }
}



///////////////////////////////////////////////////////////////////////////////////////////////////


package myPackage;

public class Ex9_10_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ex9_10_Person[] p = new Ex9_10_Person[]
				{new Ex9_10_Faculty("Jiwoo", 15, "Professor of Computer Science"), new Ex9_10_Staff("Jiwoon", 4), new Ex9_10_Undergraduate("Jiwoo",
						202037071, 2), new Ex9_10_Student("Jiyoon", 202030001)};
		
		p[0].writeOutput();
		p[1].writeOutput();
		p[2].writeOutput();
		p[3].writeOutput();		
	}

}

