import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
public class TriangleTester{
  public static boolean isTriangle(String sides){
    Scanner input = new Scanner(sides);
    int[] side = new int[3];
    int i = 0;
    while (input.hasNext()){
      side[i]=input.nextInt();
      i++;
    }
    if (side[0] + side[1] < side[2]){
      return false;
    }
    if (side[1]+side[2] < side[0]){
      return false;
    }
    if (side[0] + side[2] < side[1]){
      return false;
    }
    return true;
  }
  public static int countTrianglesA(String filename){
    try{
      File file = new File(filename);
      Scanner input = new Scanner(file);
      int result = 0;
      while(input.hasNextLine()){
        if(isTriangle(input.nextLine())){
          result++;
        }
      }
      return result;
    } catch(FileNotFoundException ex){
        System.out.println("file not found");
        return;
    }
  }
  public static void main(String[] args){
    System.out.println(countTrianglesA("inputTri.txt"));
  }
}
