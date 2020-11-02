public class Tester{
  public static void main (String[] args){
    SuperArray array1 = new SuperArray();
    System.out.println(array1);
    System.out.println(array1.size());
    for (int i = 0; i < 10; i++){
      array1.add("element " + i);
      System.out.println(array1);
      System.out.println(array1.size());
    }
    for (int i = 0; i < 10; i++){
      System.out.println(array1.get(i));
    }
    System.out.println(array1);
    for (int i = 0; i < 10; i++){
      System.out.println(array1.set(i, String.valueOf(i)));
      System.out.println(array1);
      System.out.println(array1.size());
    }
    for (int i = 10; i < 20; i++){
      System.out.println(array1.add(String.valueOf(i)));
      System.out.println(array1);
      System.out.println(array1.size());
    }
  }
}
