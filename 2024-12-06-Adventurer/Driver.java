public class Driver{
  public static void main(String[] args){
    Adventurer p = new Fighter("Mark",15, 20, 100);
    Adventurer p1 = new Fighter("Bob");
    System.out.println(p);
    System.out.println(p1);
    System.out.println(p.getSpecialName());
    System.out.println(p1.getSpecial());
    System.out.println(p.attack(p1));
    System.out.println(p.support(p1));
    System.out.println(p1.support());
    System.out.println(p1.specialAttack(p));
  }
}
