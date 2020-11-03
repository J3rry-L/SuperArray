import java.util.Arrays;
public class SuperArray{
  private String [] data;
  private int size;

  public SuperArray(){
    data = new String[10];
    size = 0;
  }

  public SuperArray(int initialCapacity){
    data = new String[initialCapacity];
    size = 0;
  }

  public int size(){
    return size;
  }

  public boolean add(String element){
    if (size < data.length){
      data[size] = element;
      size++;
    }
    else{
      resize();
      data[size] = element;
      size++;
    }
    return true;
  }

  public String get(int index){
    return(data[index]);
  }

  public String set(int index, String element){
    String temp = data[index];
    data[index] = element;
    return temp;
  }

  private void resize(){
    String [] temp = new String[data.length * 2];
    for (int i = 0; i< data.length; i++){
      temp[i] = data[i];
    }
    data = temp;
  }

  public boolean isEmpty(){
    return(size == 0);
  }

  public String toString(){
    String[] result = new String[size];
    for (int i = 0; i < size; i++){
      result[i] = data[i];
    }
    return(Arrays.toString(result));
  }

  public boolean contains(String s){
    for (int i = 0; i < size; i++){
      if (data[i].equals(s)){
        return true;
      }
    }
    return false;
  }

  public void clear(){
    for (int i = 0; i < size; i++){
      data[i] = null;
    }
    size = 0;
  }

}
