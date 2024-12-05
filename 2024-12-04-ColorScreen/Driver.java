import java.util.*;
public class Driver{

  public static void border(int row, int column){
    for (int i = 0; i < row; i++){
      for (int j = 0; j < column; j++){
        if (i == 0 || i == row - 1 || j == 0 || j == column - 1){
          Text.color(Text.background(Text.RED));
          System.out.print(".");
          Text.color(Text.background(Text.BLACK));
        }
        else{
          System.out.print(" ");
        }
      }
      System.out.println();
    }
  }
  public static int[] rand(int size){
    int[] random = new int[size];
    for (int i = 0; i < size; i++){
      random[i] = (int)(Math.random() * 100);
    }
    return random;
  }
  public static void main(String[] args){
    border(30, 80);
    int[] rando = rand(3);
    int wherePlace = 80 / 3;
    for (int i = 0; i < 3; i++){
      Text.go(wherePlace * (i+1), 1);
      if (rando[i] < 25){
        Text.color(Text.RED, Text.background(Text.BLACK),Text.BRIGHT);
      }
      if (rando[i] > 75){
        Text.color(Text.GREEN, Text.background(Text.BLACK), Text.BRIGHT);
      }
      System.out.print(rando[i]);
      Text.color(Text.WHITE);
    }
  }

}
