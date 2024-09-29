public class MyArrays{
  public static void main(String[] args) {
    int[] test = {};
    int[] test1 = {1, 2, 3, 4, 5};
    int[] test2 = {4, 8, 14, 53, 21};
    System.out.println(test);
    System.out.println(arrayToString(test));
    System.out.println(returnCopy(test));
    System.out.println(arrayToString(returnCopy(test)));
    System.out.println(test1);
    System.out.println(arrayToString(test1));
    System.out.println(returnCopy(test1));
    System.out.println(arrayToString(returnCopy(test1)));
    System.out.println(test2);
    System.out.println(arrayToString(test2));
    System.out.println(returnCopy(test2));
    System.out.println(arrayToString(returnCopy(test2)));
    System.out.println(arrayToString(concatArray(test1, test2)));
    System.out.println(arrayToString(concatArray(test2, test1)));
  }
  public static String arrayToString(int[] nums){
    String arrString = "[";
    for (int i = 0; i < nums.length; i++){
      arrString+= nums[i];
      if (i < nums.length-1){
        arrString+= ", ";
      }
    }
    return arrString + "]";
  }
  public static int[] returnCopy(int[] ary){
    int[] newAry = new int[ary.length];
    for (int i = 0; i < ary.length; i++){
      newAry[i] = ary[i];
    }
    return newAry;
  }
  public static int[] concatArray(int[] ary1, int[] ary2){
    int[] newAry = new int[ary1.length + ary2.length];
    for (int i = 0; i < ary1.length; i++){
      newAry[i] = ary1[i];
    }
    for (int i = ary1.length; i < ary2.length; i++){
      newAry[i] = ary2[i - ary1.length];
    }
    return newAry;
  }
}
