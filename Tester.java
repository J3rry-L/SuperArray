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
*/
