package input;

public class ArrayPrinter {
	
  public String printArray(String[] args) {
	String result = "";
	for (int i = 0; i < args.length; i++) {
	  result += Integer.toString(i) + ". " + args[i] + "\n";
	}
	return result;
  }
}
