import java.util.Scanner;
public class Game{
  public static void main(String[] args){
    Adventurer player = new Fighter("you", 10,10, 50);
    Adventurer enemy = new CodeWarrior("the enemy");
    while (player.getHP() > 0 && enemy.getHP() > 0){
      System.out.println(player + ", " + player.getHP() + "/" + player.getmaxHP() + "HP, " + player.getSpecial() + "/" + player.getSpecialMax() + " " + player.getSpecialName());
    }
  }
}
