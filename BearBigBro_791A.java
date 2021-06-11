import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;


public class BearBigBro_791A{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int k,n,count = 0;
    k = sc.nextInt();
    n = sc.nextInt();
    while(k<=n){
      k*=3;
      n*=2;
      count++;
    }
    System.out.println(count);
  }
}