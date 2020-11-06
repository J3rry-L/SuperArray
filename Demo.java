public class Demo{
  public static void removeDuplicates(SuperArray s){
    for (int i = 0; i < s.size();){
      if (s.indexOf(s.get(i)) == i){
        i++;
      }
      else{
        s.remove(i);
      }
    }
  }

  public static SuperArray findOverlap(SuperArray a, SuperArray b){
    SuperArray result = new SuperArray(a.size());
    for (int i = 0; i < a.size(); i++){
      if (b.indexOf(a.get(i)) != -1){
        result.add(a.get(i));
      }
    }
    removeDuplicates(result);
    return result;
  }

  public static SuperArray zip(SuperArray a, SuperArray b){
    SuperArray result = new SuperArray(a.size() + b.size());
    int min = Math.min(a.size(), b.size());
    for (int i = 0; i < min; i++){
      result.add(a.get(i));
      result.add(b.get(i));
    }
    if (min == a.size()){
      for(int i = min; i < b.size(); i++){
        result.add(b.get(i));
      }
    }
    else{
      for(int i = min; i < a.size(); i++){
        result.add(a.get(i));
      }
    }
    return result;
  }

  public static void main(String[]args){
    SuperArray words = new SuperArray();
    //grouped to save vertical space
    words.add("kani");   words.add("uni");     words.add("ebi");     words.add("una");
    words.add("una");    words.add("ebi");     words.add("kani");    words.add("una");
    words.add("una");    words.add("ebi");     words.add("toro");

    System.out.println(words);
    removeDuplicates(words);
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

    System.out.println(findOverlap(array2, array3));
    System.out.println(zip(array2, array3));
    System.out.println(zip(array3, array2));
  }
}
