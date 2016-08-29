 
package kwic;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileNotFoundException;

import java.util.StringTokenizer;
 
public class Read_file{
 

  public void parse(String read_file, LineStorage line_storage_instance){
    try{
      @SuppressWarnings("resource")
	BufferedReader reader = new BufferedReader(new FileReader(read_file));

      String line = reader.readLine();
      while(line != null){
        StringTokenizer string_tokenizer = new StringTokenizer(line);  
        if(string_tokenizer.countTokens() > 0)
          line_storage_instance.insert_line_empty();
        while(string_tokenizer.hasMoreTokens())
          line_storage_instance.add_word_string(string_tokenizer.nextToken(), line_storage_instance.get_count_line() - 1);
        line = reader.readLine();
      }
      
    }catch(FileNotFoundException exc){
      exc.printStackTrace();
      System.err.println("Not open " + read_file + "file.");
      System.exit(1);
    }catch(IOException exc){
      exc.printStackTrace();
      System.err.println("Not read " + read_file + "file.");
      System.exit(1);
    }
  }
 
}
