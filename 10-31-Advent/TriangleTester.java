import java.util.Scanner;
public class TriangleTester{
  public static void main(String[] args){
    Scanner sc1 = new Scanner("This is a bunch of words");
    while (sc1.hasNext()){
      System.out.println(sc1.next());
    }
    Scanner sc2 = new Scanner("10.0 1.04 99.0 -3.0 4.2");
    double sc2sum =0;
    while (sc2.hasNextDouble()){
      sc2sum+= sc2.nextDouble();
    }
    System.out.println(sc2sum);
  }
}
