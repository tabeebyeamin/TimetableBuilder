package input;

import java.util.Hashtable;
import java.util.Scanner;

import programs.ComputerScience;
import programs.Program;

public class InputReader {
  // an array holding the strands
  public static String[] Strands = {"Computer Science", "Mathematics", "Statistics"};
  public static Hashtable<String, Hashtable<String, String>> StrandsTable
  = new Hashtable<String, Hashtable<String, String>>();
  
  public static ComputerScience CS = new ComputerScience();
  
  // This will hold more programs later
  public static ComputerScience[][] programs = {{ CS }};
  
  
  public static ArrayPrinter AP = new ArrayPrinter();
	
  public ComputerScience read() {
	Hashtable<String, String> CSPrograms = new Hashtable<String, String>();
	Hashtable<String, String> MathPrograms = new Hashtable<String, String>();
	Hashtable<String, String> StatsPrograms = new Hashtable<String, String>();
	
	
	
	CSPrograms.put("MAJ", "MAJOR");
	CSPrograms.put("MIN", "MINOR");
	
	StrandsTable.put("CS", CSPrograms);
	
	// System.out.println(StrandsTable);
	
	Scanner in = new Scanner(System.in);
    System.out.print("Please Select Your Strand:\n" + AP.printArray(Strands));
    int strand_num = Integer.parseInt(in.nextLine());
    System.out.println("Which program in " + Strands[strand_num] + "\n0. Specialist\n1. Major");
    int program_num = Integer.parseInt(in.nextLine());
    return programs[strand_num][program_num];
  }
}
