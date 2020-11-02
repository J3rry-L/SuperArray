import java.util.Arrays;
public class SuperArray{
  private String [] data;
  private int size;

  public SuperArray(){
    data = new String[10];
    size = 0;
  }

  public String toString(){
    return(Arrays.toString(data) + "\t" + "Current Size = " + size);
  }

  public int size(){
    return size;
  }
}
