import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;

public class day2{
  public static String password(String filename){
    try{
      File file = new File(filename);
      Scanner a = new Scanner(file);
      String line;
      int[][] keypad = {{1,2,3}, {4,5,6}, {7,8,9}};
      int x = 1;
      int y = 1;
      String word = "";
      while (a.hasNextLine()){
        line = a.nextLine();
        for (int i = 0; i < line.length(); i++){
          if (line.charAt(i) == 'U'){
            if (y>0){
              y--;
            }
          }
          if (line.charAt(i) == 'D'){
            if (y<2){
              y++;
            }
          }
          if (line.charAt(i) == 'R'){
            if (x<2){
              x++;
            }
          }
          if (line.charAt(i) == 'L'){
            if (x>0){
              x--;
            }
          }
        }
        word+= keypad[x][y];
      }
      return word;
    }catch(Exception e){
      System.out.println("no file");
    }
    return null;
  }
  public static void main(String[] args){
    System.out.println(password("input1.txt"));
  }
}
