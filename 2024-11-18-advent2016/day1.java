import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;

public class day1{
  public static String[] parse(String filename){
    try{
      File file = new File(filename);
      Scanner a = new Scanner(file);
      String line = a.nextLine();
      return line.split(", ");
    }catch(Exception e){
      System.out.println("no file");
    }
    return null;
  }
  /* public static int distance(String filename){
    Scanner a = new Scanner(filename);
    int angle = 0;
    int xdist = 0;
    int ydist = 0;
    while (a.hasNext()){

    }
  } */
  public static void main(String[] args){
    System.out.println(Arrays.toString(parse("input.txt")));
  }
}
