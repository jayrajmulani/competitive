import java.util.Scanner;
public class Tran_116A{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int a,b;
    int current = 0, max = -1;
    for(int i=0;i<n;i++){
        a = sc.nextInt();
        b = sc.nextInt();
        current = current - a + b ;
        // System.out.println(current);
        if(current > max) max = current;
    }
    System.out.println(max);
  }
}