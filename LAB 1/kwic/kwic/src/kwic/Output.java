package kwic;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
 
import java.nio.file.Paths;

 public class Output{
   
	  final static Charset ENCODING = StandardCharsets.UTF_8;
 
  
	public void writeLargerTextFile( Alphabetizer alphabetizer,String aFileName)throws IOException {
	    Path path = Paths.get(aFileName);
	    try (BufferedWriter writer = Files.newBufferedWriter(path, ENCODING)){
	    	 for(int i = 0; i < alphabetizer.get_line_count_alphabet(); i++)
	    	    {
	        writer.write(alphabetizer.get_line_string_alphabet(i));
	        writer.newLine();
	    	    }
	    	 }
	  }
}