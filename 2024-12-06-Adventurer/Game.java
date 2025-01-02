import java.util.Scanner;
public class Game{
  public static void main(String[] args){
    Scanner userInput = new Scanner(System.in);
    String username = userInput.nextLine();
    Adventurer player = new Fighter(username, 10,10, 50);
    Adventurer enemy = new CodeWarrior("the enemy");
    while (player.getHP() > 0 && enemy.getHP() > 0){
      System.out.println(player + ", " + player.getHP() + "/" + player.getmaxHP() + "HP, " + player.getSpecial() + "/" + player.getSpecialMax() + " " + player.getSpecialName());
      System.out.println(enemy + ", " + enemy.getHP() + "/" + enemy.getmaxHP() + "HP, " + enemy.getSpecial() + "/" + enemy.getSpecialMax() + " " + enemy.getSpecialName());
      System.out.println("Type: (a)ttack / (sp)ecial / (su)pport / quit");
      String input = userInput.nextLine();
      if (input.equals("a")){
        System.out.println(player.attack(enemy));
      }
      else if (input.equals("sp")){
        System.out.println(player.specialAttack(enemy));
      }
      else if (input.equals("su")){
        System.out.println(player.support());
      }
      else if (input.equals("quit")){
        System.exit(0);
      }
      else{
        System.out.println("not a valid input, try again");
      }
      int enemyAction = (int)(Math.random() * 3);
      if (enemyAction == 0){
        System.out.println(enemy.attack(player));
      }
      if (enemyAction == 1){
        System.out.println(enemy.specialAttack(player));
      }
      if (enemyAction == 2){
        System.out.println(enemy.support());
      }
    }
    if (player.getHP() > 0){
      System.out.println(player + " won!");
    }
    else{
      System.out.println(player + " lost...");
    }
  }
}
