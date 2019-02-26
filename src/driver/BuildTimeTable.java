package driver;

import java.util.ArrayList;
import java.util.Scanner;

import input.InputReader;
import programs.ComputerScience;
import programs.Course;
import programs.Program;

public class BuildTimeTable {
  
  public static InputReader IR = new InputReader();
  
  public static void main(String[] args) {
	  ComputerScience program = IR.read();
	  
	  // Generate the First Year Courses
	  /*
	   * 	  public Course[] FallCourses = {MATA31, CSCA08, CSCA67,
			  CSCB07, CSCB36, MATB41, MATB24, STAB52,
			  CSCC73, CSCC37, CSCC43, CSCC01,
			  CSCD03};
	  
	  public Course[] WinterCourses = {MATA31, CSCA08, CSCA48, 
			  MATA37, MATA22, CSCB09, CSCB63, CSCB58,
			  CSCC69, CSCC63, CSCC24,
			  CSCD01, CSCD03};
	  
	  public Course[] SummerCourses = {CSCA48, MATA37, MATA22,
			  CSCB07, CSCB36, STAB52, MATB24, MATB41,
			  CSCB09, CSCB63, CSCB58,
			  CSCC24, CSCC43, CSCC01, CSCC69, CSCC63}; 
	   */
	  
	  ArrayList<Course> Fall1 = new ArrayList<Course>() ;
	  int Fallindex = 0;

	  while (program.FallCourses[Fallindex].Prerequisites == null){
		  Fall1.add(program.FallCourses[Fallindex]);
		  Fallindex ++;
	  }

	  for (Course item: Fall1) {
		  System.out.println(item.name);
	  }
	  
	  ArrayList<Course> Win1 = new ArrayList<Course>() ;
	  int Winindex = 0;

	  while (program.WinterCourses[Winindex].Prerequisites == null){
		  Win1.add(program.WinterCourses[Winindex]);
		  Winindex ++;
	  }

	  for (Course item: Win1) {
		  System.out.println(item.name);
	  }
  }
}
