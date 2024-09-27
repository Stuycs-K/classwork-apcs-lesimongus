public class MyArrays{
  public static void main(String[] args) {
    int[] test = {};
    int[] test1 = {1, 2, 3, 4, 5};
    itn[] test2 = {4, 8, 14, 53, 21};
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
      newAry[i] = 
    }
  }
}
