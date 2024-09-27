public class MyArrays{
  public static void main(String[] args) {
    System.out.println(arrayToString([1, 2, 3, 4]));
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
}
