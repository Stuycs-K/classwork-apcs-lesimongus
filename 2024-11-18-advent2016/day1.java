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
  public static int distance(String[] directions){
    int angle = 0;
    int xdist = 0;
    int ydist = 0;
    for (int i = 0; i < directions.length; i++){
      String direction = directions[i].substring(0, 1);
      int magnitude = Integer.parseInt(directions[i].substring(1));
      if (direction.equals("R")){
        angle+= 90;
      }
      else{
        angle-= 90;
      }
      if (angle == 360 || angle == -360){
        angle = 0;
      }
      if (angle == 0){
        ydist+= magnitude;
      }
      if (angle == 90 || angle == -270){
        xdist+= magnitude;
      }
      if (angle == 180 || angle == -180){
        ydist-= magnitude;
      }
      if (angle == 270 || angle == -90){
        xdist-= magnitude;
      }
    }
    return Math.abs(xdist) + Math.abs(ydist);
  }
  public static void main(String[] args){
    System.out.println(distance(parse("input.txt")));
  }
}
