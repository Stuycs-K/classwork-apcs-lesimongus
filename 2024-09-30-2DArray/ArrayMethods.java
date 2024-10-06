public class ArrayMethods{
  //Simon Liu: simonl105@nycstudents.net
  //Adi Murgescu: adrianm199@nycstudents.net
  public static void main(String[] args){
    int[][] test = {{}, {}};
    int[][] test1 = {{1,2,3}, {23, 4, 7}, {16, 15, 3}};
    int[][] test2 = {{1, 2}, {2, 7, 5, 6}, {}};
    int[][] test3 = {{1, 2, 3}, {4, 5, 6}};
    int[][] test4 = {{3, 5, 8}, {5, 9, 12}, {11, 15, 19}, {41, 2, 13}};
    System.out.println(arrToString(test));
    System.out.println(arrToString(test1));
    System.out.println(arrToString(test2));
    System.out.println(arrToString(test3));
    System.out.println(arrToString(test4));
    System.out.println(arr2DSum(test));
    System.out.println(arr2DSum(test1));
    System.out.println(arr2DSum(test2));
    System.out.println(arr2DSum(test3));
    System.out.println(arr2DSum(test4));
    System.out.println(arrToString(swapRC(test1)));
    System.out.println(arrToString(swapRC(test3)));
    System.out.println(arrToString(swapRC(test4)));
    int[][] test5 = {{3, 5, -8}, {-1, -5, 6}, {1, 2, -3}};
    int[][] negativeReplace = replaceNegative(test5);
    System.out.println(arrToString(negativeReplace));
  }
  public static String arrToString(int[] ary){
    String arrString = "[";
    for (int i = 0; i < ary.length; i++){
      arrString+= ary[i];
      if (i < ary.length-1){
        arrString+= ", ";
      }
    }
    return arrString + "]";
  }
  //3. Write arrToString, with a 2D array parameter.
  //Note: Different parameters are allowed with the same function name.
  /**Return a String that represets the 2D array in the format:
    * "[[2, 3, 4], [5, 6, 7], [2, 4, 9]]"
    * Note the comma+space between values, and between arrays
    * You are encouraged to notice that you may want to re-use
    * previous code, but you should NOT duplicate that code. (Don't copy/paste or retype it)
    */
  public static String arrToString(int[][]ary){
    String output = "[";
    for (int i = 0; i < ary.length; i++){
      output += arrToString(ary[i]);
      if (i < ary.length-1){
        output+= ", ";
      }
    }
    return output + "]";
  }

  /*Return the sum of all of the values in the 2D array */
  public static int arr2DSum(int[][]nums){
    //use a nested loop to solve this
    int arrSum = 0;
    for (int i = 0; i < nums.length; i++){
      for (int j = 0; j < nums[i].length; j++){
        arrSum+= nums[i][j];
      }
    }
    return arrSum;//place holder return value so it compiles.
  }

  /**Rotate an array by returning a new array with the rows and columns swapped.
    * You may assume the array is rectangular and neither rows nor cols is 0.
    * e.g. swapRC({{1,2,3},{4,5,6}}) returns {{1,4},{2,5},{3,6}}
    */
  public static int[][] swapRC(int[][]nums){
    int[][] swapped = new int[nums[0].length][nums.length];
    for (int i = 0; i < nums.length; i++){
      for (int j = 0; j < nums[i].length; j++){
        swapped[j][i] = nums[i][j];
      }
    }
    return swapped;
  }
  //3. Modify a given 2D array of integer as follows:
  //Replace all the negative values:
  //-When the row number is the same as the column number replace
  //that negative with the value 1
  //-All other negatives replace with 0
  public static void replaceNegative(int[][] vals){
    for (int i = 0; i < vals.length; i++){
      for (int j = 0; j < vals[i].length; j++){
        if (vals[i][j] < 0){
          if (i == j){
            vals[i][j] = 1;
          }
          else{
            vals[i][j] = 0;
          }
        }
      }
    }
  }

  //4. Make a copy of the given 2d array.
  //When testing : make sure that changing the original does NOT change the copy.
  //DO NOT use any built in methods that "copy" an array.
  //You SHOULD write a helper method for this.
  //If you don't see a good way to do that, you should stop and look at prior methods.
  public static int[][] copy(int[][] nums){
    int[][] newArr = new int[nums.length][];
    for (int i = 0; i < nums.length; i++){
      newArr[i] = new int[nums[i].length];
      for (int j = 0; j < nums[i].length; j++){
        newArr[i][j] = nums[i][j];
      }
    }
    return newArr;
  }
}
