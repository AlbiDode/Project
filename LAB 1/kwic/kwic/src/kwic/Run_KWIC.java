package kwic;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
public class Run_KWIC{
	static String user_input_file="";
	static String user_output_file="";
	static LineStorage lines = new LineStorage();
	static Read_file read_file = new Read_file();
	static CircularShifter shifter = new CircularShifter();
	static Alphabetizer alphabetizer = new Alphabetizer();
	static Output output = new Output();
	private static Scanner user_input;
   public void execute(String file) throws IOException{
   
    read_file.parse(file, lines);
    shifter.shift_logic(lines);
    alphabetizer.alphabet(shifter);
     
  }
 
  @SuppressWarnings("resource")
public static void main(String[] args) throws IOException{
 
    Run_KWIC run_KWIC = new Run_KWIC();
    System.out.println("Insert read_file file path: ");
    user_input = new Scanner( System.in );
    user_input_file = user_input.next( );
 
    System.out.println("Insert output file path: ");
    user_output_file = new Scanner( System.in ).next( );
    run_KWIC.execute(user_input_file);
    output.writeLargerTextFile(alphabetizer,user_output_file);
  }
  
 
}