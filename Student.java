public class Student
{
	private int age;
	private String grade;
	private int volunteerHours;

	public Student(int theAge, String theGrade, int theVolunteerHours)
	{
		age = theAge;
		grade = theGrade;
		volunteerHours = theVolunteerHours;
	}

	public String toString()
	{
		return "Student with age " + age + " is in Grade " + grade + " and has " + volunteerHours + " volunteer hours";
	}
}