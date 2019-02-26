package programs;

import java.util.Hashtable;

public class ComputerScience{
	// Map a program to an Array of Courses
	 // public static Hashtable<Hashtable<String, String>, String> programTable = new 
		  //    Hashtable<Hashtable<String, String>, String>();
	  
	  // A level courses
	  
	  public Course MATA31 = new Course("MATA31");
	  public Course CSCA08 = new Course("CSCA08");
	  public Course CSCA67 = new Course("CSCA67");
	  
	  public Course MATA22 = new Course("MATA22");
	  
	  public Course MATA37 = new Course("MATA37",MATA31, CSCA67);
	  public Course CSCA48 = new Course("CSCA48",CSCA08);
	  
	  // B Level Courses
	  
	  
	  public Course CSCB07 = new Course("CSCB07",CSCA48);
	  public Course CSCB09 = new Course("CSCB09",CSCA48);
	  public Course CSCB58 = new Course("CSCB58",CSCA48);
	  public Course CSCB36 = new Course("CSCB36",CSCA48, CSCA67);
	  
	  public Course MATB41 = new Course("MATB41",MATA22, MATA31);
	  public Course MATB24 = new Course("MATB24",MATA22);
	  public Course CSCB63 = new Course("CSCB36",CSCB36);
	  public Course STAB52 = new Course("STAB52",MATA37);
	  
	  // C Levels
	  
	  public Course CSCC01 = new Course("CSCC01",CSCB07, CSCB09);
	  public Course CSCC24 = new Course("CSCC24",CSCB07, CSCB09);
	  public Course CSCC43 = new Course("CSCC43",CSCB09, CSCB63);
	  public Course CSCC69 = new Course("CSCC69",CSCB58, CSCB07, CSCB09);
	  
	  public Course CSCC63 = new Course("CSCC63",CSCB36, CSCB63);
	  public Course CSCC73 = new Course("CSCC73",CSCB63, STAB52);
	  public Course CSCC37 = new Course("CSCC37",MATA22, MATA37);
	  
	  // D Levels
	  
	  public Course CSCD01 = new Course("CSCD01",CSCC01);
	  public Course CSCD03 = new Course("CSCD03");
	  
	  // Comprehensive Only
	  public Course CSCD37 = new Course("CSCD37",CSCC37);
	  
	  public Course[] FallCourses = {MATA31, CSCA08, CSCA67,
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
}
