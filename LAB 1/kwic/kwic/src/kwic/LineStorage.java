package kwic;
import java.util.ArrayList;
 
public class LineStorage{
 

  private ArrayList lines_array = new ArrayList();

  public char get_characters(int character_position, int position_word, int position_line){
    return ((String) ((ArrayList) lines_array.get(position_line)).get(position_word)).charAt(character_position);
  }
 

  public int get_count_character(int position_word, int position_line){
    return ((String) ((ArrayList) lines_array.get(position_line)).get(position_word)).length();
  }

  public String get_word(int word, int line){
    return (String) ((ArrayList) lines_array.get(line)).get(word);
  }
 

 
 
  public int get_count_word(int position_line){
    return ((ArrayList) lines_array.get(position_line)).size();
  }
 
 
  public String[] get_line(int position_line){
    ArrayList current_line = (ArrayList) lines_array.get(position_line);
    String[] line_array_string = new String[current_line.size()];
    for(int i = 0; i < line_array_string.length; i++)
      line_array_string[i] = (String) current_line.get(i);
    return line_array_string;
  }

 
  public String get_line_string_format(int position_line){
    ArrayList take_current_line = (ArrayList) lines_array.get(position_line);
    int line_size = take_current_line.size();

    int length_of_string = 0;
    for(int i = 0; i < line_size; i++)
      length_of_string += get_word(i, position_line).length();
    length_of_string += line_size - 1;

    char[] swap_array = new char[length_of_string];
    int loop_swap = 0;
    for(int i = 0; i < line_size; i++){
      get_word(i, position_line).getChars(0, get_word(i, position_line).length(), swap_array, loop_swap);
      loop_swap += get_word(i, position_line).length();
      if(i != (line_size - 1))
        swap_array[loop_swap++] = ' ';
    }

    return new String(swap_array);
  }

  public int get_count_line(){
    return lines_array.size();
  }

  public void add_word(char[] array_of_chars, int position_line){
    add_word_string(new String(array_of_chars), position_line);
  }

 

  public void add_word_string(String chars_as_string, int position_line){
    ArrayList add_word_list = (ArrayList) lines_array.get(position_line);
    add_word_list.add(chars_as_string);
  }
 
  public void insert_line_empty(){
    ArrayList new_empty_line = new ArrayList();
    lines_array.add(new_empty_line);
  }



}
