import java.util.Scanner;
public class Elephant_617A{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    System.out.println(n>5 ? ((n/5)+ (n%5==0 ? 0:1)) : 1);
  }
}