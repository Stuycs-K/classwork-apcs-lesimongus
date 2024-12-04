public class ColorDemo{
  public static void main(String[] args){
    for (int r = 0; r < 256; r++){
      for (int b = 0; b < 256; b++){
        System.out.print("\u001b[38;2;"+r+";100;"+b+"mHi ");
      }
    }
    System.out.println();
  }
}
