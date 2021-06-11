import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;


public class FriendBanana_546A{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int k,n,w;
    k = sc.nextInt();
    n = sc.nextInt();
    w = sc.nextInt();
    System.out.println(Math.max(((k * (w*(w+1)/2)) - n),0));
  }
}