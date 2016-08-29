package kwic;
public class CircularShifter{
private LineStorage shifts_line;
public void shift_logic(LineStorage lines){
    shifts_line = new LineStorage(); 
    int i=0;
    int j=0;
    while (i < lines.get_count_line())
    {
      String[] line = lines.get_line(i);
      while(j < line.length){
        shifts_line.insert_line_empty();
        for(int k = j; k < (line.length + j); k++)
          shifts_line.add_word_string(line[k % line.length], shifts_line.get_count_line() - 1);
        i++;
        j++;
      }
    }
  }
  public char get_char_shift(int position, int word, int line){
    return shifts_line.get_characters(position, word, line);
  }
  public int get_char_count_shift(int word, int line){
    return shifts_line.get_count_character(word, line);
  }
  public String[] get_line_shift(int line){
	    return shifts_line.get_line(line);
	  }
	  public String get_line_string_shift(int line){
	    return shifts_line.get_line_string_format(line);
	  }
	  public int get_line_count_shift(){
	    return shifts_line.get_count_line();
	  }
  public String get_word_shift(int word, int line){
    return shifts_line.get_word(word, line);
  }
  public int get_word_count_shift(int line){
    return shifts_line.get_count_word(line);
  }

}