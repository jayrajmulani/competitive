import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;


public class PotionMaking{
    private static int gcd(int a,int b){
        if(b==0){
            return a;
        }
        return gcd(b,a%b);
    }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    for(int i=0;i<n;i++){
        int per = sc.nextInt();
        int g = gcd(per,100);
        // System.out.println("GCD of 100" + " and  " + per + " = " + g);
        System.out.println(100/g);
    }
   
  }
}