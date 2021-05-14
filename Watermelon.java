import java.util.Scanner;

public class Watermelon{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    String divide =  (n>2 && n%2==0) ? "YES" : "NO";
    System.out.println(divide);
  }

}
