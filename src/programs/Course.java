package programs;


public class Course {
	
	public Course[] Prerequisites = new Course[3];
	public String name;
	
	// Default Constructor
	public Course(String name) {
		this.name = name;
		this.Prerequisites = null;
	}
	
	public Course(String name, Course Prereq) {
		this.Prerequisites[0] = Prereq;
		this.name = name;
	}
	
	public Course(String name, Course Prereq1, Course Prereq2) {
		this.Prerequisites[0] = Prereq1;
		this.Prerequisites[1] = Prereq2;
		this.name = name;
	}
	
	public Course(String name, Course Prereq1, Course Prereq2, Course Prereq3) {
		this.Prerequisites[0] = Prereq1;
		this.Prerequisites[1] = Prereq2;
		this.Prerequisites[2] = Prereq3;
		this.name = name;
	}
}
