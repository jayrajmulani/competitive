import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;


public class WrongSubstraction_977A{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int k,n;
    n = sc.nextInt();
    k = sc.nextInt();
    for(int i=0;i<k;i++){
        if(n%10 == 0) n/=10;
        else          n--;
    }
    System.out.println(n);   
  }
}