public class MyArrays{
  public static void main(String[] args) {
    int[] array1 = {1, 2, 3, 4, 5};
    System.out.println(arrayToString(array1));
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
