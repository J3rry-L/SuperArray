import java.util.Arrays;
public class Tester{
  public static void main (String[] args){
    SuperArray array1 = new SuperArray();
    System.out.println(array1.isEmpty());
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
    System.out.println(array1.isEmpty());
    System.out.println(array1.contains("1"));
    System.out.println(array1.contains("21"));
    System.out.println(array1.indexOf("6"));
    System.out.println(array1.indexOf("21"));
    array1.add(3, "bob");
    System.out.println(array1);
    array1.remove(3);
    System.out.println(array1);
    System.out.println(Arrays.toString(array1.toArray()));
    String[] copyArray1 = array1.toArray();
    array1.clear();
    System.out.println(array1.isEmpty());
    System.out.println(array1);
    System.out.println(Arrays.toString(copyArray1));

    SuperArray words = new SuperArray();
   //grouped to save vertical space
   words.add("kani");   words.add("uni");     words.add("ebi");     words.add("una");
   words.add("una");    words.add("ebi");     words.add("kani");    words.add("una");
   words.add("una");    words.add("ebi");     words.add("toro");

   System.out.println(words);
   System.out.println(words.lastIndexOf("kani"));
   Demo.removeDuplicates(words);
   System.out.println(words);

   SuperArray array2 = new SuperArray(5);
   array2.add("1");
   array2.add("2");
   array2.add("3");
   array2.add("4");
   array2.add("4");

   SuperArray array3 = new SuperArray(3);
   array3.add("4");
   array3.add("3");
   array3.add("bob");

   System.out.println(Demo.findOverlap(array2, array3));
   System.out.println(array2.lastIndexOf("4"));
   System.out.println(array2.lastIndexOf("5"));

   SuperArray array4 = new SuperArray(12345);
   array4.add("uno");
   array4.add("dos");
   array4.add("tres");
   array4.add("tres");
   array4.add("oops");
   SuperArray array5 = new SuperArray(5);
   array5.add("uno");
   array5.add("dos");
   array5.add("tres");
   array5.add("tres");
   array5.add("oops");

   System.out.println(array4.equals(array5));
   System.out.println(array5.equals(array4));
   System.out.println(array4.equals(array1));

   try {
     SuperArray error = new SuperArray(-31);
   }
   catch (IllegalArgumentException e){
    e.printStackTrace();
   }

   SuperArray emptyNoError = null;
   try {
     emptyNoError = new SuperArray(0);
   }
   catch (IllegalArgumentException e){
    e.printStackTrace();
   }
   System.out.println(emptyNoError);

   try {
     emptyNoError.get(1);
   }
   catch (IndexOutOfBoundsException e){
    e.printStackTrace();
   }

   try {
     System.out.println(words.get(4));
   }
   catch (IndexOutOfBoundsException e){
    e.printStackTrace();
   }

   try {
     array5.set(5, "should be error");
   }
   catch (IndexOutOfBoundsException e){
    e.printStackTrace();
   }

   try {
     array5.set(3, "cuatro");
     System.out.println(array5);
   }
   catch (IndexOutOfBoundsException e){
    e.printStackTrace();
   }

   try {
     array5.add(6, "should be error");
   }
   catch (IndexOutOfBoundsException e){
    e.printStackTrace();
   }

   try {
     array5.add(5, "cinco");
     System.out.println(array5);
   }
   catch (IndexOutOfBoundsException e){
    e.printStackTrace();
   }

   try {
     array5.remove(6);
   }
   catch (IndexOutOfBoundsException e){
    e.printStackTrace();
   }

   try {
     array5.remove(4);
     System.out.println(array5);
   }
   catch (IndexOutOfBoundsException e){
    e.printStackTrace();
   }
  }
}

/*
Should print:
true
[]
0
[element 0]
1
[element 0, element 1]
2
[element 0, element 1, element 2]
3
[element 0, element 1, element 2, element 3]
4
[element 0, element 1, element 2, element 3, element 4]
5
[element 0, element 1, element 2, element 3, element 4, element 5]
6
[element 0, element 1, element 2, element 3, element 4, element 5, element 6]
7
[element 0, element 1, element 2, element 3, element 4, element 5, element 6, element 7]
8
[element 0, element 1, element 2, element 3, element 4, element 5, element 6, element 7, element 8]
9
[element 0, element 1, element 2, element 3, element 4, element 5, element 6, element 7, element 8, element 9]
10
element 0
element 1
element 2
element 3
element 4
element 5
element 6
element 7
element 8
element 9
[element 0, element 1, element 2, element 3, element 4, element 5, element 6, element 7, element 8, element 9]
element 0
[0, element 1, element 2, element 3, element 4, element 5, element 6, element 7, element 8, element 9]
10
element 1
[0, 1, element 2, element 3, element 4, element 5, element 6, element 7, element 8, element 9]
10
element 2
[0, 1, 2, element 3, element 4, element 5, element 6, element 7, element 8, element 9]
10
element 3
[0, 1, 2, 3, element 4, element 5, element 6, element 7, element 8, element 9]
10
element 4
[0, 1, 2, 3, 4, element 5, element 6, element 7, element 8, element 9]
10
element 5
[0, 1, 2, 3, 4, 5, element 6, element 7, element 8, element 9]
10
element 6
[0, 1, 2, 3, 4, 5, 6, element 7, element 8, element 9]
10
element 7
[0, 1, 2, 3, 4, 5, 6, 7, element 8, element 9]
10
element 8
[0, 1, 2, 3, 4, 5, 6, 7, 8, element 9]
10
element 9
[0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
10
true
[0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
11
true
[0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11]
12
true
[0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12]
13
true
[0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13]
14
true
[0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14]
15
true
[0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15]
16
true
[0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16]
17
true
[0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17]
18
true
[0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18]
19
true
[0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19]
20
false
true
false
6
-1
[0, 1, 2, bob, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19]
[0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19]
[0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19]
true
[]
[0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19]
[kani, uni, ebi, una, una, ebi, kani, una, una, ebi, toro]
6
[kani, uni, ebi, una, toro]
[3, 4]
4
-1
true
true
false
java.lang.IllegalArgumentException: initialCapacity cannot be negative. Given value: -31
        at SuperArray.<init>(SuperArray.java:13)
        at Tester.main(Tester.java:88)
[]
java.lang.IndexOutOfBoundsException: Index out of bound: 1
        at SuperArray.get(SuperArray.java:38)
        at Tester.main(Tester.java:104)
toro
java.lang.IndexOutOfBoundsException: Index out of bound: 5
        at SuperArray.set(SuperArray.java:45)
        at Tester.main(Tester.java:118)
[uno, dos, tres, cuatro, oops]
java.lang.IndexOutOfBoundsException: Index out of bound: 6
        at SuperArray.add(SuperArray.java:90)
        at Tester.main(Tester.java:133)
[uno, dos, tres, cuatro, oops, cinco]
java.lang.IndexOutOfBoundsException: Index out of bound: 6
        at SuperArray.remove(SuperArray.java:104)
        at Tester.main(Tester.java:148)
[uno, dos, tres, cuatro, cinco]
*/
