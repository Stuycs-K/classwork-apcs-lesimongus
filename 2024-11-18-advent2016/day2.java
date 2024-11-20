import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;

public class day2{
  public static String[] parse(String filename){
    try{
      File file = new File(filename);
      Scanner a = new Scanner(file);
      int length = 0;
      while (a.hasNextLine()){
        length++;
        a.nextLine();
      }
      String[] directions = new String[length];
      int i = 0;
      while (a.hasNextLine()){
        String direction = a.nextLine();
        System.out.println(direction);
        directions[i] = direction;
        i++;
      }
      return directions;
    }catch(Exception e){
      System.out.println("no file");
    }
    return null;
  }
  public static void main(String[] args){
    System.out.println(Arrays.toString(parse("input1.txt")));
  }
}
