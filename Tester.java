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

  }
}

/*
Should print:
[null, null, null, null, null, null, null, null, null, null]    Current Size = 0
0
[element 0, null, null, null, null, null, null, null, null, null]       Current Size = 1
1
[element 0, element 1, null, null, null, null, null, null, null, null]  Current Size = 2
2
[element 0, element 1, element 2, null, null, null, null, null, null, null]     Current Size = 3
3
[element 0, element 1, element 2, element 3, null, null, null, null, null, null]        Current Size = 4
4
[element 0, element 1, element 2, element 3, element 4, null, null, null, null, null]   Current Size = 5
5
[element 0, element 1, element 2, element 3, element 4, element 5, null, null, null, null]      Current Size = 6
6
[element 0, element 1, element 2, element 3, element 4, element 5, element 6, null, null, null] Current Size = 7
7
[element 0, element 1, element 2, element 3, element 4, element 5, element 6, element 7, null, null]    Current Size = 8
8
[element 0, element 1, element 2, element 3, element 4, element 5, element 6, element 7, element 8, null]       Current Size = 9
9
[element 0, element 1, element 2, element 3, element 4, element 5, element 6, element 7, element 8, element 9]  Current Size = 10
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
[element 0, element 1, element 2, element 3, element 4, element 5, element 6, element 7, element 8, element 9]  Current Size = 10
element 0
[0, element 1, element 2, element 3, element 4, element 5, element 6, element 7, element 8, element 9]  Current Size = 10
10
element 1
[0, 1, element 2, element 3, element 4, element 5, element 6, element 7, element 8, element 9]  Current Size = 10
10
element 2
[0, 1, 2, element 3, element 4, element 5, element 6, element 7, element 8, element 9]  Current Size = 10
10
element 3
[0, 1, 2, 3, element 4, element 5, element 6, element 7, element 8, element 9]  Current Size = 10
10
element 4
[0, 1, 2, 3, 4, element 5, element 6, element 7, element 8, element 9]  Current Size = 10
10
element 5
[0, 1, 2, 3, 4, 5, element 6, element 7, element 8, element 9]  Current Size = 10
10
element 6
[0, 1, 2, 3, 4, 5, 6, element 7, element 8, element 9]  Current Size = 10
10
element 7
[0, 1, 2, 3, 4, 5, 6, 7, element 8, element 9]  Current Size = 10
10
element 8
[0, 1, 2, 3, 4, 5, 6, 7, 8, element 9]  Current Size = 10
10
element 9
[0, 1, 2, 3, 4, 5, 6, 7, 8, 9]  Current Size = 10
10
true
[0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, null, null, null, null, null, null, null, null, null]        Current Size = 11
11
true
[0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, null, null, null, null, null, null, null, null]  Current Size = 12
12
true
[0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, null, null, null, null, null, null, null]    Current Size = 13
13
true
[0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, null, null, null, null, null, null]      Current Size = 14
14
true
[0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, null, null, null, null, null]        Current Size = 15
15
true
[0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, null, null, null, null]  Current Size = 16
16
true
[0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, null, null, null]    Current Size = 17
17
true
[0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, null, null]      Current Size = 18
18
true
[0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, null]        Current Size = 19
19
true
[0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19]  Current Size = 20
20
*/
