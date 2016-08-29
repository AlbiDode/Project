package kwic;  
public class Alphabetizer{
private int sorted_shift_array[];
private CircularShifter circular_shifter_instance;
public void alphabet(CircularShifter shift_instance){
    circular_shifter_instance = shift_instance;
    sorted_shift_array = new int[circular_shifter_instance.get_line_count_shift()];
    int s=0;
    while (s < sorted_shift_array.length)
    {
      sorted_shift_array[s] = s;
      s++;
    } 
    for(int i = (sorted_shift_array.length / 2 - 1); i >= 0; i--)  
      sort_logic_bottom_up(i, sorted_shift_array.length);
    int o=(sorted_shift_array.length - 1);
    do{  
      int tmp = sorted_shift_array[0];
      sorted_shift_array[0] = sorted_shift_array[o];
      sorted_shift_array[o] = tmp;
      sort_logic_bottom_up(0, o);  
      o--;
    }while(o>= 1);
  }
private void sort_logic_bottom_up(int root, int bottom){    
    int max_child = root * 2 + 1;
    while(max_child < bottom){
      if((max_child + 1) < bottom)
        if(circular_shifter_instance.get_line_string_shift(sorted_shift_array[max_child + 1]).compareTo(
          circular_shifter_instance.get_line_string_shift(sorted_shift_array[max_child])) > 0)
          max_child++;
      if(circular_shifter_instance.get_line_string_shift(sorted_shift_array[root]).compareTo(circular_shifter_instance.get_line_string_shift(sorted_shift_array[max_child])) < 0){
        int tmp = sorted_shift_array[root];
        sorted_shift_array[root] = sorted_shift_array[max_child];
        sorted_shift_array[max_child] = tmp;
        root = max_child;
        max_child = root * 2 + 1;
      }else
        break;
    }    
  }
public String[] get_line_alphabet(int position_line){
    return circular_shifter_instance.get_line_shift(sorted_shift_array[position_line]);
  }
public String get_line_string_alphabet(int position_line){
    return circular_shifter_instance.get_line_string_shift(sorted_shift_array[position_line]);
  }
public int get_line_count_alphabet(){
    return circular_shifter_instance.get_line_count_shift();
  }
}